package entitie;

public class Parede  extends Retangulo{
    String cor="";
    public void setCor(String cor){
        this.cor=cor;
    }

    public Parede(int x, int y, int comprimento, int altura) {
        super(x,y, comprimento,altura);

    }
}

