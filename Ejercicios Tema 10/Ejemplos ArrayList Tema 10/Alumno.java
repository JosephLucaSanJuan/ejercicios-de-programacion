public class Alumno implements Comparable<Alumno> {
  String apellidos;
  String nombre;

  public Alumno(String nombre, String apellidos) {
    this.apellidos = apellidos;
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Apellidos: " + apellidos + "; Nombre: " + nombre;
  }

  @Override
  public Object clone() {
    Alumno alumno = null;
    try {
      alumno = (Alumno) super.clone();
    } catch (CloneNotSupportedException e) {
      alumno = new Alumno(this.getApellidos(), this.getNombre());
    }
    return alumno;
  }

  public int compareTo(Alumno alumnos) {
    return (this.apellidos).compareTo(alumnos.getApellidos());
  }
}