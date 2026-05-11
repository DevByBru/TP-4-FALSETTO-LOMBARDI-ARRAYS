public class ej7 {

    public static void main(String[] args) {

        int[] numero = new int[10];

        for (int i = 0; i < 10; i++) {

            numero[i] = (int)(Math.random() * 100);

        }

        System.out.println("numeros aleatoriios");

        for (int i = 0; i < 10; i++) {

            System.out.println(numero[i]);

        }
    }
}