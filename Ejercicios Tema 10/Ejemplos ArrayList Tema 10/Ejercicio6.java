import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    HashMap<String, String> nombre = new HashMap <String, String>();

    nombre.put("JurassicJoe03", "Thundercracker36");
    nombre.put("TyrannoJoe", "Mapusaurus36");
    nombre.put("Tarn06", "Hyaenodon36");

    Scanner j = new Scanner(System.in);

    System.out.println("\nImplementa el control de acceso al área restringida de un programa.");

    //int cuentaInt = 0;
    String usu;
    String pwd;
    int intentos = 3;
    boolean conexExit=false;

    do {
      System.out.print("\nIntroduce un nombre de usuario: ");
      usu = j.nextLine();

      System.out.print("\nIntroduce una contraseña: ");
      pwd = j.nextLine();

      if (nombre.containsKey(usu)) {

        if (pwd.equals(nombre.get(usu)) ) {
          System.out.println("\nHas accedido al area restringida.");
          intentos=0;
          conexExit = true;
        } else {
          System.out.println("\nContraseña incorrecta");
          intentos--;
        }
      } else {
        
        intentos--;

        System.out.println("\nNo existe este usuario.");
      }
    
    } while (intentos>=1 && !conexExit);

    if (intentos==0) {
      System.out.println("\nLo siento, no tiene acceso al area restringida");
    }
  }
}