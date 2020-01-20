/**
 * 
 */
package patroncuadrado;

/**
  @author enzohachi
 *
 */
import java.util.Scanner;
public class Patroncuadrado {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


Scanner input = new Scanner(System.in);
System.out.print("Ingrese numero: ");
int n = input.nextInt();
		
//ambos for son para generar una matriz por medio del ciclo anidado		
for (int fila = 0; fila < n; fila++) {
    for (int columna = 0; columna < n; columna++) {
	    
//fila ==0 es para que mas abajo pueda posicionarse en todas las filas que esten en posicion 0, osea dibujar una linea vertical en el lado izquierdo
//ó
//fila == n-1 es para que se posicione en el extremo derecho y dibujar la linea vertical 
//columna==0 es para posicionarse la linea superior horizontal
//columna==n-1 es para posicionarse en la linea inferior horizonal
	    
        if (fila == 0 || fila == n - 1 || columna==0|| columna==n-1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}}}
