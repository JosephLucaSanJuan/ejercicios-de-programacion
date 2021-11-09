/**
 * Calcula los segundos hasta medianoche
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio11 {
	
	public static void main (String[] args) {
		 System.out.print("Introduce la hora: ");
     int h = Integer.parseInt(System.console().readLine());
     System.out.print("Introduce los minutos: ");
     int min = Integer.parseInt(System.console().readLine());
     
     int segundos = ((24-h)*3600 + (60-min)*60);
     
     System.out.println("Segundos hasta medianoche: " + segundos);
	}
}

