
import javax.swing.JOptionPane;

public class Main {

    public static void main(String args[]) {

        ListaEmpleados listaEmpleados = new ListaEmpleados(4);

        String menu = "Seleccione una opcion";
        menu += "\n1. Ver todos los empleados";
        menu += "\n2. Gestionar administrativos";
        menu += "\n3. Gestionar tecnicos";
        menu += "\n0. Salir";

        int opcion = 0;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {

                case 1:
                    if (listaEmpleados.apuntador == 0) {
                        JOptionPane.showMessageDialog(null, "La lista no cuenta con empleados");
                        continue;
                    }
                    JOptionPane.showMessageDialog(null, listaEmpleados);

                    break;

                case 2:
                    String menuAdministrativos = "Administrativos";
                    menuAdministrativos += "\n1. Agregar un empleado administrativo";
                    menuAdministrativos += "\n2. Eliminar empleado";
                    menuAdministrativos += "\n3. Modificar empleado";
                    menuAdministrativos += "\n0. Volver al menu principal";

                    int opcionAdministrativo = 0;

                    do {

                        opcionAdministrativo = Integer.parseInt(JOptionPane.showInputDialog(menuAdministrativos));

                        switch (opcionAdministrativo) {

                            case 1:
                                if (listaEmpleados.verfificarEspaciosDisponibles() == 0) {
                                    JOptionPane.showMessageDialog(null, "La lista esta llena no puede agregar mas empleados");
                                    continue;
                                }
                                String idAdmin = JOptionPane.showInputDialog("Ingrese el id del empleado");
                                String identificacionAdmin = JOptionPane.showInputDialog("Ingrese la identificacion del empleado");
                                String nombreAdmin = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
                                int salarioBaseAdmin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
                                int bonoMensualAdmin = Integer.parseInt("Ingrese el bono mensual del empleado");

                                EmpleadoAdministrativo empleadoAdministrativo = new EmpleadoAdministrativo(idAdmin,
                                        identificacionAdmin, nombreAdmin, salarioBaseAdmin, bonoMensualAdmin);
                                if (listaEmpleados.agregar(empleadoAdministrativo)) {
                                    JOptionPane.showMessageDialog(null, "Empleado agregado con exito");
                                }

                                break;

                            case 2:
                                String idEliminar = JOptionPane.showInputDialog("Ingrese el id del empleado que desea eliminar");
                                listaEmpleados.eliminarEmpleado(idEliminar);

                                break;

                        }

                    } while (opcionAdministrativo != 0);

                    break;
            }

        } while (opcion != 0);

    }
}
