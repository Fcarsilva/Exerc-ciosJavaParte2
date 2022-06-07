package Modulo4;

public class Fone {


    private String codigo;
    private String numero;
    private Boolean celular = true;



    public Fone(String codigo, String numero, Boolean celular) {
        this.codigo = codigo;
        this.numero = numero;
        this.celular = celular;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCelular(Boolean celular) {
        this.celular = celular;
    }


    public Boolean isCelular() {
        return celular;
    }
}
