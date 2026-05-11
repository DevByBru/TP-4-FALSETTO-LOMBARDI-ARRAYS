import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] numero = new int[7];

         System.out.println("Escriba 7 numeros");
        for (int i = 0; i < 7; i++) {

       
            numero[i] = num.nextInt();

        }
        System.out.println("FOR");
        System.out.println("Estos son los numeros que elegiste");
        for (int i = 0; i < 7; i++) {

            System.out.println(numero[i]);
        }

        int i = 0;

        System.out.println("Escriba 7 numeros");
        while (i < 7) {

            numero[i] = num.nextInt();
 i++;
        }
 System.out.println("WHILE");
        i = 0;
        System.out.println("Estos son los numeros que elegiste");
        while (i < 7) {
            System.out.println(numero[i]);
            i++;
        }

    }
}