package C24C3;
import java.util.Scanner;

public class SolicitarUnNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();


        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
            System.out.println(numero2 + " es menor que " + numero1);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor que " + numero1);
            System.out.println(numero1 + " es menor que " + numero2);
        } else {
            System.out.println("Ambos números son iguales: " + numero1);
        }

        scanner.close();
    }
}
