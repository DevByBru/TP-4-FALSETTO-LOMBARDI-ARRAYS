public class ej9 {

    public static void main(String[] args) {

        boolean[] pagos = {
            true, false, true, true, false,
            true, true, false, true, true
        };

        int pagaron = 0;
        int deudores = 0;

        double porcentaje;

        for (int i = 0; i < 10; i++) {

            if (pagos[i] == true) {

                pagaron++;

            } else {

                deudores++;

            }

        }

        porcentaje = (double) pagaron * 100 / 10;

        System.out.println("cantidad de pagos: " + pagaron);
        System.out.println("cantidad de deudores: " + deudores);
        System.out.println("porcentaje de cobranza: " + porcentaje + "%");
    }
}