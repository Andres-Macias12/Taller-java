package C24C3;

import java.util.Scanner;

public class EdadEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] edades = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la edad del estudiante " + (i + 1) + ":");
            edades[i] = scanner.nextInt();
        }


        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }


        float promedioEdades = (float) sumaEdades / edades.length;


        System.out.println("El promedio de edad de los 5 estudiantes es: " + promedioEdades);

        scanner.close();
    }
}
