package net.atm.user;
/*
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import net.atm.user.model.User;

class UserTest {

	@Test
	void shouldReturnTheUsersFirstName() {
		User u = new User("Thaabit", "Jacobs", "pass0000", 0675007004);
		assertEquals("Thaabit", u.getFirstName());
	}
	
	@Test
	void shouldReturnTheUsersLastName() {
		User u = new User("Thaabit", "Jacobs", "pass0000", 0675007004);
		assertEquals("Jacobs", u.getLastName());
	}
	
	@Test
	void shouldReturnTheUsersCellNum() {
		User u = new User("Thaabit", "Jacobs", "pass0000", 0675007004);
		assertEquals(0675007004, u.getCellNo());
	}
	
	@Test
	void shouldReturnInvalidCellnoWhenChangingCellNo() {
		User u = new User("Thaabit", "Jacobs", "pass0000", 0675007004);
		assertEquals("Invalid cell phone number", u.changeCellNo(0255));
	}
	
	@Test
	void shouldChangeUserCellNumber() {
		User u = new User("Thaabit", "Jacobs", "pass0000", 0675007004);
		u.changeCellNo(1234567891);
		assertEquals(1234567891, u.getCellNo());
	}
	
	@Test
	void shouldReturnInvalidPasswordForShortPassword() {
		User u = new User("Thaabit", "Jacobs", "pass0000", 0675007004);
		assertEquals("Invalid password", u.changePassword("pas"));
	}
	
	@Test
	void shouldChangePassword() {
		User u = new User("Thaabit", "Jacobs", "pass0000", 0675007004);
		assertEquals("Password successfully changed", u.changePassword("passw"));
	}
}
<<<<<<< HEAD
*/
=======
*/
>>>>>>> 0e469e562752a64657bd8a045d6e664689469522
