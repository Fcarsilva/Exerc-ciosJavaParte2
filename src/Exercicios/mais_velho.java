package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, maioridade, posicaomaior;

        System.out.println("Quantas pessoas voce vai digitar?");
        n = sc.nextInt();
        int vetoridade[] = new int[n];
        String nomes[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome:");
            nomes[i] = sc.next();
            System.out.print("Idade:");
            vetoridade[i] = sc.nextInt();
        }
        maioridade = vetoridade[0];
        posicaomaior = 0;

        for(int i=1; i<n; i++){
            if(vetoridade[i]> maioridade){
                maioridade = vetoridade[i];
                posicaomaior = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaomaior]);

        sc.close();
    }
}
