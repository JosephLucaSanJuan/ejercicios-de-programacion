import java.util.ArrayList;
import java.util.Collections;

public class OrdenarNombres {
  public static void main(String[] args) {
    
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    alumnos.add(new Alumno("David", "Servia"));
    alumnos.add(new Alumno("Natalia", "Castillo"));
    alumnos.add(new Alumno("Alejandro", "Cueto"));

    System.out.println(alumnos);

    Collections.sort(alumnos);

    System.out.println(alumnos);
  }
}
