package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifica se há numeros negativos na Lista
        boolean temNegativos = numeros.stream()
                .anyMatch(n -> n < 0);

        // Imprime o resultado
        if (temNegativos){
            System.out.println("Há numeros negativos na Lista");
        } else {
            System.out.println("Não há numeros negativos na Lista");
        }
    }
}
