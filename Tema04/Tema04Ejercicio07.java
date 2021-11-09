/**
 * Calucla la media de 3 notas
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio07 {
	
	public static void main (String[] args) {
		System.out.println("Calcula la media de tres notas");
    System.out.print("Asigna un valor a la primera nota: ");
    double primeraNota = Double.parseDouble(System.console().readLine());
    System.out.print("Asigna un valor a la segunda nota: ");
    double segundaNota = Double.parseDouble(System.console().readLine());
    System.out.print("Asigna un valor a la tercera nota: ");
    double terceraNota = Double.parseDouble(System.console().readLine());
    
    System.out.printf("La media de las tres notas es: " + (primeraNota + segundaNota + terceraNota)/3);
	}
}

