
public class Empleados implements IReportable {

    protected String id;
    protected String nombre;
    protected String identificacion;
    protected int salarioBase;

    public Empleados() {

    }

    public Empleados(String id, String nombre, String identificacion, int salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salarioBase = salarioBase;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void mostrarInformacion() {
        String salida = " ";
        salida += "\nNombre: " + nombre;
        salida += "\nIdentificacion: " + identificacion;
        salida += "\nSalario base: " + salarioBase;
    }

}
