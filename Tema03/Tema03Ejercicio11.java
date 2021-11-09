/**
 * 
 * 
 * @author Joseph Luca San Juan Thompson
 */
public class Tema03Ejercicio11 {
	
	public static void main (String[] args) {
		System.out.print("Introduce la cantidad de Kb que quieres convertir: ");
    int Kb = Integer.parseInt(System.console().readLine());
    
    int pasoMb = Kb/1000;
    System.out.printf(" %d Kb son %d Mb \n", Kb, pasoMb);
	}
}

