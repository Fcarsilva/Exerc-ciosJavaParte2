package entitie;

import java.util.Locale;
import java.util.Scanner;

public class Vendas {

    public void vendas() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Tabela de codigos de vendas dos Produtos:");
        System.out.println(" Pipoca: (1)");
        System.out.println(" Paçoca: (2)");
        System.out.println(" Pé de moça: (3)");
        System.out.println(" Pé de moleque: (4)");

        System.out.println("Digite o codigo do produto foi vendido?");
        int x = sc.nextInt();
        System.out.println(" Quantas unidades?");
        int quantidade = sc.nextInt();
        double totalquantidade;


        switch (x) {
            case 1:
                System.out.println("Produto vendido Pipoca");
                totalquantidade =-quantidade;
                System.out.printf("Total em estoque de Pipoca: %.2f%n", totalquantidade);

                break;
            case 2:
                System.out.println("Produto vendido Paçoca");
                totalquantidade =-quantidade;
                System.out.printf("Total em estoque de Paçoca: %.2f%n", totalquantidade);
                break;
            case 3:
                System.out.println("Produto vendido Pé de moça");
                totalquantidade =-quantidade;
                System.out.printf("Total em estoque de Pipoca: %.2f%n", totalquantidade);
                break;
            case 4:
                System.out.println("Produto vendido Pé de moleque");
                totalquantidade =-quantidade;
                System.out.printf("Total em estoque de Pipoca: %.2f%n", totalquantidade);
                break;

        }


    }

}


