/**
 * Convertir pesetas en euros
 * 
 * @author Joseph Luca san Juan Thompson
 */
public class Tema02Ejercicio05 {
	
	public static void main (String[] args) {
		System.out.print("Introduce la cantidad de pesetas a convertir: ");
    double valorConvertir = Double.parseDouble(System.console().readLine());
    double valorEuro = 0.006;
    
    double resultado = (valorConvertir * valorEuro);
    System.out.printf(" %.2f pesetas son %.2f euros " ,valorConvertir ,resultado);
	}
}

