public class EntradasZona {
    public static void main(String[] args) {
        
        Zona salPrincip = new Zona(1000);
        Zona ComprVent = new Zona(200);
        Zona VIP = new Zona(25);

        salPrincip.vender(400);
        ComprVent.vender(124);
        VIP.vender(30);

        //System.out.println(salPrincip);
        //System.out.println(ComprVent);
        //System.out.println(VIP);
    }
}
