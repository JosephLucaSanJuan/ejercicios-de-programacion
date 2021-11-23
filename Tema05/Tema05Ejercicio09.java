/**
 * bucle: identificar cuantos dígitos tiene un número
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema05Ejercicio09 {
	
	public static void main (String[] args) {
		System.out.println("Identifica el número de dígitos de un número");
    System.out.print("Introduce un número: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int numDiv = 0;
    
    while (num!=0) {
      numDiv++;
      num=num/10;
    }
    
    System.out.println("El número introducido tiene " + numDiv + " dígitos");
	}
}
