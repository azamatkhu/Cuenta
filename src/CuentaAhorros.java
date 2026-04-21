public class CuentaAhorros extends Cuenta {
    private int interes;

    public CuentaAhorros(int numeroCuenta, int saldo, String titular, int interes) {
        super(numeroCuenta, saldo, titular);
        this.interes = interes;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Interes: " + interes);
    }
}
