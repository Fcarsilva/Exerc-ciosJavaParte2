package Modulo4;

public class Pessoa extends Fone{


    private String nome;
    private String sobrenome;


    public Pessoa(String codigo, String numero, Boolean celular) {
        super(codigo, numero, celular);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
