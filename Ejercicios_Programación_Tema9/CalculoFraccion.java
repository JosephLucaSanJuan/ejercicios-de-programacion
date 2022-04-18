public class CalculoFraccion {
    public static void main(String[] args) {
        //System.out.println("FRACCIÓN");
        //System.out.println("========");

        Fraccion fraccion1 = new Fraccion(1, 2);
        Fraccion fraccion2 = new Fraccion(2, 4);

        Fraccion invertida = fraccion1.invierte();

        System.out.println(fraccion1);
        System.out.println(invertida);
    }
}