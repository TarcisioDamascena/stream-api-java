package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Retorna a soma do produto
        int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);

        // Imprime o resultado
        System.out.println("O produto é: " + produto);
    }

}
