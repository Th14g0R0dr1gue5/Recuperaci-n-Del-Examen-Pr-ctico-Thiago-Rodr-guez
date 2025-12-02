import java.util.ArrayList;

public class ClinicaVeterinaria {
    private String nombre;
    private String direccion;
    private String telefono;
    private int capacidadPacientes;
    private ArrayList<Veterinario> veterinarios;
    private ArrayList<Paciente> pacientes;

    public ClinicaVeterinaria(String nombre, String direccion, String telefono, int capacidadPacientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.capacidadPacientes = capacidadPacientes;
        this.veterinarios = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    public void agregarVeterinario(Veterinario v) {
        veterinarios.add(v);
    }

    public void registrarPaciente(Paciente p) {
        if (pacientes.size() < capacidadPacientes) {
            pacientes.add(p);
        } else {
            System.out.println("Capacidad máxima alcanzada.");
        }
    }

    public ArrayList<Paciente> getPacientes() { return pacientes; }
    public ArrayList<Veterinario> getVeterinarios() { return veterinarios; }

    public void mostrarInfo() {
        System.out.println("Clínica: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono);
    }
}
