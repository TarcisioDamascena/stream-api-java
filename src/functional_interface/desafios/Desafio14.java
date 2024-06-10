package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
        // Atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Retorna uma lista filtrada por números primos
        List<Integer> numerosPrimos = numeros.stream()
                .filter(n -> {
                    if (n < 1) return false;
                    for (int i = 2; i <= Math.sqrt(n); i++) {
                        if (n % i == 0)
                            return false;
                    }
                    return true;
                })
                .toList();

        // Retorna o maior número
        Optional<Integer> maiorNumero = numerosPrimos.stream().max(Integer::compareTo);

        // Imprime o resultado
        System.out.println("Maior número primo da lista: " + numerosPrimos + " é: " + maiorNumero);
    }
}
