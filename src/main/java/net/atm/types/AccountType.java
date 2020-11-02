package net.atm.types;

public enum AccountType {
	CurrentAccount("These deposits are the most liquid deposits and there are no limits for number of transactions or the amount of transactions in a day."),
	SavingsAccount("The saving account holder is allowed to withdraw money from the account as and when required"),
	RecurringDepositAccount(" In RD account a fixed amount is deposited every month for a specified period and the total amount is repaid with interest at the end of the particular fixed period."),
	FixedDepositAccount("It’s one time deposit and one time take away (withdraw) account. The money deposited in this account can not be withdrawn before the expiry of period.");
	
	AccountType(String accountDescription) {
		this.accountDescription = accountDescription;
	}
	
	private String accountDescription;
	
	public String getDescription() {
		return accountDescription;
	}
}
