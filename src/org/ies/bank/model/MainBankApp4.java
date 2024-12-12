package org.ies.bank.model;

import org.ies.bank.components.AccountReader;
import org.ies.bank.components.BankApp4;
import org.ies.bank.components.BankReader;
import org.ies.bank.components.CustomerReader;

import java.util.Scanner;

public class MainBankApp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerReader customerReader = new CustomerReader(scanner);
        AccountReader accountReader = new AccountReader(scanner, customerReader);
        BankReader bankReader = new BankReader(scanner, accountReader);
        BankApp4 bankApp4 = new BankApp4(bankReader);

        bankApp4.run();
    }
}
