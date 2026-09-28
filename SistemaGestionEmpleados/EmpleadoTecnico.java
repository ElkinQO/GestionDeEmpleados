public class EmpleadoTecnico extends Empleados {
       
   private int horasExtras;

   public EmpleadoTecnico() {

   }

   public EmpleadoTecnico(String id, String nombre, String identificacion, int salarioBase, int horasExtras) {
      super(id, nombre, identificacion, salarioBase);
      this.horasExtras = horasExtras;
   }
   
   public void setHorasExtras(int horasExtras) {
      this.horasExtras = horasExtras;
   }

   public int getHorasExtras() {
      return horasExtras;
   }

   @Override
    public void mostrarInformacion() {
        String salida = " ";
        salida += "\nEmpleado tecnico ";
        salida += "\nEmpleado: " + (getId() + getIdentificacion() + getNombre() + getSalarioBase());
        salida += "\nHoras extras trabajadas: " + horasExtras;
    }


}

