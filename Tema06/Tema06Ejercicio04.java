/**
 * Nº aleatorios
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema06Ejercicio04 {
	
	public static void main (String[] args) {
		System.out.println("Muestra 20 numeros aleatorios entre el 0 y el 10 (incluyendo a ambos) separados por espacios:\n");
    
    for (int i = 0; i <= 20; i++) {
      System.out.print(" " + (int)(Math.random()*11) + " ");
    }
    System.out.println();
	}
}
