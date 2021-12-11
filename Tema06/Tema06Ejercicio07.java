/**
 * Nºs aleatorios
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema06Ejercicio07 {
	
	public static void main (String[] args) {
		System.out.println("Muestras 3 apuestas en 3 columnas para los 14 partidos y el pleno al 15");
    
    int rep = 1;
    
    while (rep <= 14) {
      int x1 = (int)(Math.random()*3);
      int x2 = (int)(Math.random()*3);
      int x3 = (int)(Math.random()*3);
      rep++;
      /** if (x1==0) {
        System.out.println("| X | " + x2 + " | " + x3 + " |");
        if (x2==0) {
          System.out.println("| " + x1 + " | X | " + x3 + " |");
          if (x3==0) {
            System.out.println("| " + x1 + " | " + x2 + " | X |");
          } else {
          }
        } else {
        }
      } else {
      } */
      System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
    }
	}
}
