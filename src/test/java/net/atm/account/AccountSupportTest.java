package net.atm.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountSupportTest {
	
	@Test
	void shouldGenerateAccountNumTenDigitsLong() {
		AccountSupport st = new AccountSupport();
		
		String accnum1 = new Integer(st.generateAccountNum()).toString();
		
		assertEquals(10, accnum1.length());
	}
	
	@Test
	void shouldGenerateAccountNum() {
		AccountSupport st = new AccountSupport();
		
		int accnum1 = st.generateAccountNum();
		int accnum2 = st.generateAccountNum();
		
		assertEquals(true, accnum1 != accnum2);
	}

}
