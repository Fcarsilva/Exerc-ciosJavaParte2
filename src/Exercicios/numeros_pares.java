package Exercicios;

import java.util.Scanner;

public class numeros_pares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, qtdpares;

        System.out.print(" Quantos numeros voce vai digitar?");
        n = sc.nextInt();

        int[] vetor = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero:");
            vetor[i] = sc.nextInt();
        }
        System.out.print("\nNumeros Pares:");

        qtdpares = 0;
        for (int i =0; i<n ; i++){
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d", vetor[i]);
                qtdpares++;
            }
        }
        System.out.printf("\n\nQuantidade de pares = %d \n", qtdpares);
        sc.close();
    }
}
