package org.ies.bank.components;

import org.ies.bank.model.Account;
import org.ies.bank.model.Bank;

public class BankApp3 {
    private final BankReader bankReader;

    public BankApp3(BankReader bankReader) {
        this.bankReader = bankReader;
    }

    public BankApp3 run() {
        Bank bank = bankReader.read();
        bank.showAccounts();
        Account account = bank.findAccount("ES0003");
        if (account != null) {
            account.deposit(-50);
        } else {
            System.out.println("la cuenta no existe.");
        }

        bank.findnif("000X");
        Account account2 = bank.findAccount("ES004");
        if (account2 != null) {
            account2.deposit(300);
        } else {
            System.out.println("La cuenta no existe.");
        }
        Account account3 = bank.findAccount("ES0001");
        account3.showInfo();
        return new BankApp3(bankReader);
    }
}
