/**
 * Num aleatroios: aduivina un número
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema06Ejercicio06 {
	
	public static void main (String[] args) {
		System.out.println("Adivina un número al azar entre 0 y 100");
    System.out.println("Tienes 5 oportunidades");
    
    int numRand = (int)(Math.random()*101);
    int numPreg=1;
    
    while (numPreg <= 5) {
      numPreg++;
      
      System.out.print("Adivina el número: ");
      int n = Integer.parseInt(System.console().readLine());

      if (n == numRand) {
        System.out.println("Enhorabuena! Has acertado!");
      } else if (n > numRand){
        System.out.println("Lo siento. Prueba uno más pequeño");
      } else if (n < numRand) {
        System.out.println("Lo siento. Prueba uno más grande");
      }
    }
    //System.out.println(numRand);
	}
}
