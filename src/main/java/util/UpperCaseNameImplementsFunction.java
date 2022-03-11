package util;

import entities.Produto;

import java.util.Locale;
import java.util.function.Function;

public class UpperCaseNameImplementsFunction implements Function<Produto, String> {
    @Override
    public String apply(Produto produto) {
        return produto.getNome().toUpperCase(Locale.ROOT);
    }
}
