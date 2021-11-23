/**
 * Identifica positivos de negativos
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema05Ejercicio13 {
	
	public static void main (String[] args) {
		System.out.println("Introdcuce 10 número positivos o negativos");
    int n = 0;
    int cuentaNum = 0;
    int cuentaPos = 0;
    int cuentaNeg = 0;
    
    do {
      System.out.printf("Introduce un número: ");
      n = Integer.parseInt(System.console().readLine());
      if (n < 0) {
        cuentaNeg++;
      } else {
        cuentaPos++;
      }
      cuentaNum++;
    } while (cuentaNum < 10);
    System.out.println("Hay " + cuentaPos + " positivo/s y " + cuentaNeg + " negativo/s");
	}
}

