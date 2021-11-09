/**
 * Resuelve una ecuación
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio05 {
	
	public static void main (String[] args) {
		System.out.println("---------Este programa resuelve ecuaciones de primer grado del tipo ax+b=0----------");
    System.out.print("Introduce el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Ahora intoduce el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    if (a==0) {
      if (b==0) {
        System.out.println("Esta ecuación tiene infinitas soluciones, es compatible indeterminado");
      } else {
        System.out.println("Esta ecuación no tiene solución");
      }
    } else {
      System.out.println("x = " + (-b/a));
    }
	}
}

