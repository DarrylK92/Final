/**
 * Savings: Holds information and has methods for a Savings account
 * 
 * @author Darryl Karney
 * @version 25Jul2018
 */

public class Savings extends BankingAccount{

	public Savings() {
		super(AccountTypes.SAVINGS);
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
