package net.atm.transactions;
/*
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import net.atm.account.Account;
import net.atm.types.AccountType;

class TransactionTest {

	@Test
	void shouldReturnTheCurrentBalanceInString() {
		Account acc = new Account("ThaabitsSavings", AccountType.SavingsAccount);
		Transaction transac = new Transaction(acc);
		
		acc.changeAmount(25.50);
		
		assertEquals("Current Balance: R25.50", transac.balanceEnquiry());
	}
	
	@Test
	void shouldReturnInavlidAmountMsg() {
		Account acc = new Account("ThaabitsSavings", AccountType.SavingsAccount);
		Transaction transac = new Transaction(acc);
		
		assertEquals("Amount: R0.00 invalid amount", transac.deposit(0.00));
	}
	
	@Test
	void shouldReturnAmountDepositedMsg() {
		Account acc = new Account("ThaabitsSavings", AccountType.SavingsAccount);
		Transaction transac = new Transaction(acc);
		
		assertEquals("Amount: R25.55 deposited", transac.deposit(25.55));
	}
	
	@Test
	void shouldAddToAmountAfterDeposit() {
		Account acc = new Account("ThaabitsSavings", AccountType.SavingsAccount);
		Transaction transac = new Transaction(acc);
		
		transac.deposit(25.55);
		
		assertEquals("Current Balance: R25.55", transac.balanceEnquiry());
	}
	
	@Test
	void shouldReturnInvalidMsgForZeroWithdrawal() {
		Account acc = new Account("ThaabitsSavings", AccountType.SavingsAccount);
		Transaction transac = new Transaction(acc);
		
		assertEquals("Amount: R0.00 invalid amount", transac.withdrawal(0.00));
	}
	
	@Test
	void shouldReturnAmontWithdrawalMsg() {
		Account acc = new Account("ThaabitsSavings", AccountType.SavingsAccount);
		Transaction transac = new Transaction(acc);
		
		transac.deposit(200.50);
		
		assertEquals("Amount: R200.50 withdrawn", transac.withdrawal(200.50));
	}
}
*/