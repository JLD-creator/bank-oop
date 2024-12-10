package org.ies.bank.components;

import org.ies.bank.model.Account;
import org.ies.bank.model.Bank;

public class BankApp4 {
    private final BankReader bankReader;

    public BankApp4(BankReader bankReader) {
        this.bankReader = bankReader;
    }
    public void run(){
        Bank bank = bankReader.read();
        Account account = bank.findAccount("ES0001");
        if(account != null){
            account.showInfo();

            bank.showAccounts();
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }
}
