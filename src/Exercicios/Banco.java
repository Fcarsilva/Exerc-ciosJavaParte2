package Exercicios;

import entitie.Account;
import entitie.BusinessAccount;
import entitie.SavingAccount;

public class Banco {
    public static void main(String[] args) {

        /*BusinessAccount account = new BusinessAccount();
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING

        //Account acc1 = bacc;
        //Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        //Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING

       // BusinessAccount acc4 = (BusinessAccount) acc2;
        //acc4.loan(100.0);

        BusinessAccount acc5 = (BusinessAccount) acc3;
        //if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 =(BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("LOAN!");

        }
        if (acc3 instanceof  SavingAccount){
            SavingAccount acc5 =(SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Updade");*/

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

    }

    }

