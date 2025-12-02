public class Gato extends Paciente {
    private String colorPelaje;
    private boolean esIndoor;

    public Gato(String nombre, int edad, double peso, String dueno, String historialClinico, String colorPelaje, boolean esIndoor) {
        super(nombre, "Gato", edad, peso, dueno, historialClinico);
        this.colorPelaje = colorPelaje;
        this.esIndoor = esIndoor;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Color pelaje: " + colorPelaje + ", Es indoor: " + (esIndoor ? "Sí" : "No"));
    }
}
