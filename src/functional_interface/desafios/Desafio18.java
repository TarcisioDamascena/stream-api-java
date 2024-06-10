package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifica se todos os numeros são iguais
        boolean numerosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.get(0)));

        // Imprime o resultado
        if (!numerosIguais) {
            System.out.println("Não há numeros iguais");
        } else {
            System.out.println("Todos os numeros são iguais");
        }
    }
}
