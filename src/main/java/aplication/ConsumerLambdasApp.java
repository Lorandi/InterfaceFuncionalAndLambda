package aplication;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerLambdasApp {

    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 1500.00));
        lista.add(new Produto("Som", 900.00));
        lista.add(new Produto("Pastel", 15.00));
        lista.add(new Produto("Raquete", 300.00));

        //Implementação de interface
//        lista.forEach(new PriceUpdate());


        //Reference Method estático e não estático
//        lista.forEach(Produto::staticProductConsumerPriceUpdate);
//        lista.forEach(Produto::nonStaticProductConsumerPriceUpdate);

        double factor = 1.1;
        //Expressão lambda declarada
        Consumer<Produto> cons = p->  p.setPreco(p.getPreco() * factor);
        lista.forEach(cons);


        //Expressão lambda inline
//        lista.forEach(produto -> produto.setPreco(produto.getPreco() * factor));

        lista.forEach(System.out::println);
    }
}



