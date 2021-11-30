/**
 * Numeros aleatorios
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema06Ejercicio01 {
	
	public static void main (String[] args) {
		System.out.println("Muestra la tirada de tres dados:\n");
    
    int tirada;
    
    for (int j=1; j <= 3; j++) {
      tirada = (int)(Math.random()*6);
      switch (tirada) {
        case 0:
          System.out.println("⚀");
          break;
        case 1:
          System.out.println("⚁");
          break;
        case 2:
          System.out.println("⚂");
          break;
        case 3:
          System.out.println("⚃");
          break;
        case 4:
          System.out.println("⚄");
          break;
        case 5:
          System.out.println("⚅");
          break;
      }
    }
	}
}

