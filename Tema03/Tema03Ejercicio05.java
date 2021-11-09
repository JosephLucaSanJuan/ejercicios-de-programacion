/**
 * Calcula el are de rectángulo
 * 
 * @author Joseph Luca san Juan Thompson
 */


public class Tema03Ejercicio05 {
	
	public static void main (String[] args) {
    System.out.println("┏━━━━━━━━━━━━┓");
    System.out.println("┃            ┃");
    System.out.println("┃            ┃");
    System.out.println("┗━━━━━━━━━━━━┛");
    System.out.println("Este programa calcula la supercifie de un rectangulo.");
		System.out.print("Introduce la base del rectangulo en cm: ");
    double base=Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la altura del rectangulo en cm: ");
    double altura=Integer.parseInt(System.console().readLine());
    
    System.out.println("El area del rectangulo es: " + base * altura);
	}
}

