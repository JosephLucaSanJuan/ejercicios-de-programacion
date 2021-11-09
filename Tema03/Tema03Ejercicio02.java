/**
 * Realizar conversor de euros a pesetas
 * 
 * @author Joseph Luca San Juan Thompson
 */
public class Tema03Ejercicio02 {
	public static void main (String[] args) {
		System.out.print("Introduce el valor de euros que quieres convertir: ");
    int pesetas=Integer.parseInt(System.console().readLine());
    double factorConversion=166.38;
    
    double euros=(pesetas/factorConversion);
    System.out.printf(" %d pesetas en euros son: %.2f euros", pesetas, euros);
	}
}

