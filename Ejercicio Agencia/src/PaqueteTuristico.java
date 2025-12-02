import java.util.Scanner;

public class PaqueteTuristico extends Viaje {
    private boolean incluyeAlojamiento;
    private int duracionNoches;

    public PaqueteTuristico(String idViaje, String destino, String fechaSalida, String fechaRegreso, double precioBase, int cupoDisponible, boolean incluyeAlojamiento, int duracionNoches) {
        super(idViaje, destino, fechaSalida, fechaRegreso, precioBase, cupoDisponible);
        this.incluyeAlojamiento = incluyeAlojamiento;
        this.duracionNoches = duracionNoches;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Incluye alojamiento (si/no):");
        Scanner sc = null;
        String alojamientoStr = sc.nextLine();
        boolean alojamiento = alojamientoStr.equalsIgnoreCase("si");

    }
}
