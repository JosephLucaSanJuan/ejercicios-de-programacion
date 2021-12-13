/**
 * Num Aleatorios
 * 
 * @author Luis José Sánchez
 */


public class Tema06Ejercicio13 {
	
	public static void main (String[] args) {
		System.out.println("Suma la tirada de dos dados que se repita hasta que los dos sean iguales");
    
    int dado1=(int)(Math.random()*6);
    int dado2=(int)(Math.random()*6);
    int repDado1=0;
    int repDado2=0;
    
    switch (dado1) {
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
      default:
    }
    
    switch (dado2) {
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
      default:
    }
    
    while (dado1==dado2) {
      repDado1++;
      System.out.print("\n" + dado1);
      repDado2++;
      System.out.print("\n" + dado2);
    }
    System.out.println();
	}
}

