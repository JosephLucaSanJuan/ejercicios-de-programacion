/**
 * Nº aleatorios
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema06Ejercicio04 {
	
	public static void main (String[] args) {
		System.out.println("Muestra 20 numeros aleatorios entre el 1 y el 10 (incluyendo a ambos) separados por espacios:\n");
    
    for (int i = 1; i <= 20; i++) {
      System.out.print(" " + (int)(Math.random()*10) + " ");
    }
    System.out.println();
	}
}
