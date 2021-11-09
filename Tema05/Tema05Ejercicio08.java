/**
 * Tabla de multiplicar
 * 
 * @author Joseph Luca san Juan Thompson
 */


public class Tema05Ejercicio08 {
	
	public static void main (String[] args) {
		int p=0;
    
    System.out.print("Introduce un número: ");
    int m = Integer.parseInt(System.console().readLine());
    
    for (int i=1; i<=11; p=m*(i++)) {
      System.out.println(p);
    }
	}
}
