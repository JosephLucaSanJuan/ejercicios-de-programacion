/**
 * Array Bidimensional
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema07Ejercicio01 {
	
	public static void main (String[] args) {
		int[][] n = new int[3][6];
    
    n[0][0] = 0;
    n[1][0] = 75;
    n[0][1] = 30;
    n[1][2] = 2;
    n[2][2] = -2;
    n[2][3] = 9;
    n[1][4] = 0;
    n[0][5] = 5;
    n[2][5] = 11;
    
    int fila;
    int columna;
    
    System.out.println("       |Columna 1| Columna 2| Columna 3| Columna 4| Columna 5| Columna 6|");
    //System.out.println("________________________________________________________________________");
    System.out.println("-------------------------------------------------------------------------");
    
    for (fila=0; fila<3; fila++) {
      System.out.print("Fila " + fila + " |");
      for (columna=0; columna<=5; columna++) {
        System.out.printf(" %7d | ", n[fila][columna]);
      }
      System.out.println();
    }
	}
}

