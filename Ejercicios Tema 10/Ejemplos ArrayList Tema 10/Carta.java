public class Carta {
  private static String [] numeros = {"AS", "2", "3", "4", "5", "6","7", "soldado", "caballos", "rey"};/**/
  private static String [] simbolos = {"oros", "bastones", "espadas", "copas"};

  private String numero;
  private String simbolo; 

  public Carta (String numero, String simbolo) {
    this.numero = numeros[(int)(Math.random()*10)];
    this.simbolo = simbolos[(int)(Math.random()*4)];
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getSimbolo() {
    return this.simbolo;
  }

  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  @Override
  public String toString() {
    return "El " + numeros + " de " + simbolos + ".";
  }
  /**/
}