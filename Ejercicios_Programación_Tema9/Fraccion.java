public class Fraccion {
    private int numerador;
    private int denominador;
    private int fraccionEntrada;

    public Fraccion (int numerador, int denominador) {
        this.numerador=numerador;
        this.denominador=denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador=numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador=denominador;
    }

    @Override
    public String toString() {
        return denominador + "/" + numerador;
    }

    public Fraccion invierte() {
        return new Fraccion(this.denominador, this.numerador);
    }

    public Fraccion invertida(Fraccion fraccionEntrada) {
        Fraccion aux = new Fraccion(fraccionEntrada.denominador, fraccionEntrada.numerador);
        return aux;
    }
}