package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio4 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Salva os numeros pares em uma nova Lista
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n %2 == 0)
                .toList();

        // Imprime o resultado
        System.out.println(numerosPares);
    }
}
