public class Paciente {
    protected String nombre;
    protected String especie;
    protected int edad;
    protected double peso;
    protected String dueno;
    protected String historialClinico;

    public Paciente(String nombre, String especie, int edad, double peso, String dueno, String historialClinico) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.dueno = dueno;
        this.historialClinico = historialClinico;
    }

    public void mostrarInfo() {
        System.out.println("Paciente: " + nombre + ", Especie: " + especie + ", Edad: " + edad + ", Peso: " + peso + ", Dueño: " + dueno + ", Historial: " + historialClinico);
    }
}
