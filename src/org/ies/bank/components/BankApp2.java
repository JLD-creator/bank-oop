package org.ies.bank.components;

import org.ies.bank.model.Account;
import org.ies.bank.model.Bank;

public class BankApp2 {
    private final BankReader bankReader;

    public BankApp2(BankReader bankReader) {
        this.bankReader = bankReader;
    }
    public void run(){
        Bank bank = bankReader.read();
        Account account = bank.findAccount("ES0001");
        if (account != null){
            account.deposit(500);
        }else {
            System.out.println("LA cuenta no existe");
        }
        Account account2 = bank.findAccount("ES0002");
        if (account2 != null){
            account2.deposit(-30);
        }else {
            System.out.println("La cuena no existe");
        }
        account.showInfo();
        account2.showInfo();
    }
}
