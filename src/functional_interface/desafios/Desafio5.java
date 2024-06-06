package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtra e calcula a media dos numeros maiores que cinco (5)
        OptionalDouble media = numeros.stream()
                .filter( n-> n > 5)
                .mapToInt(Integer::intValue)
                .average();

        // Imprime o resultado
        if (media.isPresent()){
            System.out.println(media.getAsDouble());
        }
    }
}
