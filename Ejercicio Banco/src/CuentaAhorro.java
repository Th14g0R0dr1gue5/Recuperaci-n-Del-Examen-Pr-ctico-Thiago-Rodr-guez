public class CuentaAhorro extends Cuenta {
    public CuentaAhorro(String numero, double saldo) {
        super(numero, saldo);
    }

    public void mostrarInfo() {
        System.out.println("//Cuenta Ahorro//");
        super.mostrarInfo();
    }
}
