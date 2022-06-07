package entitie;

public class Animal {

    public int quantidadePintinho;
    public int quantidadeGalinha;


    public void addG(int quantidadeGalinha){
        this.quantidadeGalinha += quantidadeGalinha;
    }
    public double somaG() {

        return quantidadeGalinha;


    }
    public void addP(int quantidadePintinho){
        this.quantidadePintinho += quantidadePintinho;
    }

    public double somaP(){
        return quantidadePintinho;
    }

}

