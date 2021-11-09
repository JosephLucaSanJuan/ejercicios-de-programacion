/**
 * Pasar Mb a Kb
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema03Ejercicio10 {
	
	public static void main (String[] args) {
		System.out.print("Introduce la cantidad de Mb que quieres convertir a Kb en numeros entero: ");
    int Mb = Integer.parseInt(System.console().readLine());
    
    int pasoKb = Mb*1000;
    System.out.printf(" %d Mb en Kb son %d Kb \n", Mb, pasoKb);
	}
}

