import java.util.ArrayList;

public class SucursalAgencia {
    private String nombre;
    private String direccion;
    private String telefono;
    private double presupuestoMensual;
    private ArrayList<Viaje> catalogoViajes;

    public SucursalAgencia(String nombre, String direccion, String telefono, double presupuestoMensual) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.presupuestoMensual = presupuestoMensual;
        this.catalogoViajes = new ArrayList<>();
    }

    public void agregarViaje(Viaje viaje) {
        catalogoViajes.add(viaje);
    }

    public ArrayList<Viaje> getCatalogoViajes() {
        return catalogoViajes;
    }

    public void mostrarCatalogo() {
        for (Viaje v : catalogoViajes) {
            v.mostrarInfo();
            System.out.println("Precio final: " + v.calcularPrecioFinal());
            System.out.println();
        }
    }
}
