import java.util.ArrayList;

public class Ejercicio1 {
  public static void main(String[] args) {
    ArrayList<String> companeros = new ArrayList<>();
    companeros.add("Joseph");
    companeros.add("Natalia");
    companeros.add("Ale");
    companeros.add("Diego");
    companeros.add("Veronica");
    companeros.add("David");

    for (String companero: companeros) {
      System.out.println("Señor o Señora " + companeros);
    }
    //System.out.println(companeros);

    int x = 10;
    int y;

    if (x < 20) {
      y = 88;
    } else {
      y = x * 7;
    }

    y = x < 20 ? 88 : x * 7;
  }
}