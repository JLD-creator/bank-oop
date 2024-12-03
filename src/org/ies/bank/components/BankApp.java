package org.ies.bank.components;
import org.ies.bank.model.Bank;
import org.ies.bank.model.Customer;
import org.ies.bank.model.Account;

import java.util.Scanner;

public class BankApp {
private final Scanner scanner;
private final BankReader bankReader;

    public BankApp(Scanner scanner, BankReader bankReader) {
        this.scanner = scanner;
        this.bankReader = bankReader;
    }
    public BankApp run(){
        Bank bank = bankReader.read();
        int option;
        do {
            System.out.println("1.Mostrar Cuentas");
            System.out.println("2. Mostrar datos de la cuenta");
            System.out.println("3. Mostrar datos de la cuentas del cliente");
            System.out.println("4. Ingresar dinero");
            System.out.println("5. Sacar dinero de la cuenta");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option== 1){

            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {

            } else if (option == 5) {

            } else if (option == 6) {
                System.out.println("Saliendo de la APP...");
            } else {
                System.out.println("Opereacion no encontrada");
            }

        } while (option !=6);
        return null;
    }
}
