public class CuentaComprobacion extends Cuenta {
    public CuentaComprobacion(String numero, double saldo) {
        super(numero, saldo);
    }

    public void mostrarInfo() {
        System.out.println("//Cuenta Corriente//");
        super.mostrarInfo();
    }
}