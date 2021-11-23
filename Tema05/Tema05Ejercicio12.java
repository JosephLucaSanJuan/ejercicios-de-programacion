/**
 * Bucle: serie de Fibonacci
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema05Ejercicio12 {
	
	public static void main (String[] args) {
		System.out.print("Introduce el número de términos de la serie de Fibonacci, empezando desde el primero, que quieres ver: ");
    int n = Integer.parseInt(System.console().readLine());
    int anterior = 0;
    int siguiente = 1;
    int resultado;
    int cuentaNum=2;
    
    if (n==1) {
      System.out.println("0");
    } else if (n==2) {
      System.out.println("0 1");
    } else if (n==0) {
      System.out.println("");
    } else {
      System.out.print("0 1 ");
      do {
        resultado = anterior + siguiente;
        System.out.print(resultado + " ");
        anterior = siguiente;
        siguiente = resultado;
        cuentaNum++;
      } while (cuentaNum < n);
    }
	}
}

