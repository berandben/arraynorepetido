
package temario4;

/**
 *
 * @author Ber&ben
 */


public class OrdenaArray {

    public static void main(String[] args) {
        //declaro un array n 
        int[] n = {5, 7, 3};
        
        //imprimo el array con un bucle for               
        System.out.print("Array Inicial :");
        for (int i = 0; i <n.length; i++) {
            
            System.out.print(n[i]);
            
        }
        
        System.out.println("");
        
       /*Comparo las diferentes posiciones, voy intercambiando los valores
        que sean más pequeños por los más grandes
        
        Se compara el 1º con el 2º, el 1º con el 3º y después el 2º con el 3º*/
        
        for (int i = 0; i <= (n.length - 1); i++) {

            for (int j = i + 1; j < n.length; j++) {

                System.out.println("\nCompara \n n[i" + i + "] " + n[i] + " n[j" + j + "] " + n[j]);

                if (n[i] > n[j]) {

                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;

                }

                System.out.println("\nDevuelve \n[i" + i + "] " + n[i] + " n[j" + j + "] " + n[j]);
                System.out.println("\nAhora vale " + n[0] + " " + n[1] + " " + n[2]);
            }

        }

    }

}
