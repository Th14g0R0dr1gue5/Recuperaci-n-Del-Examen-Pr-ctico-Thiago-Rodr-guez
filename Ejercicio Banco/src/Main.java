import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        ArrayList<Transaccion> transacciones = new ArrayList<>();

        int opcion;
        do {
            System.out.println("==== Banca Movil BancoArturo ====");
            System.out.println("===== MENÚ =====");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Crear Cuenta Corriente");
            System.out.println("3. Crear Cuenta Ahorro");
            System.out.println("4. Depositar Dinero");
            System.out.println("5. Retirar Dinero");
            System.out.println("6. Mostrar Cuentas");
            System.out.println("7. Mostrar Transacciones");
            System.out.println("8. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    crearCuentaCorriente();
                    break;
                case 3:
                    crearCuentaAhorro();
                    break;
                case 4:
                    depositar();
                    break;
                case 5:
                    retirar();
                    break;
                case 6:
                    mostrarCuentas();
                    break;
                case 7:
                    mostrarTransacciones();
                    break;
            }

        } while(opcion != 8);
    }

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Cuenta> cuentas = new ArrayList<>();
    private static ArrayList<Transaccion> transacciones = new ArrayList<>();

    private static void crearCliente() {
        System.out.println("\n--- Ingrese un nuevo cliente ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Direccion: ");
        String direccion = scanner.nextLine();
        System.out.print("Numero de tarjeta: ");
        String tarjeta = scanner.nextLine();
        System.out.print("PIN: ");
        String pin = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(nombre, direccion, tarjeta, pin);
        clientes.add(nuevoCliente);
        System.out.println("\n Cliente ingresado con exito. Tarjeta: " + tarjeta);

    }

    private static void crearCuentaCorriente() {
        System.out.println("\n--- Ingrese una nueva cuenta corriente ---");
        System.out.print("Numero de cuenta: ");
        String numCuenta = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        CuentaComprobacion cuenta = new CuentaComprobacion(numCuenta, saldo);
        cuentas.add(cuenta);
        System.out.println("\n Cuenta Corriente creada con exito. Num: " + numCuenta);

    }

    private static void crearCuentaAhorro() {
        System.out.println("\n--- Ingrese una nueva cuenta de ahorros ---");
        System.out.print("Numero de cuenta: ");
        String numCuenta = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        CuentaAhorro cuenta = new CuentaAhorro(numCuenta, saldo);
        cuentas.add(cuenta);
        System.out.println("\n Cuenta De Ahorros creada con exito. Num: " + numCuenta);

    }

    private static void depositar() {
        System.out.println("\n--- Deposito ---");
        System.out.print("Numero de cuenta: ");
        String numCuenta = scanner.nextLine();
        System.out.print("Cantidad a depositar: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine();

        for (Cuenta c : cuentas) {
            if (c.numero.equals(numCuenta)) {
                c.depositar(cantidad);
                transacciones.add(new Transaccion(UUID.randomUUID().toString(), "Deposito", cantidad));
                System.out.println("\n Deposito realizado con exito.");
                return;
            }
        }
        System.out.println("Cuenta no encontrada.");
    }

    private static void retirar() {
        System.out.println("\n--- Retiro ---");
        System.out.print("Numero de cuenta: ");
        String numCuenta = scanner.nextLine();
        System.out.print("Cantidad a retirar: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine();

        for (Cuenta c : cuentas) {
            if (c.numero.equals(numCuenta)) {
                if (c.retirar(cantidad)) {
                    transacciones.add(new Transaccion(UUID.randomUUID().toString(), "Retiro", cantidad));
                    System.out.println("\n Retiro realizado con exito.");
                } else {
                    System.out.println("Fondos insuficientes.");
                }
                return;
            }
        }
        System.out.println("Cuenta no encontrada.");

    }

    private static void mostrarCuentas() {
        System.out.println("\n--- Cuentas Registradas ---");
        for (Cuenta c : cuentas) {
            c.mostrarInfo();
        }

    }

    private static void mostrarTransacciones() {
        System.out.println("\n--- Transacciones ---");
        for (Transaccion t : transacciones) {
            t.mostrarInfo();
        }

    }

}
