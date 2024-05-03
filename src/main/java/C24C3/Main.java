package c24c23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Dónde vives?");
        String ciudad = scanner.next();
        System.out.println(ciudad + " es la mejor ciudad.");

        System.out.println("¿Cuál es tu edad?");
        String edad = scanner.next();
        System.out.println("¡" + edad + " años! ¡Estás muy joven!");

        System.out.println("¿Cuál es el estudio más reciente en el que has participado?");
        String estudio = scanner.next();
        System.out.println("Interesante, ¿puedes darme más detalles sobre " + estudio + "?");

        System.out.println("¿Cuál es tu número de teléfono?");
        String telefono = scanner.next();
        // Limpiar el buffer de entrada
        scanner.nextLine();

        System.out.println("Gracias, te contactaré en " + telefono + " si necesito más información.");

        scanner.close();
    }
}