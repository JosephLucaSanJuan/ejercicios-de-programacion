/**
 * Num Aleatorio
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema06Ejercicio11 {
	
	public static void main (String[] args) {
		System.out.println("Muestra 20 notas al azar");
    System.out.println("Cuenta cuantas de cada tipo hay");
    
    int nota = 0;
    int cuentaSobr=0;
    int cuentaNot=0;
    int cuentaBien=0;
    int cuentaSuf=0;
    int cuentaSus=0;
    
    for (int i=0; i < 20; i++) {
      nota = (int)(Math.random()*5);
      
      switch (nota) {
        case 1:
          System.out.print(" sobresaliente ");
          cuentaSobr++;
          break;
        case 2:
          System.out.print(" notable ");
          cuentaNot++;
          break;
        case 3:
          System.out.print(" bien ");
          cuentaBien++;
          break;
        case 4:
          System.out.print(" suficiente ");
          cuentaSuf++;
          break;
        case 5:
          System.out.println(" suspenso ");
          cuentaSus++;
          break;
        default:
      }
    }
    System.out.println("\n Hay " + cuentaSobr + " sobresalientes, " + cuentaNot + " notable," + cuentaBien + " bienes, " + cuentaSuf + " suficientes, " + cuentaSus + " suspensos");
	}
}

