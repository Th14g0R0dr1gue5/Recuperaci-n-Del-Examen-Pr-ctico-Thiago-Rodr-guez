import java.util.Date;

public class Transaccion {
    private String idTransaccion;
    private Date fecha;
    private String tipo;
    private double cantidad;

    public Transaccion(String idTransaccion, String tipo, double cantidad) {
        this.idTransaccion = idTransaccion;
        this.fecha = new Date();
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void mostrarInfo() {
        System.out.println("Transaccion ID: " + idTransaccion + ", Fecha: " + fecha + ", Tipo: " + tipo + ", Cantidad: " + cantidad);
    }
}
