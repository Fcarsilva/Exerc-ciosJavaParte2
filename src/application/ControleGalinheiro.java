package application;

import entitie.Animal;

import java.util.Locale;
import java.util.Scanner;

public class ControleGalinheiro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Animal animal = new Animal();


        System.out.println("Cadastro de Animal no estoque: ");
        System.out.println("Digite G para Galinha ou P para Pintinho");
        char tipoAnimal = sc.next().charAt(0);

        if (tipoAnimal == 'G'){

            System.out.println("Digite a quantidades  de galinhas a ser cadastrada!");
            animal.quantidadeGalinha = sc.nextInt();

        } else {
            System.out.println("Digite a quantidades  de Pintinhos a ser cadastrada!");
            animal.quantidadePintinho = sc.nextInt();
        }



        System.out.printf("Quantidade de Galinha no estoque:%.2f%n", animal.somaG());
        System.out.printf("Quantidade de Pintinho no estoque:%.2f%n", animal.somaP());



    }


}
