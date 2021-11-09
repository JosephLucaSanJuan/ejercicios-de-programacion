/**
 * 
 * 
 * @author Josep Luca San Juan Thompson
 */
public class Tema03Ejercicio01 {
	public static void main (String[] args) {
		System.out.print("Introduce un numero: ");
    double x = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce otro numero: ");
    double y = Integer.parseInt(System.console().readLine());
    
    double resultado = (x * y);
    System.out.printf("La multiplicacion de %.2f y %.2f es %.2f"  ,x ,y ,resultado);
  }
}

