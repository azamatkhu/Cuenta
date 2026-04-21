public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private String titular;

    // Un constructor
    public Cuenta(int numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Un metodo de mostrar informacion
    public void mostrarInformacion(){
        System.out.println("==============================");
        System.out.println("Numero Cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Titular: " + titular);
    }

    public double getSaldo() {
        return saldo;
    }
}
