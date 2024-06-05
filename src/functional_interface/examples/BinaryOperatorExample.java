package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    /*
     * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
     * É utilizado para realizar operações de redução em pares de elementos, como somar numeros ou combinar objetos.
     */

    public static void main(String[] args) {
        // Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Usar BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // Usar BinaryOperator para somar todos os numeros no Stream
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }
}
