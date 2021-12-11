/**
 * Num Aleatorio
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema06Ejercicio09 {
	
	public static void main (String[] args) {
		System.out.println("Números aleatorios pares del 0 al 100 hasta que salga el 24");
    System.out.println("Decir cuantos hay");
    
    int numAl=0;
    int cuentaNum=0;
    
    while (numAl != 24) {
      numAl = (int)(Math.random()*51)*2;
      System.out.print(numAl + " ");
      cuentaNum++;
    }
    System.out.println("\n Se han generado " + cuentaNum + " números");
	}
}

