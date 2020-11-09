package net.atm.printer;


import net.atm.model.account.Account;
import net.atm.model.transaction.Transaction;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Printer {

    public static void createReceipt(Account a, Transaction t)
    {
        try
        {
            FileWriter fileWriter = new FileWriter("/home/codex/Desktop/atm/Simple-atm-application/src/main/resources/receipts/" + a.getAccountName() + a.getAccountType() + a.getAccountNum() + a.getDateCreated()+ ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.write(t.toString());
            printWriter.close();

        } catch (IOException e) {
            System.out.println("Could not generate receipt");
            e.printStackTrace();
        }
    }
}
