/**
 * Arrays Bidimensionales
 * 
 * @author Joseph Luca San Juan Thompson
 */


public class Tema07Ejercicio02 {
	
	public static void main (String[] args) {
		int[][] n=new int[4][5];
    
    int fila;
    int columna;
    
    System.out.println("Introduce los números de array");
    
    for (fila=0; fila<4; fila++) {
      for (columna=0; columna<5; columna++) {
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        n[fila][columna]=Integer.parseInt(System.console().readLine());
      }
    }
    
    System.out.println("\n____________________________________________________________________");
    System.out.print("| Columna 0 | Columna 1 | Columna 2 | Columna 3 | Columna 4 | Suma |");
    System.out.println("\n--------------------------------------------------------------------");
    
    int sumFila;
    for (fila=0; fila<4; fila++) {
      //System.out.println("| Fila " + fila + "|");
      sumFila=0;
      for (columna=0; columna<5; columna++) {
        System.out.printf("|%11d", n[fila][columna]);
        sumFila += n[fila][columna];
      }
      System.out.printf("|%6d|\n", sumFila);
      System.out.println("--------------------------------------------------------------------");
    }
    
    /* for (columna=0; columna < 5; columna++) {
      System.out.println("-----------------");
    }
    System.out.print("-----------------"); */
    
    int sumCol;
    int sumTot=0;
    for (columna=0; columna < 5; columna++) {
      sumCol=0;
      for (fila=0; fila<4; fila++) {
        sumCol += n[fila][columna];
      }
      System.out.printf("|%11d", sumCol);
      sumTot += sumCol;
    }
    System.out.printf("|%6d|\n", sumTot);
  }
}
