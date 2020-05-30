/**
 * Mortgage: Holds information and has methods for a Mortgage account
 * 
 * @author Darryl Karney
 * @version 25Jul2018
 */


public class Mortgage extends LoanAccount{

	private double initialAmount;
	private int termInMonths;
	
	public Mortgage(double initialAmount, int months) {
		super(AccountTypes.MORTGAGE);
		setInitialAmount(initialAmount);
		setBalance(initialAmount);
		setTermInMonths(months);	
	}

	/**
	 * @return the initialAmount
	 */
	public double getInitialAmount() {
		return initialAmount;
	}

	/**
	 * @param initialAmount the initialAmount to set
	 */
	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}

	/**
	 * @return the termInMonths
	 */
	public int getTermInMonths() {
		return termInMonths;
	}

	/**
	 * @param termInMonths the termInMonths to set
	 */
	public void setTermInMonths(int termInMonths) {
		this.termInMonths = termInMonths;
	}

	@Override
	public String getAccountType() {
		return super.getType();
	}

	@Override
	public double getAccountBalance() {
		return getBalance();
	}

	@Override
	public void applyPayment(double payment) {
		setBalance(getBalance() - payment);
	}

}
