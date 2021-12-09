/**
 * Nºs aleatorios
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema06Ejercicio05 {
	
	public static void main (String[] args) {
		System.out.println("Muestra 50 números enetros aleatorios entre 100 y 199 (ambos incluidos) separados por espacio:\n");
    
    // int nunMax;
    // int numMin;
    // int numMed;
    
    for (int j=1; j <= 50; j++) {
      System.out.print(" " + (int)(Math.random()*101+100) + " ");
    }
	}
}

