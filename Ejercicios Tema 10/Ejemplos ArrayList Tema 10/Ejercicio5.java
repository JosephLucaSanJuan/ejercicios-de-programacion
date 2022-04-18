import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    ArrayList<Disco> discos = new ArrayList<Disco>();

    discos.add(new Disco("12", "Walking With Dinosaurs", "Tim Haines", "documental"));
    discos.add(new Disco("24", "Steven Universe", "Rebbeca Sugar", "serie animada"));
    discos.add(new Disco("36", "Transformaers Animated", "Ciro Nieli", "serie animada"));
    discos.add(new Disco("48", "A Game Of Thrones", "George RR Martin", "libro"));

    Scanner s = new Scanner(System.in);
    int op;
    String codInt;
    String titInt;
    String autInt;
    String tipInt;
    int x;

    do {
      System.out.println("==============");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo Disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Elige una opción: ");
      op = Integer.parseInt(System.console().readLine());

      switch (op) {
      case 1:
        System.out.println("LISTADO");
        for (Disco d: discos) {
          System.out.println(d);
        }
        break;

      case 2:
        System.out.println("NUEVO DISCO");
        System.out.println("Introduce el código de la pieza: ");
        codInt = s.nextLine();
        System.out.println("Introduce el título de la pieza de media: ");
        titInt = s.nextLine();
        System.out.println("Introduce el nombre del autor(a): ");
        autInt = s.nextLine();
        System.out.println("Introduce el tipo de soporte de historia: ");
        tipInt = s.nextLine();
        discos.add(new Disco(codInt, titInt, autInt, tipInt));
        break;
      case 3:
        System.out.println("MODIFICAR");
        break;
      
      case 4:
        System.out.println("Borrar");
        
        System.out.println("Introduce el código del disco que quieres borrar: ");
        codInt =s.nextLine();
        int indiceParaBorrar = discos.indexOf(new Disco(codInt, "", "", ""));
        discos.remove(indiceParaBorrar);
        break;

      default:
      }
      /*System.out.print("Introduce el código del disco: ");
      codigo = s.nextLine();
      if (!discos.equals(codigo)) {
        System.out.println("Disco no registrado");
        System.out.println("¿Quieres registrar disco?\ns(si)\nn(no)");
        String resp = s.nextLine();
        if (resp.equals("s")) {
          
        }
      } else {
        System.out.print("Introduce el título del disco: ");
        titulo = s.nextLine();
        if (!discos.equals(titulo)) {
          System.out.println("Este título o pertenece a nigún disco.");
        } else {
          System.out.print("Introduce el nombre del autor");
          autor = s.nextLine();
          if (!discos.equals(autor)) {
            System.out.println("Este nombre no corresponde con ningún autor.");
          } else {
            System.out.print("Introduce el nombre de la series a la que pertenece: ");
            tipo = s.nextLine();
            if (!discos.equals(tipo)) {
              System.out.println("Este nombre no corresponde con ninguna pieza de media");
            } else {
              discos.add(new Disco(codigo, titulo, autor, tipo));
            }
          }
        }
      }/**/
    } while (op != 5);
  }
}