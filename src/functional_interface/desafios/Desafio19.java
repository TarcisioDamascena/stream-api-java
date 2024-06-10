package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Retorna os numeros multiplos de 3 ou 5
        List<Integer> numerosPrimos = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .toList();
        // Retorna a soma dos numeros
        int resultado = numerosPrimos.stream()
                .reduce(0, Integer::sum);

        //Imprime o resultado
        System.out.println("Numeros primos: " + numerosPrimos + " Soma dos numeros: " + resultado);
    }
}
