/**
 * Calcula salario semanal
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio04 {
	
	public static void main (String[] args) {
		System.out.print("Introduce el numeros de horas trabajadas durante una semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if ((horasTrabajadas>=1) && (horasTrabajadas<=40)) {
      System.out.println("El salario semanal es: " + (horasTrabajadas*12) + "$");
    }
    if (horasTrabajadas>=41) {
      int horasExtras = horasTrabajadas - 40; 
      System.out.println("El salario semanal es es: " + (40 * 12 + horasExtras * 16) + "$");
    }
	}
}

