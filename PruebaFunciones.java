/**
 * 
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class PruebaFunciones {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la nota del primerr examen: ");
    double nota1 = Double.parseDouble(s.nextLine());
    
    System.out.print("Introduzca la nota del segundo examen: ");
    double nota2 = Double.parseDouble(s.nextLine());
    
    System.out.println("Tu nota de programación es " + notaProgramación(nota1, nota2));
	}
  
  public static double notaProgramcion() {
  }
}
