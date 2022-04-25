public class CuentaCorriente {
  private int numCuenta;
  private int saldo=0;

  public CuentaCorriente(int numCuenta, int saldo) {
    this.numCuenta = numCuenta;
    this.saldo = saldo;
  }

  public int getNumCuenta() {
    return this.numCuenta;
  }

  public void setNumCuenta(int numCuenta) {
    this.numCuenta = numCuenta;
  }

  public int getSaldo() {
    return this.saldo;
  }

  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    return "Numero de cta: " + getNumCuenta() + ", Saldo: " + getSaldo() + ".0 $";
    /*if (saldo = null) {
      return "Numero de cta: " + getNumCuenta() + ", Saldo: " + getSaldo() + ".0 $";
    }*/
  }

  /*@Override
  public CuentaCorriente ingreso(CuentaCorriente sumSaldo) {
    CuentaCorriente cc = new CuentaCorriente(numCuenta, saldo, ingresos, gastos, transferencia)
  }*/
}
