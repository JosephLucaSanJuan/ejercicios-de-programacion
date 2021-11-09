/**
 * 
 * 
 * @author Joseph Luca san Juan Thompson
 */
public class Tema03Ejercicio08 {
	
	public static void main (String[] args) {
    System.out.print("Introduce el numero de horas trabajadas a la semana: ");
    int horasTrabajadas=Integer.parseInt(System.console().readLine());
    
    System.out.printf("Su salario semanal es de " + (horasTrabajadas * 12) + " euros");
	}
}
