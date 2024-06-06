package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Checa se há numeros maiores que 10
        boolean numeroMaiorDez = numeros.stream()
                .anyMatch(n -> n > 10);

        // Imprime o resultado
        if (numeroMaiorDez){
            System.out.println("Há numeros maiores");
        } else {
            System.out.println("Não há numeros maiores");
        }

    }
}
