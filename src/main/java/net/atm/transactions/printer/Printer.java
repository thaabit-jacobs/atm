package net.atm.transactions.printer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import net.atm.model.Account;
import net.atm.model.Transaction;

public class Printer {

    public static void createReceipt(Account a, Transaction t)
    {
        try
        {
            FileWriter fileWriter = new FileWriter("/home/codex/Desktop/atm/Simple-atm-application/src/main/resources/receipts/" + a.getAccountName() + a.getAccountType() + a.getAccountNumber() + LocalTime.now()+ ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.write(t.toString();
            printWriter.close();

        } catch (IOException e) {
            System.out.println("Could not generate receipt");
            e.printStackTrace();
        }
    }
}