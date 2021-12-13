/**
 * Bucle: ¿es un número es par o no?
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema05Ejercicio16 {
	
	public static void main (String[] args) {
		System.out.println("Dí si un número es primo o no");
    System.out.print("Introduce un número: ");
    int n = Integer.parseInt(System.console().readLine());
    
    boolean Primo=true;
    
    for (int j=2; j<n; j++) {
      if ((n%j)==0) {
        Primo=false;
      }
    }
    
    if (Primo) {
      System.out.println("Es primo");
    } else {
      System.out.println("No es primo");
    }
	}
}

