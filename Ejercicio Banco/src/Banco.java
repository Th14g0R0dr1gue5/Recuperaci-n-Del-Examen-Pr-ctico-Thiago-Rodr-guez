public class Banco {
    private String codigo;
    private String direccion;

    public Banco(String codigo, String direccion) {
        this.codigo = codigo;
        this.direccion = direccion;
    }

    public void mostrarInfo() {
        System.out.println("Banco Codigo: " + codigo + ", Direccion: " + direccion);
    }
}