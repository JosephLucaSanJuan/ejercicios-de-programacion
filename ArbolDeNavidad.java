/**
 * Crea un arbol de navidad
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class ArbolDeNavidad {
	
	public static void main (String[] args) {
    System.out.println("Este programa pinta un árbol de Navidad");
		System.out.print("Introduce la altura: ");
    int alt = Integer.parseInt(System.console().readLine());
    
    for (int f=1; f<alt-2; f++) {
      System.out.print(" ");
    }
    System.out.println("⭐");
    
    int espacio=alt;
    int espCentral=0;
    
    for (int i = 1; i <= alt-3; i++) {
      for (int j = 1; j < espacio; j++) {
        System.out.print(" ");
      }
      System.out.println("\033[32m/");
      
      for (int j=0; j<espCentral; j++) {
        switch ((int) (Math.random()*8)) {
          case 0:
          System.out.print("\033[36m*");
          break;
          case 1:
          System.out.print("\033[35m+");
          break;
          case 2:
          System.out.print("\033[37mº");
          break;
          case 3:
          System.out.print("\033[34m@");
          break;
          default:
          System.out.print(" ");
        }
      }
      System.out.println("\033[32m\\");
      espacio--;
      espCentral += 2;
    }
    
    System.out.print("\033[32m/");
    for (int i = 0; i < espCentral; i++) {
      System.out.print("-");
    }
    System.out.println("\\");
    
    for (int f=1; f<alt-2; f++) {
      System.out.print(" ");
    }
    System.out.println("\033[33m#");
    for (int f=1; f<alt-2; f++) {
      System.out.print(" ");
    }
    System.out.println("\033[33m#");
	}
}

