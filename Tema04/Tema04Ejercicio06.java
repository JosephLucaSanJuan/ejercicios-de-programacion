/**
 * Calcula una operación
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio06 {
	
	public static void main (String[] args) {
		System.out.println("-------Calcula t=√2h/g, g=9.81---------");
    System.out.print("Introduce un valor de la altura en metros(m): ");
    double h = Double.parseDouble(System.console().readLine());
    
    if (h<=0) {
      System.out.println("Con estos datos no hay soluyción.");
    }
    else {
      double r = Math.sqrt((2*h)/9.81);
      System.out.printf("Tarda %.4f segundos" ,r);
    }
	}
}
