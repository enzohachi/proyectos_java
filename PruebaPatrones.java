/**
 * 
 */
package pruebaspatrones;

/**
 * @author enzohachi
 *
 */
import java.util.Scanner;
public class PruebaPatrones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese numero: ");
		int n = input.nextInt();
//para hacer la matriz con ciclo anidado se utilizan ambos "for"
	for (int fila = 0; fila < n; fila++) {
		    for (int columna = 0; columna < n; columna++) {
		    
			    
//fila==0 && columna!=n-1 es para que se posicione en todo el extremo superior de la matriz, excepto por la ultima posicion de esta fila
//ó
//fila==n-1 && columna!=0 es para que se posicione en todo el extremo inferior de la matriz, excepto por la primera posicion de esta fila
		if ((fila==0 && columna!=n-1)||(fila==n-1 && columna!=0)) {
		    	System.out.print("*");
		    }
			    
			    
//fila>=1&& fila!=n-1 es para que se posicione desde la posicion 1 y no cero dentro de la fila, ademas de no llegar a la ultima fila
//columna>=1&& columna!=n-1 es para que se posicione desde la posicion 1 y no cero dentro de la columna, ademas de no llegar a la ultima columna
		    else if (((fila>=1&& fila!=n-1) && (columna>=1 && columna!=n-1))) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}}}
	


