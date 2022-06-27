package application;

import entitie.Employee;
import entitie.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" +  i  + "data:");
            System.out.print("Outsourced (y/n)");
            char ch = sc.next().charAt(0);
            System.out.println("name");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours:");
            int hours = sc.nextInt();
            System.out.print("Value per hour:");
            double valuePerhour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge");
                double addtionalCharge = sc.nextDouble();

                list.add(new OutsourceEmployee(name, hours, valuePerhour, addtionalCharge));

            } else {
                Employee emp = new Employee(name, hours, valuePerhour);
                list.add(emp);

            }


            System.out.println();
            System.out.println("Payments");
            for (Employee emp : list) {
                System.out.println(emp.getName() + " - & " + String.format("%.2f", emp.payment()));
            }
            sc.close();

        }
    }

}
