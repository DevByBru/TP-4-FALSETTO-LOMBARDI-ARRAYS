import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int cantidad;

        System.out.println("ingreser la cantidad de alumnos");
        cantidad = num.nextInt();

        double[] notas = new double[cantidad];
        double suma = 0;
        double promedio;

        for (int i = 0; i < cantidad; i++) {

            System.out.println("ingrese la nota del alumno");

            notas[i] = num.nextDouble();

        }

        for (int i = 0; i < cantidad; i++) {

            suma = suma + notas[i];

        }

        promedio = suma / cantidad;

        System.out.println("la nota promedio es: " + promedio);
        System.out.println("alumnos con nota superior al promedio");

        for (int i = 0; i < cantidad; i++) {
            
        if (notas[i] > promedio) {
         System.out.println(notas[i]);

            }
        }
    }
}