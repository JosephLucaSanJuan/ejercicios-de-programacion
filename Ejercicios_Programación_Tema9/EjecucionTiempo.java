public class EjecucionTiempo {
    public static void main(String[]args) {
        
        Tiempo t = new Tiempo(1, 20, 30);
        Tiempo t1 = new Tiempo(10, 35, 5);
        Tiempo t2 = new Tiempo(0, 30, 40);
        Tiempo t3 = new Tiempo(0, 35, 20);

        /*System.out.println(t);
        System.out.println(t1);*/
        System.out.println(t2);
        System.out.println(t3);

        Tiempo totalSuma = t2.suma(t3);
        System.out.println(totalSuma);
    }
}