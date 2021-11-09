/**
 * Decir la hora
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio02 {
	
	public static void main (String[] args) {
		System.out.print("¿Qué hora es?: Son las ");
    String line = System.console().readLine();
    int h = Integer.parseInt(line);
    
    if ((h>=6) && (h<=12)) {
      System.out.println("buenos días");
    } else if ((h>=13) && (h<=20)) {
      System.out.println("buenas tardes");
    } else if ((h>=21) && (h<=5)) {
      System.out.println("buenas noches");
    } else {
        System.out.println("Esa hora no existe");
      }
	}
}

