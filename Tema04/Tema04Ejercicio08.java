/**
 * 
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio08 {
	
	public static void main (String[] args) {
    System.out.println("Calcula la media de tres notas");
    System.out.print("Asigna un valor a la primera nota: ");
    double primeraNota = Double.parseDouble(System.console().readLine());
    System.out.print("Asigna un valor a la segunda nota: ");
    double segundaNota = Double.parseDouble(System.console().readLine());
    System.out.print("Asigna un valor a la tercera nota: ");
    double terceraNota = Double.parseDouble(System.console().readLine());
    
    double media = ((primeraNota + segundaNota + terceraNota)/3);
    
    if ((media>=0) && (media < 5)) {
      System.out.println("Insuficiente");
    }
    if ((media>=5) && (media < 6)) {
      System.out.println("Suficiente");
    }
    if ((media>=6) && (media < 7)) {
      System.out.println("Bien");
    }
    if ((media>=7) && (media < 9)) {
      System.out.println("Notable");
    }
    if ((media>=9) && (media < 10)) {
      System.out.println("Sobresaliente");
    }
	}
}

