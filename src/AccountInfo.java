import java.util.ArrayList;
import java.util.List;

/**
 * AccountInfo: Holds information and has methods for an account
 * 
 * @author Darryl Karney
 * @version 25Jul2018
 */

public class AccountInfo {
	private String accoungId;
	private AccountOwner accountOwner;
	private List<Account> accounts = new ArrayList<Account>();
	
	/**
	 * @return the accoungId
	 */
	public String getAccoungId() {
		return accoungId;
	}
	
	/**
	 * @param accoungId the accoungId to set
	 */
	public void setAccoungId(String accoungId) {
		this.accoungId = accoungId;
	}
	
	/**
	 * @return the accountOwner
	 */
	public AccountOwner getAccountOwner() {
		return accountOwner;
	}
	
	/**
	 * @param accountOwner the accountOwner to set
	 */
	public void setAccountOwner(AccountOwner accountOwner) {
		this.accountOwner = accountOwner;
	}
	
	/**
	 * @return the accounts
	 */
	public List<Account> getAccounts() {
		return accounts;
	}
	
	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	/**Adds the passed account to the accounts list
	 * 
	 * @param account the account to add
	 */
	public void addAccount(Account account) {
		accounts.add(account);
	}
}
