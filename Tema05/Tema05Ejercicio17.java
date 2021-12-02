/**
 * Bucle: Suma de 100 números
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema05Ejercicio17 {
	
	public static void main (String[] args) {
		System.out.println("Suma los 100 números siguientes al número introducido");
    System.out.print("Introduce un número: ");
    int n = Integer.parseInt(System.console().readLine());
    
    int i = 0;
    int siguiente = n+1;
    int sumaNum = 0;
    
    while (sumaNum <= 100) {
      i= n + siguiente;
      sumaNum++;
      System.out.println(i);
    }
	}
}

