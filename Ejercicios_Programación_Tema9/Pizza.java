public class Pizza {

    private static int totalPedidas;
    private static int totalServidas;

    private String tamano;
    private String tipo;
    private String estado;

    public Pizza(String tamano, String tipo) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }

    public static int getTotalPedidas() {
        return Pizza.totalPedidas;
    }

    public static int getTotalServidas() {
        return Pizza.totalServidas;
    }

    public String toString() {
        return "pizza " + this.tipo + " " + this.tamano + " " + this.estado;
    }

    /**public void pedidas (int tamaño, int tipo, int estado) {
        String tamaño = "Quiero una pizza " + this.tipo + this.tamaño;

        switch (tamaño){
            case 1:
            tamaño="familiar";
            break;
            case 2:
            tamaño="mediana";
            break;
            default:
        }

        switch (tipo){
            case 1:
            tipo="cuatro quesos";
            break;
            case 2:
            tipo="margarita";
            break;
            default:
        }
    }**/

    public void sirve() {
        if (this.estado=="pedida") {
            this.estado="servida";
            getTotalServidas();
        }else {
            System.out.println("Esa pizza ya se ha servido");
        }
    }
}