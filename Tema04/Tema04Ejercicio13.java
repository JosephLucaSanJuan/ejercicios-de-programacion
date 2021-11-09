/**
 * Ordena tres numeros
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio13 {
	
	public static void main (String[] args) {
    double primerNumero = 0;
    double segundoNumero = 0;
    double tercerNumero = 0;
    
		System.out.print("Introduce un numero entero: ");
    double num01 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce otro número entero: ");
    double num02 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce otro número entero: ");
    double num03 = Double.parseDouble(System.console().readLine());
    
    if(num01 >= num02){
      primerNumero = num03;
      segundoNumero = num02;
      tercerNumero = num01;
      if(num01 <= num03){
        primerNumero = num01;
        segundoNumero = num02;
        tercerNumero = num03;
      } else if(num02 < num03){
        primerNumero = num02;
        segundoNumero = num03;
        tercerNumero = num01;
      }
    } else {
      primerNumero = num03;
      segundoNumero = num02;
      tercerNumero = num01;
      if(num02 < num03){
        primerNumero = num03;
        segundoNumero = num02;
        tercerNumero = num01;
      } else if(num01 < num03){
        primerNumero = num02;
        segundoNumero = num03;
        tercerNumero = num01;
      }
    }
    
    System.out.print("El orden es: primero " + primerNumero + " segundo " + segundoNumero + " y tercero " + tercerNumero);
	}
}

