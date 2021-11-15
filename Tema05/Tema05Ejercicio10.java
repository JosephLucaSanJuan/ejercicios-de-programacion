/**
 * 
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema05Ejercicio10 {
	
	public static void main (String[] args) {
		System.out.println("Introduce varios números para calcular su media");
    System.out.println("Introduce un número negativo para indicar que has terminado");
    
    int numIntro = 0;
    int sumaNum = 0;
    int cuentaNum = 0;
    
    do {
      numIntro = Integer.parseInt(System.console().readLine());
      cuentaNum++;
      sumaNum += numIntro;
    } while (numIntro >= 0);
    
    System.out.println("Hay " + cuentaNum + " números");
    System.out.println("La media es " + (sumaNum/cuentaNum));
	}
}
