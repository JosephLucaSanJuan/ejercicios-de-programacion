import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    HashMap<String, String> diccionario = new HashMap<String, String>();

    diccionario.put("caliente", "hot");
    diccionario.put("rojo", "red");
    diccionario.put("verde", "green");
    diccionario.put("agujetas", "stiff");
    diccionario.put("abrasador", "hot");
    diccionario.put("ardiente", "hot");
    diccionario.put("hierro", "iron");
    diccionario.put("grande", "big");

    Scanner d = new Scanner(System.in);
    String palInt;

    do {

      System.out.print("\nIntroduczca una palabra y le daré los sinónimos: ");
      palInt = d.nextLine();

      if (palInt.equals(diccionario)) {
        System.out.print("\nSinónimos de caliente: "); 
      } else {
        System.out.println("\nNo conozco sinónimos de esa palabra.");
      }

    } while (!palInt.equals("salir"));
  }
}