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
    
    int j=2;
    
    while (j > 1) {
      if (n % j == 1) {
        System.out.println("Es primo");
      } else if (n % 3 == 0) {
        System.out.println("No es primo");
      } else if (n % 3 == 0) {
        System.out.println("No es primo");
      } else if (n % 5 == 0) {
        System.out.println("No es primo");
      } else if (n % 7 == 0) {
        System.out.println("No es primo");
      } else if (n % 11 == 0) {
        System.out.println("No es primo");
      } else {
      }
    }
	}
}

