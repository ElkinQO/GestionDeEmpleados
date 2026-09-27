public class EmpleadoTecnico extends Empleados {
       
   private int horasExtras;

   public EmpleadoTecnico() {

   }

   public EmpleadoTecnico(String id, String nombre, String identificacion, int salarioBase, int horasExtras, Empleados empleado) {
      super(id, nombre, identificacion, salarioBase, empleado);
      this.horasExtras = horasExtras;
   }
   
   public void setBonoMensual(int bonoMensual) {
      this.horasExtras = bonoMensual;
   }

   public int getBonoMensual() {
      return horasExtras;
   }

   @Override
    public void mostrarInformacion() {
        String salida = " ";
        salida += "\nEmpleado tecnico ";
        salida += "\nEmpleado: " + (empleado.getId() + empleado.getIdentificacion() + empleado.getNombre() + empleado.getSalarioBase());
        salida += "\nHoras extras trabajadas: " + horasExtras;
    }


}

