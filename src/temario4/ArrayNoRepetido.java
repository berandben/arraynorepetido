package temario4;

/**
 *
 * @author Ber&ben
 */
public class ArrayNoRepetido {

    public static void main(String[] args) {

        //declaro el array
        int[] miarray = new int[10];
        //declaro e inicializo un contador para las coincidencias y el número de 
        //arrays generados.
        int coincidencias;
        int arrays = 0;

        do {
            //reinicio el valor de las coincidencias e incremento en 1 el número
            //de arrays generados
            coincidencias = 0;
            arrays++;

            //relleno el array
            for (int i = 0; i < miarray.length; i++) {

                miarray[i] = (int) (Math.round(Math.random() * (1 - 100) + 100));

            }

            //compruebo las coincidencias
            for (int i = 0; i < miarray.length; i++) {

                for (int j = i + 1; j < miarray.length; j++) {

                    if (miarray[i] == miarray[j]) {

                        System.out.println("Se han encontrado coincidencias en las posiciones " + (i + 1) + " " + (j + 1));

                        coincidencias++;

                    }

                }

            }

            // imprimo el array y el número de coincidencias
            System.out.println("Array numero " + arrays);

            for (int i = 0; i < miarray.length; i++) {
                System.out.print(miarray[i] + " ");

            }

            if (coincidencias > 0) {

                System.out.println("\nCoincidencias " + coincidencias);

            } else {

                System.out.println("\nCoincidencias " + coincidencias);

            }

            System.out.println("\n-----------------------\n");

        } while (coincidencias > 0);// el bucle se repite mientras haya coincidencias

        //imprimo el número de arrays generados y finalizo el programa
        System.out.println("Arrays generados " + arrays + "\nFIN DEL PROGRAMA");

    } // fin del main

}
