public class Main {
  public static void main(String[] args) {
    Alumno alumno1 = new Alumno ("Roda", "Pablo");
    Alumno alumno2 = new Alumno ("García", "Javier");
    //alumno2 = alumno1;
    alumno2 = (Alumno)(alumno1.clone());

    alumno1.setNombre("Ricardo");
    System.out.println(alumno1);
    System.out.println(alumno2);
  }
}