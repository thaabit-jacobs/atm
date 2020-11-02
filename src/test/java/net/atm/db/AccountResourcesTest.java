/*
package net.atm.db;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import net.atm.account.AccountSupport;
import net.atm.types.AccountType;
/*
public class AccountResourcesTest {

    AccountsResources ar;

    AccountResourcesTest() throws ClassNotFoundException {
        try {
            Class.forName("org.postgresql.Driver");
            ar = new AccountsResources(DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank", "thaabit", "1234"));
        } catch (SQLException e) {
            System.out.println("Could not connect to db");
            e.printStackTrace();
        }
    }

    @Test
    void shouldAddUserAndReturnTrue(){
        int accNum = new AccountSupport().generateAccountNum();
        //ar.deleteAccount(11111111);
        assertTrue(ar.addAccount("Savings", AccountType.SavingsAccount, accNum, LocalDate.now()));
        //ar.deleteAccount(accNum);
    }
    */
