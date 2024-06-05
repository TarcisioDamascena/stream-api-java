package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    /*
     * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
     * È comumente utilizada para criar ou fornecer novos objetos de um determinado tipo.
     */

    public static void main(String[] args) {
        // Usar um supplier com expressão lambda para fornecer uma saldação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo";

        // Usar o supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo")
                .limit(5)
                .toList();

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
