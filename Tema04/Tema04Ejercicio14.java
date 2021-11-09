/**
 * Realiza un programa
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio14 {
	
	public static void main (String[] args) {
		System.out.println("Averigua si un numero es par y/o divisible entre 5");
    System.out.print("Introduce un número: ");
    int n = Integer.parseInt(System.console().readLine());
    
    int par = (n%2);
    int dividir = (n%5);
    
    if ((par==0) && (dividir==0)) {
      System.out.println("Correcto");
    } else if ((par!=0) && (dividir==0)) {
      System.out.println("Casi");
    } else if ((par==0) && (dividir!=0)) {
      System.out.println("Otro intento");
    } else if ((par!=0) && (dividir!=0)) {
      System.out.println("Incorrecto");
    }
	}
}

