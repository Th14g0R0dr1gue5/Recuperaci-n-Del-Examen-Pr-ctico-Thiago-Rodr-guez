import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SucursalAgencia sucursal = new SucursalAgencia("Sucursal Quito", "Av. Amazonas", "025218499", 5000);

        int opcion;
        do {
            System.out.println("Bienvenido A Mundi Travel");
            System.out.println("===== Menu =====");
            System.out.println("1. Agregar Paquete Turistico");
            System.out.println("2. Agregar Excursion");
            System.out.println("3. Mostrar todos los viajes");
            System.out.println("4. Mostrar solo Paquetes Turisticos");
            System.out.println("5. Mostrar solo Excursiones");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            sc.nextLine();


            switch(opcion) {
                case 1:
                    ingresarPaquete();
                    break;
                case 2:
                    ingresarExcursion();
                    break;
                case 3:
                    mostrarCatalogo();
                    break;
                case 4:
                    mostrarPaquetes();
                    break;
                case 5:
                    mostrarExcursiones();
                    break;
            }

        } while(opcion != 6);
    }

    private static Scanner scanner = new Scanner(System.in);
    private static SucursalAgencia sucursal = new SucursalAgencia("Sucursal Quito", "Av. Amazonas", "025218499", 5000);

    private static void ingresarPaquete() {
        System.out.println("\n--- Ingrese un nuevo paquete turistico ---");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Destino: ");
        String destino = scanner.nextLine();
        System.out.print("Fecha salida: ");
        String salida = scanner.nextLine();
        System.out.print("Fecha regreso: ");
        String regreso = scanner.nextLine();
        System.out.print("Precio base: ");
        double precio = scanner.nextDouble();
        System.out.print("Cupo disponible: ");
        int cupo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Incluye alojamiento (si/no): ");
        String alojamientoStr = scanner.nextLine();
        boolean alojamiento = alojamientoStr.equalsIgnoreCase("si");
        System.out.print("Duración en noches: ");
        int noches = scanner.nextInt();
        scanner.nextLine();

        PaqueteTuristico nuevoPaquete = new PaqueteTuristico(id, destino, salida, regreso, precio, cupo, alojamiento, noches);
        sucursal.agregarViaje(nuevoPaquete);
        System.out.println("\n Paquete ingresado con éxito. ID: " + id);
    }

    private static void ingresarExcursion() {

        System.out.println("\n--- Ingrese una nueva excursion ---");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Destino: ");
        String destino = scanner.nextLine();
        System.out.print("Fecha salida: ");
        String salida = scanner.nextLine();
        System.out.print("Fecha regreso: ");
        String regreso = scanner.nextLine();
        System.out.print("Precio base: ");
        double precio = scanner.nextDouble();
        System.out.print("Cupo disponible: ");
        int cupo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Punto de encuentro: ");
        String punto = scanner.nextLine();
        System.out.print("Actividades (separadas por coma): ");
        String actividadesStr = scanner.nextLine();

        Excursion nuevaExcursion = new Excursion(id, destino, salida, regreso, precio, cupo, punto, Arrays.asList(actividadesStr.split(",")));
        sucursal.agregarViaje(nuevaExcursion);
        System.out.println("\n Excursion ingresada con exito. ID: " + id);

    }

    private static void mostrarCatalogo() {
        System.out.println("\n--- Catalogo Completo ---");
        sucursal.mostrarCatalogo();

    }

    private static void mostrarPaquetes() {
        System.out.println("\n--- Paquetes Turisticos ---");
        for (Viaje v : sucursal.getCatalogoViajes()) {
            if (v instanceof PaqueteTuristico) v.mostrarInfo();
        }

    }

    private static void mostrarExcursiones() {
        System.out.println("\n--- Excursiones ---");
        for (Viaje v : sucursal.getCatalogoViajes()) {
            if (v instanceof Excursion) v.mostrarInfo();
        }
    }


}
