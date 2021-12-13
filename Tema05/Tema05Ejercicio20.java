/**
 * Bucle
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema05Ejercicio20 {
	
	public static void main (String[] args) {
		System.out.println("Crea una pirámide");
    System.out.print("Introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el carácter con el cuál quieres formar la pirámide: ");
    String cj = System.console().readLine();
    
    int altura=1;
    int espacio=h-1;
    int espCentr=1;
    
    while (altura < h) {
      for (int j=1; j<=espacio; j++) {
        System.out.print(" ");
      }
      
      System.out.print(cj);
      
      for (int j=1; j<espCentr; j++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(cj);
      }
      System.out.println();
      altura++;
      espacio--;
      espCentr += 2;
    }
    
    for (int j=1; j<altura*2; j++) {
      System.out.print(cj);
    }
	}
}

