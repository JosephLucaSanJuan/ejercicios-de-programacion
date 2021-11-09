/**
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio03 {
  
	public static void main (String[] args) {
		System.out.print("Introduce un número del 1 al 7:");
    String line = System.console().readLine();
    int n = Integer.parseInt(line);
    
    if (n==1) {
      System.out.println("Hoy es lunes");
    } else if (n==2) {
      System.out.println("Hoy es martes");
    } else if (n==3) {
      System.out.println("Hoy es miercoles");
    } else if (n==4) {
      System.out.println("Hoy es jueves");
    } else if (n==5) {
      System.out.println("Hoy es viernes");
    } else if (n==6) {
      System.out.println("Hoy es sábado");
    } else if (n==7) {
      System.out.println("Hoy es domingo");
    } else {
      System.out.println("No es un resultado válido");
    }
	}
}
