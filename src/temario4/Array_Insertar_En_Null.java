package temario4;

import java.util.Scanner;

/**
 * Supón que tenemos un array de números enteros, ordenado, pero que puede
 * contener huecos (null) donde insertar un número. Supongamos que los nulos,
 * los huecos están al final. Queremos poder insertar un número al array, y que
 * siga estando ordenado ascendentemente. ¿Cómo lo harías? Una idea puede ser:
 * primero comprobar si hay hueco, y si no lo hay aviso y termino. Si lo hay,
 * empiezo a recorrer el array y si es nulo, lo inserto sin más, si no, comparo
 * si el elemento que quiero insertar es menor que el de la posición actual del
 * array. Cuando detecte un número mayor que el que yo quiero insertar, tendré
 * que desplazar los elementos del array desde esa posición en adelante para
 * abrir hueco.
 *
 *
 *
 * @author Ber&ben
 */
public class Array_Insertar_En_Null {

    public static void main(String[] args) {

        int huecos = 0;

        int[] miarray = new int[10];

        miarray[0] = 10;
        miarray[1] = 20;
        miarray[2] = 30;
        miarray[3] = 40;
        miarray[4] = 50;
        miarray[5] = 60;

        Scanner sc = new Scanner(System.in);

        do {
            huecos = 0;
            System.out.println("Array Inicial");
            for (int i = 0; i <= miarray.length - 1; i++) {
                System.out.println("Posición " + i + " " + miarray[i]);

                if (miarray[i] == 0) {
                    huecos++;
                }
            }

            System.out.println("Hay " + huecos + " huecos disponibles");

            if (huecos < 0) {

                System.out.println("\nEl programa finalizará, no hay huecos disponibles");

            } else {

                System.out.println("\nIntroduzca un número");
                int num = sc.nextInt();

                System.out.println("El número introducido es " + num);

                if (num > 0 && num < 10) {

                    int posicionentrada = 0;
                    System.arraycopy(miarray, posicionentrada, miarray, (posicionentrada + 1), (miarray.length - 1));

                    miarray[posicionentrada] = num;
                    huecos--;

                }

                for (int i = 0; i < miarray.length - 1; i++) {

                    if (num > miarray[i] && num < miarray[i + 1]) {

                        int posicionentrada = i + 1;

                        System.arraycopy(miarray, posicionentrada, miarray, (posicionentrada + 1), (miarray.length - 1) - posicionentrada);

                        miarray[posicionentrada] = num;
                        huecos--;

                    } else if (miarray[i] > 0 && num > miarray[i] && miarray[i + 1] == 0) {

                        int posicionentrada = i + 1;

                        miarray[posicionentrada] = num;
                        huecos--;

                    }

                }
                System.out.println("Nuevo array generado");

                for (int i = 0; i < miarray.length; i++) {

                    System.out.println("Posición " + i + " " + miarray[i]);
                }

                System.out.println("Quedan " + huecos + " huecos disponibles\n");

            }

        } while (huecos > 0);

    }
}
