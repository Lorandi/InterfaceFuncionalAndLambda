package entities;

import java.util.Locale;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public static boolean staticProductPredicate(Produto p){
        return p.getPreco() >=100.00;
    }
    public boolean nonStaticProductPredicate(){
        return preco >=100.00;
    }

    public static void staticProductConsumerPriceUpdate(Produto p){
        p.setPreco(p.getPreco() * 1.1);
    }

    public void nonStaticProductConsumerPriceUpdate(){
        setPreco(getPreco() * 1.1);
    }

    public static String staticFunctionUpperCaseName(Produto produto){
        return produto.getNome().toUpperCase(Locale.ROOT);
    }

    public String nonStaticFunctionUpperCaseName(){
        return getNome().toUpperCase(Locale.ROOT);
    }

    @Override
    public String toString() {

        return  nome + " R$" + String.format("%.2f",preco);
    }
}
