/**
 * 
 */
package patronz;

/**
 * @author Nonita
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
	    for (int fila = 0; fila < n; fila++) {
	        for (int columna = 0; columna < n; columna++) {
	            if (fila == 0 || fila == n - 1 || columna == n - 1 - fila) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }}}
