/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temario4;

/**
 *
 * @author Ber&ben
 */
public class InsertarNumerosOrdenados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Declaro e inicializo el array
        int[] arraydenumeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //Declaro e inicializo el número a insertar y lo imprimo
        int minumero = 45;
        System.out.println("mi numero es :" + minumero);
        //Imprimo el array incial con un for
        for (int i = 0; i < arraydenumeros.length; i++) {
            System.out.println("posicion " + i + " => " + arraydenumeros[i]);

        }

        /*For que recorre desde la última posición del array, mientras
        que eliterador se mayor o igual que 0, que va decrementando en
        1 en cada vuelta*/
        for (int i = arraydenumeros.length - 1; i >= 0; i--) {

            /*Si la iteración es mayor que el número introducido
            se introduce en la misma el valor de una posición menos
            Ej:El valor de la posición 8 se introduce en la 9 y así 
            sucesivamente
            */
            if (arraydenumeros[i] > minumero) {

                arraydenumeros[i] = arraydenumeros[i - 1];

            }

            /*Si el número introducido se encuentra entre el valor de la iteración
            y del la superior, se introduce el número en el lugar de la iteración
             */
            if (minumero > arraydenumeros[i] && minumero < arraydenumeros[i + 1]) {

                arraydenumeros[i] = minumero;

            }

        }
        //Imprimo un salto de línea y el nuevo array generado
        System.out.println("");

        for (int i = 0; i < arraydenumeros.length; i++) {
            System.out.println("posicion " + i + " => " + arraydenumeros[i]);

        }

    }// fin del main

}
