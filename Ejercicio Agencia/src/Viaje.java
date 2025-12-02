public class Viaje {
    private String idViaje;
    private String destino;
    private String fechaSalida;
    private String fechaRegreso;
    private double precioBase;
    private int cupoDisponible;

    public Viaje(String idViaje, String destino, String fechaSalida, String fechaRegreso, double precioBase, int cupoDisponible) {
        this.idViaje = idViaje;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.precioBase = precioBase;
        this.cupoDisponible = cupoDisponible;
    }
    private static void ingresarPaquete() { /* código para registrar PaqueteTuristico */ }
    public String getIdViaje() {
        return idViaje;
    }
    public String getDestino() {
        return destino;
    }
    public String getFechaSalida() {
        return fechaSalida;
    }
    public String getFechaRegreso() {
        return fechaRegreso;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public int getCupoDisponible() {
        return cupoDisponible;
    }
    public void setCupoDisponible(int cupoDisponible) {
        this.cupoDisponible = cupoDisponible;
    }

    public double calcularPrecioFinal() {
        return precioBase * 1.10;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + idViaje + ", Destino: " + destino + ", Salida: " + fechaSalida + ", Regreso: " + fechaRegreso + ", Precio Base: " + precioBase + ", Cupo: " + cupoDisponible);
    }
}