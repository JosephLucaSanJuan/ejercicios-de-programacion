//import static java.lang.System.console;

import java.util.HashMap;
import java.util.Scanner;

public class ExMay2019Ej01 {
  public static void main(String[] args) {
    HashMap<String, Double> comida = new HashMap<>();

    comida.put("avena", 2.21);
    comida.put("garbanzos", 2.39);
    comida.put("tomate", 1.59);
    comida.put("jengibre", 3.13);
    comida.put("quinoa", 4.50);
    comida.put("guisantes", 1.60);

    Scanner a = new Scanner(System.in);
    String alimento;
    Double cant;
    Double sumaPrecios;
    Double subtotal;
    int cuentaProd = 0;

    do {

      System.out.print("\nProducto: ");
      alimento = a.nextLine();

      System.out.print("Cantidad: ");
      cant = Double.parseDouble(System.console().readLine());

      subtotal = (comida.get(alimento)) * cant;
      cuentaProd++;

      /*if (!alimento.equals("fin")) {} */
    } while (!alimento.equals("fin"));

    sumaPrecios = subtotal++;

    System.out.println("Producto  Precio  Cantidad  Subtotal");
    System.out.println("------------------------------------");
    for (int i = 0; i == cuentaProd; i++) {
      System.out.println(alimento + "  " + comida.get(alimento) + "  " + cant + "  " + subtotal);
    }
    System.out.println("------------------------------------");
    System.out.println("TOTAL: " + sumaPrecios);
  }
}
