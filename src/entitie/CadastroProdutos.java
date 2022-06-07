package entitie;

import java.util.Locale;
import java.util.Scanner;

public class CadastroProdutos {


    public void cadastro() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de Produtos ");
        System.out.println(" Pipoca: (1)");
        System.out.println(" Paçoca: (2)");
        System.out.println(" Pé de moça: (3)");
        System.out.println(" Pé de moleque: (4)");
        System.out.println(" Qual produto deseja cadastrar?");
        int y = sc.nextInt();
        System.out.println(" Quantas unidades?");
        int quantidade = sc.nextInt();
        double totalquantidade;

        switch (y) {
            case 1:
                System.out.println("Produto cadastrado Pipoca");
                totalquantidade = +quantidade;
                System.out.printf("Total em estoque de Pipoca: %.2f%n", totalquantidade);
                break;
            case 2:
                System.out.println("Produto cadastrado Paçoca");
                totalquantidade = +quantidade;
                System.out.printf("Total em estoque de Paçoca: %.2f%n", totalquantidade);
                break;
            case 3:
                System.out.println("Produto cadastrado Pé de moça");
                totalquantidade = +quantidade;
                System.out.printf("Total em estoque de Pé de moça: %.2f%n", totalquantidade);
                break;
            case 4:
                System.out.println("Produto cadastrado Pé de moleque");
                totalquantidade = +quantidade;
                System.out.printf("Total em estoque de Pé de moleque: %.2f%n", totalquantidade);
                break;

        }
    }
}
