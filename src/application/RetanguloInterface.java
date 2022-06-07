package application;

interface RetanguloInterface {

    public void setRetangulo(int x, int y,int comprimento, int altura);


}

class ParedeInterface implements RetanguloInterface{
int x,y,comprimento,altura;

    @Override
    public void setRetangulo(int x, int y, int comprimento, int altura) {
        this.x=x; this.y=y;
        this.comprimento=comprimento;
        this.altura=altura;

    }
    public ParedeInterface(int x, int y, int comprimento, int altura){
        setRetangulo(x,y, comprimento,altura);
    }
}

class PilarInterface implements RetanguloInterface {
    int x, y, comprimento, altura;

    @Override
    public void setRetangulo(int x, int y, int comprimento, int altura) {
        this.x = x;
        this.y = y;
        this.comprimento = comprimento;
        this.altura = altura;
    }
    public PilarInterface(int x, int y){
        setRetangulo(x,y,10,10);
    }
}




