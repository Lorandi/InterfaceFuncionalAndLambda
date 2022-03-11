package aplication;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateLambdasApp {

    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 1500.00));
        lista.add(new Produto("Som", 900.00));
        lista.add(new Produto("Pastel", 15.00));
        lista.add(new Produto("Raquete", 300.00));

        //Reference Method estático e não estático
//        lista.removeIf(Produto :: staticProductPredicate);
//        lista.removeIf(Produto :: nonStaticProductPredicate);

        //Expressão lambda declarada
//        double min = 500.00;
//        Predicate<Produto> pred = p -> p.getPreco() >= min;
//        lista.removeIf(pred);

        //Expressão lamda inline
        double min = 500.00;
        lista.removeIf(p -> p.getPreco() >= min);




        for( Produto p : lista){
            System.out.println(p.toString());
        }

    }
}



