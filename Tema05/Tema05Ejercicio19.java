/**
 * Bucle
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema05Ejercicio19 {
	
	public static void main (String[] args) {
		System.out.println("Crea una pirámide");
    System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el carácter con el cuál quieres formar la pirámide: ");
    String cj = System.console().readLine();
    
    int longLinea = 1;
    int base=1;
    int espacio=h-1;
    
    while (base <= h) {
      for (int j=1; j<=espacio; j++) {
        System.out.print(" ");
      }
      
      for (int k=1; k<=longLinea; k++) {
        System.out.print(cj);
      }
      
      System.out.println();
      
      base++;
      espacio--;
      longLinea += 2;
    }
	}
}

