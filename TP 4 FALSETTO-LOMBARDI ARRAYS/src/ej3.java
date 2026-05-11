import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] numero = new int[10];

        int suma = 0;
        int cantidad = 0;
        double promedio;

        System.out.println("escriba 10 numeros");
        for (int i = 0; i < 10; i++) {
            numero[i] = num.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {

                suma = suma + numero[i];
                cantidad++;

            }
        }

        promedio = (double) suma / cantidad;
        System.out.println("el promedio de las posiciones pares es: " + promedio);

    }
}