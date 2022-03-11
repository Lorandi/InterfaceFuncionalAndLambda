package aplication;

import entities.Produto;
import util.UpperCaseNameImplementsFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionLambdasApp {

    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 1500.00));
        lista.add(new Produto("Som", 900.00));
        lista.add(new Produto("Pastel", 15.00));
        lista.add(new Produto("Raquete", 300.00));

        //Implementação de interface
//        List<String> names = lista.stream().map(new UpperCaseNameImplementsFunction())
//                .collect(Collectors.toList());


        //Reference Method estático e não estático
//        List<String> names = lista.stream().map(Produto::staticFunctionUpperCaseName)
//                .collect(Collectors.toList());
//        List<String> names = lista.stream().map(Produto::nonStaticFunctionUpperCaseName)
//                .collect(Collectors.toList());

        //Expressão lambda declarada
        Function<Produto, String> func = p -> p.getNome().toUpperCase(Locale.ROOT);
        List<String> names = lista.stream().map(func).collect(Collectors.toList());

        //Expressão lambda inline
//        List<String> names = lista.stream().map(p -> p.getNome().toUpperCase(Locale.ROOT))
//                .collect(Collectors.toList());

        names.forEach(System.out::println);


    }
}