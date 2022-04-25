public class ExJunioPrueba02 {
  public static void main(String[] args) {
    CuentaCorriente cuenta1 = new CuentaCorriente(((int)(Math.random()*536871066) + 1000000000), 0);
    CuentaCorriente cuenta2 = new CuentaCorriente(((int)(Math.random()*536871066) + 1000000000), 1500);
    CuentaCorriente cuenta3 = new CuentaCorriente(((int)(Math.random()*536871066) + 1000000000), 6000);

    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(cuenta3);

    /*cuenta1.ingreso(2000);
    cuenta2.cargo(600);
    cuenta3.ingreso(75);
    cuenta1.cargo(55);
    cuenta2.transferencia(cuenta3, 100);

    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(cuenta3);*/

  }
}
