/**
 * Bucle: abre una caja fuerte con un código de 4 dígitos. Tienes 4 oportunidades
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema05Ejercicio07 {
	
	public static void main (String[] args) {
		System.out.println("Abre una caja fuerte con un código de 4 dígitos");
    System.out.println("Tienes 4 oportunidades");
    
    int numIntro;
    
    do {
      System.out.print("Introduce un número de 4 dígitos: ");
      numIntro = Integer.parseInt(System.console().readLine());
      
      if (numIntro==2468) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      } else {
        System.out.println("Lo siento, esa no es la combinación");
      }
    } while (numIntro==2468);
	}
}

