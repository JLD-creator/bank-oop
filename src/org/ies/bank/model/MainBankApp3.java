package org.ies.bank.model;

import org.ies.bank.components.*;

import java.util.Scanner;

public class MainBankApp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerReader customerReader = new CustomerReader(scanner);
        AccountReader accountReader = new AccountReader(scanner, customerReader);
        BankReader bankReader = new BankReader(scanner, accountReader);
        BankApp3 bankApp3 = new BankApp3(bankReader);

        bankApp3.run();
    }
}
