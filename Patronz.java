/**
 * 
 */
package patronz;

/**
 * @author enzohachi
 *
 */
import java.util.Scanner;
public class Patronz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
	    System.out.print("Ingrese numero: ");
	    int n = input.nextInt();
//sirve para hacer la matriz con un ciclo anidado
	    for (int fila = 0; fila < n; fila++) {
	        for (int columna = 0; columna < n; columna++) {

			
// fila ==0 es para poscionarse en el extremo superior de la matriz
//ó
// columna = n -1 es para posicionarse en el extremo inferior de la matriz
//ó
// columna == n -1 - fila es para posicionarse en forma de backslash o slash invertido y asi poder formar la "Z"
			// tambien podria ser fila ==n-1-columna y daria el mismo resultado
	            
			if (fila == 0 || fila == n - 1 || columna == n - 1 - fila) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }}}
