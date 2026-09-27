
public class EmpleadoAdministrativo extends Empleados {

    private int bonoMensual;

    public EmpleadoAdministrativo() {

    }

    public EmpleadoAdministrativo(String id, String nombre, String identificacion, int salarioBase, int bonoMensual, Empleados empleado) {
        super(id, nombre, identificacion, salarioBase, empleado);
        this.bonoMensual = bonoMensual;
    }

    public void setBonoMensual(int bonoMensual) {
        this.bonoMensual = bonoMensual;
    }

    public int getBonoMensual() {
        return bonoMensual;
    }

    @Override
    public void mostrarInformacion() {
        String salida = " ";
        salida += "\nEmpleado tecnico ";
        salida += "\nEmpleado: " + (empleado.getId() + empleado.getIdentificacion() + empleado.getNombre() + empleado.getSalarioBase());
        salida += "\nBono mensual: " + bonoMensual;
    }

}
