public class Movil extends Terminal {
    private String tarifa;
    private double precioTarifa;
    private double paga;
    private String tiempo;

    /**public Movil(String tarifa) {
        this.tarifa = tarifa;
    }

    public String() {
        return tarifa;
    }

    public double getConversacion() {
        return this.conversacion;
      }
    
      public void setConversacion(double conversacion) {
        this.conversacion = conversacion;
      } **/

    public double getSaldo() {
        return this.paga;
    }

    public void setSaldo(double saldo) {
        this.paga = paga;
    }

    public Movil(String numero) {
        super(numero);
    }

    public void llama(Movil m, int segundosDeLlamada) {
        this.tiempo += segundosDeLlamada;
        m.tiempo += segundosDeLlamada;
        if (tarifa.equals("rata")) {
            precioTarifa = 0.06;
        } else if (tarifa.equals("mono")) {
            precioTarifa = 0.12;
        } else if (tarifa.equals("bisonte")) {
            precioTarifa = 0.30;
        }
    }

    @Override
    public String toString() {
        return "Nº " + getNumero() + " - " + getTiempo() + "s de conversación - tarificados " + tarifa + " euros";
    }
}
