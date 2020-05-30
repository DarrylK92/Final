/**
 * BankingAccount: Holds information and has methods for a Banking account
 * 
 * @author Darryl Karney
 * @version 25Jul2018
 */

public abstract class BankingAccount implements Account{
	private String type;
	private double balance;
	private double annualPercentageYield;
	
	//Constructor
	public BankingAccount(String type) {
		switch(type) {
		case "Savings":
			setType(AccountTypes.SAVINGS);
			break;
		case "Checking":
			setType(AccountTypes.CHECKING);
			break;
		case "Mortgage":
			setType(AccountTypes.MORTGAGE);
			break;
		default:
			System.out.println("Invalid account type");
		}
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * @return the annualPercentageYield
	 */
	public double getAnnualPercentageYield() {
		return annualPercentageYield;
	}
	
	/**
	 * @param annualPercentageYield the annualPercentageYield to set
	 */
	public void setAnnualPercentageYield(double annualPercentageYield) {
		this.annualPercentageYield = annualPercentageYield;
	}
	
	/**
	 * @param amount the amount to deposit
	 */
	public abstract void depositAmount(double amount);
	
	/**
	 * @param amount the amount to withdraw
	 */
	public abstract void withdrawAmount(double amount);
}
