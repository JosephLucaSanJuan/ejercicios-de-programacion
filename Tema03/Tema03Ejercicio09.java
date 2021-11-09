/**
 * 
 * 
 * @author Joseph Luca San Juan Thompson
 */
public class Tema03Ejercicio09 {
	public static void main (String[] args) {
		System.out.print("Por favor escribe la altura del cono: ");
    double alturaCono=Double.parseDouble(System.console().readLine());
    System.out.print("Por favor escribe el radio de la base del cono: ");
    double radioBase=Double.parseDouble(System.console().readLine());
    
    System.out.println("El volumen del cono es " + (1.0/3.0 * 3.14 * radioBase * 2 * alturaCono));
	}
}

