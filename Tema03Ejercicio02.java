/**
 * Realizar conversor de euros a pesetas
 * 
 * @author Joseph Luca San Juan Thompson
 */
public class Tema03Ejercicio02 {
	public static void main (String[] args) {
		System.out.print("Introduce el valor de euros que quieres convertir: ");
    double valorConvertir = Double.parseDouble(System.console().readline());
    double valorPeseta=166.38;
    
    int resultado=(int)(valorConvertir/valorPeseta);
    System.out.printf(" %.2f euros en pesetas son: %.2f pesetas" ,valorConvertir, reesultado);
	}
}

