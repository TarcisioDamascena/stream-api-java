package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifíca se há numeros negativos
        boolean temNegativos = numeros.stream()
                .anyMatch(n -> n < 0);

        // Imprime o Resultado
        if (temNegativos) {
            System.out.println("Há números negativos.");
        } else {
            System.out.println("Não há números negativos");
        }
    }
}
