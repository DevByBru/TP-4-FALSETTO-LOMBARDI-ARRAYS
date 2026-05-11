import java.util.Random;

public class ej10 {

    public static void main(String[] args) {

        int[] numero = new int[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {

            int aleatorio;
            boolean repetido;

            do {

             aleatorio = random.nextInt(1, 21);

             repetido = false;

             for (int j = 0; j < i; j++) {

             if (numero[j] == aleatorio) {

             repetido = true;

                    }

                }

            } while (repetido == true);

            numero[i] = aleatorio;
        }
        System.out.println("numeros aleatorios sin repetir");
        for (int i = 0; i < 10; i++) {
        System.out.println(numero[i]);
        }
    }
}