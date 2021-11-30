/**
 * Num aleatorios: baraja francesa
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema06Ejercicio02 {
	
	public static void main (String[] args) {
		System.out.println("Muestra al azar las cartas de una baraja francesa:\n");
    
    int palo = (int)(Math.random() * 4 + 1);
    int carta = (int)(Math.random() * 13 + 1);
    
    switch (carta) {
      case 1:
      System.out.print("A");
      break;
      case 2:
      System.out.print("2");
      break;
      case 3:
      System.out.print("3");
      break;
      case 4:
      System.out.print("4");
      break;
      case 5:
      System.out.print("5");
      break;
      case 6:
      System.out.print("6");
      break;
      case 7:
      System.out.print("7");
      break;
      case 8:
      System.out.print("8");
      break;
      case 9:
      System.out.print("9");
      break;
      case 10:
      System.out.print("10");
      break;
      case 11:
      System.out.print("J");
      break;
      case 12:
      System.out.print("K");
      break;
      case 13:
      System.out.print("Q");
      break;
    }
    
    switch (palo) {
      case 1:
      System.out.print(" de picas");
      break;
      case 2:
      System.out.print(" de corazones");
      break;
      case 3:
      System.out.print(" de diamantes");
      break;
      case 4:
      System.out.print(" de tréboles");
      break;
    }
	}
}

