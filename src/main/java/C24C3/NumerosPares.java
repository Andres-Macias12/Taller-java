package C24C3;

import java.util.Arrays;
import java.util.List;

public class NumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Los números pares en la lista son:");
        numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .forEach(numero -> System.out.print(numero + " "));
    }
}