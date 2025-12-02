import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClinicaVeterinaria clinica = new ClinicaVeterinaria("Clinica Patita Suave", "Av. Granados", "0236451978", 50);

        int opcion;
        do {
            System.out.println("===== CLINICA VETERINARIA PATITA SUAVE =====");
            System.out.println("===== MENÚ  =====");
            System.out.println("1. Registrar Perro");
            System.out.println("2. Registrar Gato");
            System.out.println("3. Registrar Veterinario");
            System.out.println("4. Mostrar todos los pacientes");
            System.out.println("5. Mostrar solo Perros");
            System.out.println("6. Mostrar solo Gatos");
            System.out.println("7. Mostrar Veterinarios");
            System.out.println("8. Salir");
            opcion = sc.nextInt();
            sc.nextLine();


            switch(opcion) {
                case 1:
                    registrarPerro();
                    break;
                case 2:
                    registrarGato();
                    break;
                case 3:
                    registrarVeterinario();
                    break;
                case 4:
                    mostrarPacientes();
                    break;
                case 5:
                    mostrarPerros();
                    break;
                case 6:
                    mostrarGatos();
                    break;
                case 7:
                    mostrarVeterinarios();
                    break;
            }

        } while(opcion != 8);
    }

    private static Scanner scanner = new Scanner(System.in);
    private static ClinicaVeterinaria clinica = new ClinicaVeterinaria("Clinica Patita Suave", "Av. Granados", "0236451978", 50);

    private static void registrarPerro() {System.out.println("Nombre del perro:");
        System.out.println("\n--- Ingrese un nuevo Perro ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Dueño: ");
        String dueno = scanner.nextLine();
        System.out.print("Historial clinico: ");
        String historial = scanner.nextLine();
        System.out.print("Raza: ");
        String raza = scanner.nextLine();
        System.out.print("Nivel de actividad: ");
        String nivel = scanner.nextLine();

        Perro nuevoPerro = new Perro(nombre, edad, peso, dueno, historial, raza, nivel);
        clinica.registrarPaciente(nuevoPerro);
        System.out.println("\n Perro ingresado con exito. Nombre: " + nombre);
    }

    private static void registrarGato() {
        System.out.println("\n--- Ingrese un nuevo Gato ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Dueño: ");
        String dueno = scanner.nextLine();
        System.out.print("Historial clinico: ");
        String historial = scanner.nextLine();
        System.out.print("Color pelaje: ");
        String color = scanner.nextLine();
        System.out.print("Es indoor (si/no): ");
        String indoorStr = scanner.nextLine();
        boolean indoor = indoorStr.equalsIgnoreCase("si");

        Gato nuevoGato = new Gato(nombre, edad, peso, dueno, historial, color, indoor);
        clinica.registrarPaciente(nuevoGato);
        System.out.println("\n Gato ingresado con exito. Nombre: " + nombre);

    }

    private static void registrarVeterinario() {
        System.out.println("\n--- Ingrese un nuevo Veterinario ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("ID profesional: ");
        String id = scanner.nextLine();
        System.out.print("Especialidad: ");
        String esp = scanner.nextLine();
        System.out.print("Salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        Veterinario nuevoVet = new Veterinario(nombre, id, esp, salario);
        clinica.agregarVeterinario(nuevoVet);
        System.out.println("\n Veterinario ingresado con exito. Nombre: " + nombre);

    }

    private static void mostrarPacientes() {
        System.out.println("\n--- Pacientes Registrados ---");
        for (Paciente p : clinica.getPacientes()) {
            p.mostrarInfo();
            System.out.println("----------------------");
        }

    }

    private static void mostrarPerros() {
        System.out.println("\n--- Perros ---");
        for (Paciente p : clinica.getPacientes()) {
            if (p instanceof Perro) p.mostrarInfo();
        }

    }

    private static void mostrarGatos() {
        System.out.println("\n--- Gatos ---");
        for (Paciente p : clinica.getPacientes()) {
            if (p instanceof Gato) p.mostrarInfo();
        }

    }

    private static void mostrarVeterinarios() {
        System.out.println("\n--- Veterinarios Registrados ---");
        for (Veterinario v : clinica.getVeterinarios()) {
            v.mostrarInfo();
            System.out.println("----------------------");
        }
    }

}


