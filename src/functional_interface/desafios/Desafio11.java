package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Retorna a soma dos quadrados
        int somaDosQuadrados = numeros.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        // Imprime o resultado
        System.out.println("Soma do quadrado de todos os numeros: " + somaDosQuadrados);
    }
}
