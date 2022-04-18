public class Terminal {
    private String numero;
    private int tiempo;

    Terminal(String numero) {
        this.numero=numero;
        this.tiempo=0;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTiempo() {
        return this.tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Nº " + numero + " - " + tiempo + "s de conversación";
    }

    public void llama(Terminal t, int segundosDeLlamada) {
        this.tiempo += segundosDeLlamada;
        t.tiempo += segundosDeLlamada;
    }
}