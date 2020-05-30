/**
 * Checking: Holds information and has methods for a Checking account
 * 
 * @author Darryl Karney
 * @version 25Jul2018
 */

public class Checking extends BankingAccount{

	public Checking() {
		super(AccountTypes.CHECKING);
	}

	@Override
	public String getAccountType() {
		return super.getType();
	}

	@Override
	public double getAccountBalance() {
		return super.getBalance();
	}

	@Override
	public void depositAmount(double amount) {
		super.setBalance(super.getBalance() + amount);
	}

	@Override
	public void withdrawAmount(double amount) {
		super.setBalance(super.getBalance() - amount);
	}

}
