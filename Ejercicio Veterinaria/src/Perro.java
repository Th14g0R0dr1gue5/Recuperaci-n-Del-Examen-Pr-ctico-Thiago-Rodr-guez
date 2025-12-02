public class Perro extends Paciente {
    private String raza;
    private String nivelActividad;

    public Perro(String nombre, int edad, double peso, String dueno, String historialClinico, String raza, String nivelActividad) {
        super(nombre, "Perro", edad, peso, dueno, historialClinico);
        this.raza = raza;
        this.nivelActividad = nivelActividad;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Raza: " + raza + ", Nivel de actividad: " + nivelActividad);
    }
}
