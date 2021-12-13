/**
 * Bucle
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema05Ejercicio21 {
	
	public static void main (String[] args) {
		System.out.println("Introduce números hasta que te salga uno negativo.");
    System.out.println("Luego muestra cuantos números has puesto (sin incluyendo el negativo), la suma de los impares y el mayor de los pares.");
    
    int n=0;
    int cuentaNumPos=0;
    int sumaImpar=0;
    int cuentaNumImpar=0;
    int maxPar=0;
    
    while (0 <= n) {
      System.out.print("Introduce un número: ");
      n=Integer.parseInt(System.console().readLine());
      if (0<=n) {
        cuentaNumPos++;
        if ((n%2)==1) {
          sumaImpar += n;
          cuentaNumImpar++;
        } else {
          if (n>maxPar)
              maxPar=n;
        }
      }
    }
    System.out.println("Has introducido " + cuentaNumPos + " números");
    System.out.println("La media de los numeros impares es " + (sumaImpar/cuentaNumImpar));
    System.out.println("El mayor número par es " + maxPar);
  }
}

