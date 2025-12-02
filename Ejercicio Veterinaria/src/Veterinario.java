import java.util.ArrayList;

public class Veterinario {
    private String nombre;
    private String idProfesional;
    private String especialidad;
    private double salario;
    private ArrayList<Paciente> pacientesAsignados;

    public Veterinario(String nombre, String idProfesional, String especialidad, double salario) {
        this.nombre = nombre;
        this.idProfesional = idProfesional;
        this.especialidad = especialidad;
        this.salario = salario;
        this.pacientesAsignados = new ArrayList<>();
    }

    public void asignarPaciente(Paciente p) {
        pacientesAsignados.add(p);
    }

    public void mostrarInfo() {
        System.out.println("Veterinario: " + nombre + ", ID: " + idProfesional + ", Especialidad: " + especialidad + ", Salario: " + salario);
        System.out.println("Pacientes asignados:");
        for (Paciente p : pacientesAsignados) {
            p.mostrarInfo();
        }
    }
}

