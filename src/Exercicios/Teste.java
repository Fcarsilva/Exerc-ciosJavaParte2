package Exercicios;

public class Teste {

    private int valor;

    Teste teste;

    public void setTeste(Teste teste){
        this.teste=teste;
    }

    public void addValor(int valor){
        this.valor=this.valor+valor;
    }

    public void mostrarValor(){
        System.out.println("Valor:"+valor);
    }
}



