/**
 * Bucle: crear tabla de multiplos cubo y cuadrado
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema05Ejercicio11 {
	
	public static void main (String[] args) {
		System.out.println("Introduce un numero entero");
    int n = Integer.parseInt(System.console().readLine());
    
    for (int i=n; i<n+5; i++) {
      System.out.println(i + " " + i*i + " " + i*i*i);
    }
	}
}

