package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
/*
 * Representa uma opração que aceita um argumento do tipo T (Qualquer tipo) e não retorna nenhum resultado.
 * É utilizado principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */

public class ConsumerExample {
    public static void main(String[] args) {
        //Cria uma Lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //Consumer com expressão lambda para imprimir os numeros pares
        Consumer<Integer> imprimirNumerosPares = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //Usar consumer para imprimir os numeros pares no Stream
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
