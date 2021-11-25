/**
 * Bucle for: Calcula potencia apartir de base y exponente
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema05Ejercicio14 {
	
	public static void main (String[] args) {
		System.out.print("Introduce una base: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un exponente: ");
    int exp = Integer.parseInt(System.console().readLine());
    
    int potencia = 1;
    int i = 1;
    
    while (i <= exp) {
      i++;
      potencia = potencia*b;
    }
    System.out.println(potencia);
	}
}
