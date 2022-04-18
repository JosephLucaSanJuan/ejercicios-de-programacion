import java.util.ArrayList;

public class Ejercicio2 {
  public static void main(String[] args) {
    int suma = 0;
    int minimo = 100;
    int maximo = 0;
    int cuentaArray = (int)(Math.random()*11 + 10);
    int cuentaNum = 0;

    ArrayList<Integer> n = new ArrayList<Integer>();

    for (int j = 0; j < cuentaArray; j++) {
      n.add((int)(Math.random()*101));
      cuentaNum++;
    }
    System.out.println(n);

    /*for (int j = 0; j < cun)

    for (int iterable_element : iterable) {
      if (n < minimo) {
        System.out.println("[x]");
      }
    }*/

    System.out.println("La suma es " + cuentaNum);
    System.out.println("El número máximo es " + maximo);
    System.out.println("El número mínimo es " + minimo);
    
    /* switch (cuentaArray) {
      case 0:
        while (cuentaArray == 20 ) {
          System.out.println(n + " ");
          cuentaArray++;
        }
        break;
      case 1:
        while (cuentaArray == 10) {
          System.out.println(n + " ");
          cuentaArray++;
        }
        break;
      default:
    } */
  }
}