package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Retorna os valores multiplos de 3 ou de 5
        List<Integer> multiplos = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .toList();

        // Imprime o resultado
        System.out.println("Valores multiplos de 3 ou 5: " + multiplos);
    }
}
