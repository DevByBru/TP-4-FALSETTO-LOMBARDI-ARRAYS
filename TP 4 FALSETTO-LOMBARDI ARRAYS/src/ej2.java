import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] numero = new int[10];

        int positivos = 0;
        int negativos = 0;
        int cantidadpositivos = 0;
        int cantidadnegativos = 0;
        double promposi;
        double promneg;

        System.out.println("Escriba 10 numeros");
        for (int i = 0; i < 10; i++) {
            numero[i] = num.nextInt();

        }

        for (int i = 0; i < 10; i++) {
            if (numero[i] >= 0) {
                positivos = positivos + numero[i];
                cantidadpositivos++;
            } else {

                negativos = negativos + numero[i];
                cantidadnegativos++;
            }

        }

        promposi = (double) positivos / cantidadpositivos;
        promneg = (double) negativos / cantidadnegativos;

        System.out.println("El promedio de positivos es: " + promposi);
        System.out.println("El promedio de negativos es: " + promneg);

    }
}