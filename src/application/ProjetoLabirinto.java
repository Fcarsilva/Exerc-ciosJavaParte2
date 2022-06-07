package application;

import entitie.*;

import java.util.ArrayList;
import java.util.List;

public class ProjetoLabirinto {

    public static void main(String[] args) {
        Parede p1=new Parede(0,0,100,10);
        Parede p2=new Parede(0,0,10, 100);

        List<Retangulo> listDeParedes=new ArrayList<>();
        listDeParedes.add(p1);
        listDeParedes.add(p2);
        ParedeQuadrada pq1=new ParedeQuadrada(50, 50,10);
        listDeParedes.add(pq1);


        //==================================INTERFACE
        ParedeInterface pf1 = new ParedeInterface(10,10,15,20);
        ParedeInterface pf2 = new ParedeInterface(30,10,10,200);

        PilarInterface pi1= new PilarInterface(45,40);
        PilarInterface pi2= new PilarInterface(25,20);

        List<RetanguloInterface> listaDeParedesI= new ArrayList<>();
        listaDeParedesI.add(pi1);
        listaDeParedesI.add(pi2);
        listaDeParedesI.add(pf2);
        listaDeParedesI.add(pf2);
//===========================GENERICS

        Coordenadas cc = new Coordenadas();
        RetanguloGenerics<Coordenadas> rg=new RetanguloGenerics<>();
        rg.posicao.x=10;
        rg.posicao.y=20;
        rg.posicao.comprimento=100;
        rg.posicao.largura=10;

        RetanguloGenerics<Coordenadas> rg1=new RetanguloGenerics<>();
        rg.posicao.x=10;
        rg.posicao.y=20;
        rg.posicao.comprimento=100;
        rg.posicao.largura=10;

        List<RetanguloGenerics<Coordenadas>> lrg= new ArrayList<>();
        lrg.add(rg);
        lrg.add(rg1);






    }
}
