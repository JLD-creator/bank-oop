package org.ies.bank.model;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Objects;

public class Bank {
    private final Scanner scanner;
    private String nameBank;
    private Account[] accounts;

    public Bank(Scanner scanner, String nameBank, Account[] accounts) {
        this.scanner = scanner;
        this.nameBank = nameBank;
        this.accounts = accounts;
    }

    public void showAccounts() {
        for (Account account : accounts) {
            account.showInfo();
        }

    }

    public void findIban(String iban) {
        for (Account account : accounts) {
            if (account.getIban().equals(iban)) {
                System.out.println(account);
            }
        }
    }
    public void findnif(String nif) {
        for (Account account : accounts) {
            if (account.getCustomer().getNif().equals(nif)){
                account.showInfo();
            }
        }
    }

    public void money(String iban, double money) {
        System.out.println("Que cantidad de dinero desea introducir");
        money = scanner.nextInt();
        for (Account account : accounts) {
            if (account.getIban().equals(iban)) {
             account.setBalance(account.getBalance()+ money);
            } else {
                System.out.println("NO se encuentra la cuenta");
            }
        }

    }


    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(nameBank, bank.nameBank) && Objects.deepEquals(accounts, bank.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBank, Arrays.hashCode(accounts));
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + nameBank + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
