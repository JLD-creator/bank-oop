package org.ies.bank.components;

import org.ies.bank.model.Account;
import org.ies.bank.model.Bank;

public class BankApp4 {
    private final BankReader bankReader;

    public BankApp4(BankReader bankReader) {
        this.bankReader = bankReader;
    }
    public BankApp4 run(){
        Bank bank = bankReader.read();
        Account account = bank.findAccount("ES0001");
        Account account2 = bank.findAccount("ES0002");
        if(account != null){
            account.showInfo();
            bank.transfer("ES0001", "ES0002",account.getBalance());
            bank.showAccounts();

            bank.showAccounts();
        } else {
            System.out.println("Cuenta no encontrada");
        }
        return new BankApp4(bankReader);
    }
}
