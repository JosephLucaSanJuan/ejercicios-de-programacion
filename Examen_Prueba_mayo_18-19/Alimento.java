public class Alimento {
  private String comida;
  private int precio;


  public Alimento(String comida, int precio) {
    this.comida = comida;
    this.precio = precio;
  }

  public String getComida() {
    return this.comida;
  }

  public void setComida(String comida) {
    this.comida = comida;
  }

  public int getPrecio() {
    return this.precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "{" +
      " comida='" + getComida() + "'" +
      ", precio='" + getPrecio() + "'" +
      "}";
  }

}
