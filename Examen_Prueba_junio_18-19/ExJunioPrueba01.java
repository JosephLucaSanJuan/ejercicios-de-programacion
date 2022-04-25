import java.util.HashMap;
import java.util.Scanner;

public class ExJunioPrueba01 {
  public static void main(String[] args) {
    HashMap<String, String> habitat = new HashMap<String, String>();
    HashMap<String, String> alimento = new HashMap<String, String>();

    habitat.put("rana", "En los trópicos y cerca de las zonashúmedas y acuáticas");
    habitat.put("salamandra", "Ecosistemas húmedos");
    habitat.put("sapo", "En cualquier sitio salvo el desierto y la Antártida");
    habitat.put("triton", "América y África");

    alimento.put("rana", "larvas e insectos");
    alimento.put("salamandra", "Pequqños crustáceos e insectos");
    alimento.put("sapo", "Insectos, lombríces y pequqños roedores");
    alimento.put("triton", "Insectos");

    Scanner f = new Scanner(System.in);

    System.out.print("Introduce un tipo de anfibio: ");
    String anf = f.nextLine();

    if ((habitat.containsKey(anf)) || (alimento.containsKey(anf))) {
      System.out.print("Habitat: " + habitat.get(anf) + ".\n");
      System.out.print("Alimento: " + alimento.get(anf) + ".\n");
    } else {
      System.out.print("Ese tipo de anfibio no existe.");
    }
  }
}
