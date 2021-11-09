/**
 * 
 * @author Joseph Luca San Juan Thompson
 */
public class Tema03Ejercicio12 {
	
	public static void main (String[] args) {
		System.out.print("Introduce la nota del primer examen entre 0 y 10: ");
    double primeraNota = Double.parseDouble(System.console().readLine());
    System.out.print("¿Qué nota entre 0 y 10 deseas sacar en el trimestre? ");
    double notaDeseada = Double.parseDouble(System.console().readLine());
    
    double ponderacionPrimeraNota = primeraNota * 0.4;
    double calculoValorNota = notaDeseada - ponderacionPrimeraNota;
    double notaNecesaria = calculoValorNota/0.6;
    System.out.printf("Para sacar un %.2f, necesitas sacar un %.2f", notaDeseada, notaNecesaria);
	}
}

