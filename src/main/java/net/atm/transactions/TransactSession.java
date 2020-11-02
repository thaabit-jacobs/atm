package net.atm.transactions;

public class TransactSession {
	/*
	 * 	public Transaction(Account account) {
		
		this.account = account;
		
	}
	
	public String balanceEnquiry() {
		Formatter f = new Formatter();
		date = LocalDate.now();
		
		this.type = TransactionType.BalanceEnquiry;
		transactionSuccess = true;
		transactionAmount = account.getAvailibleBalance();
		
		String balance = f.format("Current Balance: R%.2f", account.getAvailibleBalance()).toString();
		
		f.close();
		
		account.addTransactions(this);
		
		return balance;
	}
	
	public String deposit(double amount) {
		Formatter f = new Formatter();
		date = LocalDate.now();
		
		this.type = TransactionType.Deposit;
		transactionAmount = amount;
		
		if(amount <= 0) {
			String invalidMsg = f.format("Amount: R%.2f invalid amount", amount).toString();
			
			transactionSuccess = false;
			
			f.close();
			
			account.addTransactions(this);
			
			return invalidMsg;
		}
		
		account.changeAmount(amount);
		
		String deposittedMsg = f.format("Amount: R%.2f deposited", amount).toString();
		
		transactionSuccess = true;
		
		f.close();
		
		account.addTransactions(this);
		
		return deposittedMsg;
	}
	
	public String withdrawal(double amount) {
		Formatter f = new Formatter();
		date = LocalDate.now();
		
		this.type = TransactionType.Withdrawal;
		transactionAmount = amount;
		
		if(amount <= 0 || amount > account.getAvailibleBalance()) {
			String invalidMsg = f.format("Amount: R%.2f invalid amount", amount).toString();
			
			transactionSuccess = false;
			
			f.close();
			
			account.addTransactions(this);
			
			return invalidMsg;
		}
		
		account.changeAmount(-amount);
		
		String withdrawalMsg = f.format("Amount: R%.2f withdrawn", amount).toString();
		
		transactionSuccess = true;
		
		f.close();
		
		account.addTransactions(this);
		
		return withdrawalMsg;
	}
	*/
	
}

