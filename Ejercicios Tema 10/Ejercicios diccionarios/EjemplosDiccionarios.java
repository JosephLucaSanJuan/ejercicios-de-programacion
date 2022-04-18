import java.util.HashMap;
import java.util.Scanner;

public class EjemplosDiccionarios {
  public static void main(String[] args) {
    HashMap<String, String> asignaturas = new HashMap <String, String>();

    asignaturas.put("PRO", "Programación");
    asignaturas.put("LM", "Lenguajes de Marca");
    asignaturas.put("BBDD", "Base de Datos");
    asignaturas.put("EED", "Entornos de Desarrollo");
    asignaturas.put("FOL", "Formación de orientación laboral");

    Scanner s = new Scanner(System.in);
    String codInt;

    do {
      System.out.print("\nIntroduzca el código de la asignatura (Pon 0 para salir): ");
      codInt = s.nextLine();

      if (!asignaturas.containsKey(codInt)) {
        System.out.println("Esa asignaturas no está registrada.");
        System.out.println("¿Quieres registrarla?\ns(si)\nn(no)");
        String resp = s.nextLine();
        if (resp.equals("s")) {
          System.out.println("Introduce el nombre de la asignaturas: ");
          String asNew = s.nextLine();
          asignaturas.put(codInt, asNew);
        }
      } else {
        System.out.print("Al código " + codInt);
        System.out.print(" le corresponde a la asignatura de ");
        System.out.print(asignaturas.get(codInt) + ".\n");
      }
    } while (!codInt.equals("0"));
  }
}
