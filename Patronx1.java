/**
 * 
 */
package patronx1;

/**
 * @author enzohachi
 *
 */
import java.util.Scanner;
public class Patronx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese numero ");
		Scanner sc= new Scanner (System.in);
		int num = sc.nextInt();
	
// ambos for son para crear la matriz con un ciclo anidado
		for(int fila=0; fila<num; fila++){
		    for(int columna=0; columna<num; columna++){
			    
//fila=columna es para cuando existe igualdad de numero de fila con columna, esto es para poder dibujar el backslash (o slash invertido) para poder esa linea de la forma de X
//fila+columna=num-1 es para igualar la suma de fila con columna con la cantidad del imput impuesto menos 1, porque se cuenta desde el cero, de esta forma se obtiene el otro slach para poder imprimir ambos mas bajo  
		        if(fila==columna  || (fila+columna)==num-1){
		            System.out.print("x");
		        }else{
		            System.out.print(" ");
		        }
		    }System.out.println();
		}}}
