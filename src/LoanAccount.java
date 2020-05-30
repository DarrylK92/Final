/**
 * LoanAccount: Holds information and has methods for a Loan account
 * 
 * @author Darryl Karney
 * @version 25Jul2018
 */


public abstract class LoanAccount implements Account{
	private String type;
	private double balance;
	private double interestRate;
	
	//Constructor
		public LoanAccount(String type) {
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
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}
	
	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	/**
	 * @param payment the payment to apply
	 */
	public abstract void applyPayment(double payment);
}
