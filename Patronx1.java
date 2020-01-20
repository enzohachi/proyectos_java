/**
 * 
 */
package patronx1;

/**
 * @author Nonita
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
	

		for(int fila=0; fila<num; fila++){
		    for(int columna=0; columna<num; columna++){
		        if(fila==columna  || (fila+columna)==num-1){
		            System.out.print("x");
		        }else{
		            System.out.print(" ");
		        }
		    }System.out.println();
		}}}