package temario4;

public class DeplazaArray {

    public static void main(String[] args) {

        int[] miarray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int num = 8;
        
        System.out.println("El número a intercalar es el : " + num);
        System.out.println("El array inicial es: \n");

        for (int i = 0; i <= miarray.length - 1; i++) {

            System.out.println("posicion " + i + " " + miarray[i]);

        }

        System.out.println("\n*********************");

        System.out.println("El resultado del array es: ");

        if (num > 0 && num < 10) {

            int posicionentrada = 0;

            System.arraycopy(miarray, 0, miarray, 1, (miarray.length - 1));

            miarray[0] = num;

        }

        for (int i = 0; i <= (miarray.length-1); i++) {

            if (num > miarray[i] && num < miarray[i + 1]) {

                int posicionentrada = i + 1;

                System.arraycopy(miarray, posicionentrada, miarray, (posicionentrada + 1), (miarray.length - 1) - posicionentrada);

                miarray[posicionentrada] = num;

            }

            System.out.println("posicion " + i + " " + miarray[i]);

        }// fin for

    }

}
