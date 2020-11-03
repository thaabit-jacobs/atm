package net.atm;

import java.util.Random;

public class AccountSupport {
	 
	public int generateAccountNum() {
		Random r = new Random();
		String accNum = "144";
		
		for(int i = 0; i < 7; i++)
			accNum += r.nextInt(10);
		
		return Integer.valueOf(accNum);
	}
}
