/**
 * Nº aleatorios
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema06Ejercicio03 {
	
	public static void main (String[] args) {
		System.out.println("Muestra al azar las cartas de una baraja española:\n");
    
    int carta = (int)(Math.random()*10+1);
    int palo = (int)(Math.random()*4+1);
    
    switch (carta) {
      case 1:
      System.out.print("As de");
      break;
      case 2:
      System.out.print("2 de");
      break;
      case 3:
      System.out.print("3 de");
      break;
      case 4:
      System.out.print("4 de");
      break;
      case 5:
      System.out.print("5 de");
      break;
      case 6:
      System.out.print("6 de");
      break;
      case 7:
      System.out.print("7 de");
      break;
      case 8:
      System.out.print("Sota de");
      break;
      case 9:
      System.out.print("Caballo de");
      break;
      case 10:
      System.out.print("Rey de");
      break;
    }
    
    switch (palo) {
      case 1:
      System.out.print(" espadas");
      break;
      case 2:
      System.out.print(" copas");
      break;
      case 3:
      System.out.print(" bastones");
      break;
      case 4:
      System.out.print(" oros");
      break;
    }
	}
}

