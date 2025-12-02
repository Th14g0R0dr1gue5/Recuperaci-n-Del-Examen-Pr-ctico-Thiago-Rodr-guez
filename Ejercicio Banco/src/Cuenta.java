public class Cuenta {
    protected String numero;
    protected double saldo;

    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public void mostrarInfo() {
        System.out.println("Cuenta Num: " + numero + ", Saldo: " + saldo);
    }
}
