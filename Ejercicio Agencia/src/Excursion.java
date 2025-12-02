import java.util.List;

public class Excursion extends Viaje {
    private String puntoEncuentro;
    private List<String> actividadesIncluidas;

    public Excursion(String idViaje, String destino, String fechaSalida, String fechaRegreso, double precioBase, int cupoDisponible, String puntoEncuentro, List<String> actividadesIncluidas) {
        super(idViaje, destino, fechaSalida, fechaRegreso, precioBase, cupoDisponible);
        this.puntoEncuentro = puntoEncuentro;
        this.actividadesIncluidas = actividadesIncluidas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Punto de encuentro: " + puntoEncuentro + ", Actividades: " + actividadesIncluidas);
    }
}


