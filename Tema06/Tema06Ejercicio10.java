/**
 * Num Aleatorio
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema06Ejercicio10 {
	
	public static void main (String[] args) {
		System.out.println("Crea diez líneas de entre 1 y 40 carácteres");
    
    int longitud=1;
    int caracter=0;
    String simbolo = "";
    
    for (int i=0; i < 10; i++) {
     caracter=(int)(Math.random()*6);
     longitud=(int)(Math.random()*40)+1;
     
     switch (caracter) {
       case 1:
        simbolo="*";
        break;
       case 2:
        simbolo="-";
        break;
       case 3:
        simbolo="=";
        break;
       case 4:
        simbolo=".";
        break;
       case 5:
        simbolo="|";
        break;
       case 6:
        simbolo="@";
        break;
       default:
      }
      
      for (int j=1; j<=longitud; j++) {
      System.out.print(simbolo);
      }
      System.out.println();
    }
	}
}

