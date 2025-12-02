public class AgenteViajes {
    private String nombre;
    private String idEmpleado;
    private String turno;
    private double salario;
    private SucursalAgencia sucursalAsignada;

    public AgenteViajes(String nombre, String idEmpleado, String turno, double salario) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.turno = turno;
        this.salario = salario;
    }

    public void asignarSucursal(SucursalAgencia sucursal) {
        this.sucursalAsignada = sucursal;
    }

    public void mostrarInfo() {
        System.out.println("Agente: " + nombre + ", ID: " + idEmpleado + ", Turno: " + turno + ", Salario: " + salario);
        if (sucursalAsignada != null) {
            System.out.println("Sucursal asignada: " + sucursalAsignada);
        }
    }
}

