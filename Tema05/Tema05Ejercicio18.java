/**
 * Bucle
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema05Ejercicio18 {
	
	public static void main (String[] args) {
		System.out.println("Introduce dos números y obtiene todos los numeros enteros (de 7 en 7) comprendidos entre ellos");
    System.out.print("Introudce un número: ");
    int n1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introudce otro número: ");
    int n2 = Integer.parseInt(System.console().readLine());
    
    int resultado = 0;
    int cuentaNum=0;
    int anterior = n2;
    int siguiente = n1;
    
    if (n1 > n2) {
      while (resultado < n1) {
        resultado = anterior + 7;
        System.out.print(resultado + " ");
        anterior = resultado;
        cuentaNum++;
      }
    } else if (n1 < n2) {
      while (resultado < n2) {
        resultado = siguiente + 7;
        System.out.print(resultado + " ");
        siguiente = resultado;
        cuentaNum++;
      } 
    }
	}
}
