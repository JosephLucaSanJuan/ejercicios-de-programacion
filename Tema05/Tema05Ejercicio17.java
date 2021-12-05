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
    
    int resultado = 0;
    int anterior = n+1;
    int siguiente = n;
    int sumaNum = 0;
    
    while (resultado <= n+100) {
      resultado = siguiente + 1;
      System.out.print(resultado + " ");
      siguiente = resultado;
      sumaNum++;
    }
    //int resFinal=resultado++;
    //System.out.println("\n" + resFinal);
	}
}

