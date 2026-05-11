import java.util.Scanner;

public class ej8 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        String[] nombres = new String[20];
        double[] sueldos = new double[20];
        double mayor;
        String nombremayor;

        for (int i = 0; i < 20; i++) {

            System.out.println("ingrese nombre");
            nombres[i] = num.nextLine();
            System.out.println("ingrese sueldo");
            sueldos[i] = num.nextDouble();
            num.nextLine();
        }

        mayor = sueldos[0];
        nombremayor = nombres[0];

        for (int i = 1; i < 20; i++) {

            if (sueldos[i] > mayor) {

                mayor = sueldos[i];
                nombremayor = nombres[i];

            }
        }
        System.out.println("empleado que mas gana: " + nombremayor);
        System.out.println("sueldo: " + mayor);
    }
}