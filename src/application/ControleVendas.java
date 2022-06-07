package application;

import entitie.CadastroProdutos;
import entitie.Vendas;

import java.util.Locale;
import java.util.Scanner;

public class ControleVendas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CadastroProdutos produtos = new CadastroProdutos();
        Vendas vendas = new Vendas();

        System.out.println("Digita 1 para Vendas ou 2 Para Cadastro de Produtos:");
        int x = sc.nextInt();
        if(x == 1){
            vendas.vendas();
        }else
            produtos.cadastro();

        sc.close();

    }
}
