package application;

import java.util.ArrayList;
import java.util.List;

public class ProjetoGenerics {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        ListaDePessoa list=new ListaDePessoa();
        list.listaDe.add(p);
        Funcionario f=new Funcionario();
        ListaDeFuncionario lf=new ListaDeFuncionario();
        lf.listaDe.add(f);

        ListaDe<Pessoa> lp= new ListaDe<>();
        lp.listaDe.add(p);
    }
}
class Pessoa{ String nome;}

class Funcionario{String nome;}

class ListaDePessoa{
    List<Pessoa> listaDe=new ArrayList<>();
}
class ListaDeFuncionario{
    List<Funcionario> listaDe=new ArrayList<>();

}
class ListaDe<T>{
    List<T> listaDe =new ArrayList<>();
        }
