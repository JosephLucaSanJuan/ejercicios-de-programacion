/**
 * Bucle: 
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema05Ejercicio15 {
	
	public static void main (String[] args) {
    System.out.println("Saca todas las potencias de una base con exponentes entre uno y exp");
		System.out.print("Introduce una base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un exponente: ");
    int exp = Integer.parseInt(System.console().readLine());
    
    int cuentaPot = 0;
    int i = 0;
    int e = 0;
    
    for (int p=1; cuentaPot <= exp; cuentaPot++) {
      while (i <= exp) {
      i++;
      p = p*base;
      }
    }
    System.out.println(cuentaPot);
	}
}

