package functional_interface.desafios;


import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Imprime os numeros na ordem natural
        numeros.stream()
                .sorted(Integer::compareTo)
                .forEach(System.out::println);
    }
}
