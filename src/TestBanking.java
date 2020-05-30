import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * TestBanking: Tests the banking classes
 * 
 * @author Darryl Karney
 * @version 25Jul2018
 */

public class TestBanking {

	public static void main(String[] args) {
		//Instantiate variables
		AccountInfo accountInfo = new AccountInfo();
		AccountOwner accountOwner = new AccountOwner();
		Savings savings = new Savings();
		Checking checking = new Checking();
		Mortgage mortgage = new Mortgage(87000, 360);
		
		//set accountInfo attributes
		accountInfo.setAccoungId("1");
		accountInfo.setAccountOwner(accountOwner);
		accountInfo.addAccount(savings);
		accountInfo.addAccount(checking);
		accountInfo.addAccount(mortgage);
		
		//set accountOwner attributes
		accountOwner.setFirstName("Jane");
		accountOwner.setLastName("Doe");
		accountOwner.setAddress("123 Main St.\nSan Diego, CA 60452");
		
		//test savings methods
		savings.depositAmount(5000);
		savings.withdrawAmount(1000);
		
		//test checking methods
		checking.depositAmount(1000);
		checking.withdrawAmount(500);
		
		//check mortgage method
		mortgage.applyPayment(635);
		
		try {			
			//Print object to file
			FileOutputStream fileOut = new FileOutputStream(System.getProperty("java.io.tmpdir") + File.separator + "BankStatement.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeBytes("\n" + accountOwner.getFirstName() + ", " + accountOwner.getLastName() + "\n");
			out.writeBytes(accountOwner.getAddress() + "\n----------------------------------\n\n");
			out.writeBytes("BANKING        Balance     APY\n----------------------------------\n\n");
			out.writeBytes(checking.getAccountType() + "       $" + checking.getAccountBalance() + "      0.75\n");
			out.writeBytes(savings.getAccountType() + "        $" + savings.getAccountBalance() + "     0.5\n");
			out.writeBytes("\n----------------------------------\n");
			out.writeBytes("Banking Balance: $" + (checking.getAccountBalance() + savings.getAccountBalance()));
			out.writeBytes("\n----------------------------------\n\n\n");
			out.writeBytes("----------------------------------\nLOAN       Balance     Loan Amount     Rate     Term(mos.)\n");
			out.writeBytes("\n----------------------------------\n\n");
			out.writeBytes(mortgage.getAccountType() + "   $" + mortgage.getAccountBalance() + "    $" + mortgage.getInitialAmount() + "         4.5      " + mortgage.getTermInMonths());
			out.writeBytes("\n\n----------------------------------\n");
			out.writeBytes("Loan Balance: ($" + mortgage.getAccountBalance() + ")\n----------------------------------");
			out.close();
			fileOut.close();
		} catch(IOException ioex) {
			ioex.printStackTrace();
		}
	}

}
