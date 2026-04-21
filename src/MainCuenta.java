//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new CuentaAhorros(33303, 23232, "Unai Cerupas", 10000);
        Cuenta cuenta2 = new CuentaCorriente(1, -999, "John", 1);

        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
    }
}