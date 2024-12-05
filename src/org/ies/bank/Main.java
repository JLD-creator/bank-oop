package org.ies.bank;
import org.ies.bank.components.BankApp;
import java.util.Scanner;
import org.ies.bank.components.BankReader;
import org.ies.bank.components.AccountReader;
import org.ies.bank.components.CustomerReader;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerReader customerReader = new CustomerReader(scanner);
        AccountReader accountReader = new AccountReader(scanner, customerReader);
        BankReader bankReader = new BankReader(scanner, accountReader);
        BankApp bankApp = new BankApp(scanner, bankReader);

        bankApp.run();
    }
}