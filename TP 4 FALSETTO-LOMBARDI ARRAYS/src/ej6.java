import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] numero = new int[10];
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("escriba 10 numeros");

        for (int i = 0; i < 10; i++) {

            numero[i] = num.nextInt();

        }

        for (int i = 0; i < 10; i++) {

            if (numero[i] > 0) {
                positivos++;
            } else if (numero[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }

        }
        System.out.println("positivos: " + positivos);
        System.out.println("negativos: " + negativos);
        System.out.println("ceros: " + ceros);
    }
}