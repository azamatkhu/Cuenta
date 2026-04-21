public class CuentaCorriente extends Cuenta {
    private double sobregiro;

    public CuentaCorriente(int numeroCuenta, double saldo, String titular, double sobregiro) {
        super(numeroCuenta, saldo, titular);
        this.sobregiro = sobregiro;
    }

    // Aqui, cambiamos el metodo para a ver si la cuenta esta en sobregiro o no
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Límite de Sobregiro: " + sobregiro);

        if (getSaldo() < 0) {
            System.out.println("La cuenta está en sobregiro.");
        }
    }
}

