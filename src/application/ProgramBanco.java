package application;

import entitie.Account;
import entitie.BusinessAccount;
import entitie.SavingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramBanco {
    public static void main(String[] args) {

        /*Account accc1 = new Account(1001, "Alex", 1000.0);
        accc1.withdraw(200.0);
        System.out.println(accc1.getBalance());

        Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());*/
        Locale.setDefault(Locale.US);
         List<Account> list = new ArrayList<>();
         list.add(new SavingAccount(1001, "Alex", 500.00, 0.01));
         list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
         list.add(new BusinessAccount(1005, "Anna", 300.0, 500.0));
         list.add(new BusinessAccount(1005, "Anna", 500.0, 5000.0));





         double sum = 0.0;
         for(Account acc : list){
             sum += acc.getBalance();
         }
        System.out.printf("Total balance: %.2f%n", sum);


        for( Account acc : list){
            acc.deposit(10.0);
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());

        }

        /* Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 0500.0); /*

        */

        //UPCASTING
        /*
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);*/

        // Downcasting
        /*
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);*/

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        /*
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof  SavingAccount){
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        } */

    }
}
