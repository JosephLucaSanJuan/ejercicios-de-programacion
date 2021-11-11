/**
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio09 {
	
	public static void main (String[] args) {
		System.out.println("Resuelve ax2 + bx + c = 0");
    System.out.print("Introduce un valor para a: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce valor para b: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce valor para c: ");
    int c = Integer.parseInt(System.console().readLine());
    
    if (a==0) {
      if (b==0) {
        if (c==0) {
          System.out.println("Esta ecuación tiene infinitas soluciones, es compatible indeterminado");
        } else {
          System.out.println("Esta ecuación no tiene solución");
        }
      } else {
        System.out.prinln("x = " + ((-b + √b2 - 4*(a*c))/(2*a)));
      }
    } else {
    System.out.println("x = " + ((-b + √b2 - 4*(a*c))/(2*a)));
    }
	}
}

