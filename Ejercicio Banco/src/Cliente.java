public class Cliente {
    private String nombre;
    private String direccion;
    private String numeroTarjeta;
    private String pin;

    public Cliente(String nombre, String direccion, String numeroTarjeta, String pin) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTarjeta = numeroTarjeta;
        this.pin = pin;
    }

    public String getNumeroTarjeta() { return numeroTarjeta; }
    public String getPin() { return pin; }

    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + ", Direccion: " + direccion + ", Tarjeta: " + numeroTarjeta);
    }
}

