public class ej5 {

    public static void main(String[] args) {

        int[] pares = new int[20];
        int num = 2;

        for (int i = 0; i < 20; i++) {

            pares[i] = num;
            num = num + 2;

        }

        for (int i = 0; i < 20; i++) {

            System.out.println(pares[i]);

        }
    }
}