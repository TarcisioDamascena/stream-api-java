package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Limites do intervalo
        int limiteInf = 5;
        int limiteSup = 10;

        // Filtra os numeros no intervalo [limiteInf, limiteSup]
        List<Integer> filtroIntervalo = numeros.stream()
                .filter(n -> n >= limiteInf && n <= limiteSup)
                .toList();

        // Imprime o resultado
        System.out.println("Numeros no intervalo [" + limiteInf + " até " + limiteSup + "]: " + filtroIntervalo);
    }
}
