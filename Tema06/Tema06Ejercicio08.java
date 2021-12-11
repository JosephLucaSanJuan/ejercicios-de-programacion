/**
 * Num. Aleatorios
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema06Ejercicio08 {
	
	public static void main (String[] args) {
		System.out.println("Muestras 3 apuestas en 3 columnas para los 14 partidos y el pleno al 15");
    
    int rep = 1;
    
    while (rep <= 14) {
      int x1 = (int)(Math.random()*3);
      int x2 = (int)(Math.random()*3);
      int x3 = (int)(Math.random()*3);
      rep++;
      
      switch(x1) {
        case 0:
        System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
        break;
        case 1:
        System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
        break;
        case 2:
        System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
        break;
      }
      
      /** if (x1==1) {
        x1=1/2;
        System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
      } else if (x1==2) {
        x1=1/6;
        System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
      } else if (x1==0) {
        x1=1/3;
        System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
      }
      if (x2==1) {
        x2=1/2;
        System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
      } else if (x2==2) {
        x2=1/6;
        System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
      } else if (x2==0) {
        x2=1/3;
        System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
      }
      if (x3==1) {
        x3=1/2;
        System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
      } else if (x3==2) {
        x3=1/6;
        System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
      } else if (x3==0) {
        x3=1/3;
        System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
      }*/
      
      System.out.println("| " + x1 + " | " + x2 + " | " + x3 + " |");
    }
	}
}
