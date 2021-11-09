/**
 * Convertidor de euros a pesetas
 * 
 * @author Joseph Luca San Juan Thompson
 */
public class Tema02Ejercicio04 {
	
	public static void main (String[] args) {
		System.out.print("Introduce la cantidad de euros a convertir: ");
    double valorConvertir = Double.parseDouble(System.console().readLine());
    double valorPeseta=166.38;
    
    double resultado= (valorConvertir * valorPeseta);
    System.out.printf(" %.2f euros son %.2f pesetas "  ,valorConvertir, resultado);
	}
}

