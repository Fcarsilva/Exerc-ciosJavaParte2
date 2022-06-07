package application;

import java.util.ArrayList;
import java.util.List;

public class ClassesAbstratas {
    public static void main(String[] args) {


        ArvoreGrande arvoreGrande = new ArvoreGrande();
        arvoreGrande.nome = "Sequoia";
        arvoreGrande.setNome("Sequoia");
        System.out.println(arvoreGrande.nomeFruto);


        Arvore arvoreAB = new ArvoreGrande();
        arvoreAB.nome = "Fiqueira";

        mostraObjeto(arvoreGrande);

    }

        public static void mostraObjeto(Fruto fruto){
        fruto.configurarFruto("Goiaba");

    }
}


abstract class Arvore{
    String nome;
    int quantidadeDeFolhas =0;
    double comprimentoCaule = 0;
    double diamentroCaule = 0;

    public void setNome(String nome){
        this.nome=nome;
    }
    public abstract void setValor(int valor);
}
interface Fruto{//imutabilidade //static
    String nomeFruto="Laranja";
    ArvoreGrande arvoreGrande = new ArvoreGrande();
    List<ArvoreGrande> listaAG=new ArrayList<>();
    public void configurarFruto(String nome);
}

class ArvoreGrande extends Arvore implements Fruto{
    boolean perdeFolhasInverno = false;

    @Override
    public void setNome(String nome){
        this.nome=nome;
    }

    @Override
    public void setValor(int valor) {
        this.quantidadeDeFolhas = valor;

    }

    @Override
    public void configurarFruto(String nome) {

        System.out.println(""+this.nomeFruto);

    }
}