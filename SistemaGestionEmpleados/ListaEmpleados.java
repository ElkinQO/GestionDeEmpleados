
public class ListaEmpleados {

    public int tamanno;
    public int apuntador;
    public Empleados listaEmpleados[];

    public ListaEmpleados(int tammano) {
        this.tamanno = 5;
        listaEmpleados = new Empleados[tamanno];
    }

    public int buscarPosicion(String id) {
        int posicionEmpleado = 0;
        for (int i = 0; i < apuntador; i++) {
            if (listaEmpleados[i].getId().equals(id)) {
                posicionEmpleado = i;
            }
        }
        return posicionEmpleado;
    }

    public boolean agregar(Empleados nuevoEmpleado) {
        boolean exitoAgregar = false;
        if (nuevoEmpleado == null && apuntador >= listaEmpleados.length) {
            return exitoAgregar;
        }

        if (buscarPosicion(nuevoEmpleado.getId()) != -1) {
            return exitoAgregar;
        }

        exitoAgregar = true;
        listaEmpleados[apuntador++] = nuevoEmpleado;

        return exitoAgregar;

    }

    public boolean eliminarEmpleado(String id) {
        int posicion = buscarPosicion(id);
        boolean exitoEliminar = false;

        if (posicion == -1) {
            return exitoEliminar;
        }

        for (int i = posicion; i < apuntador - 1; i++) {
            listaEmpleados[i] = listaEmpleados[i + 1];
        }

        exitoEliminar = true;
        listaEmpleados[apuntador-- - 1] = null;

        return exitoEliminar;
    }

    public int cantidadDeEmpleados() {
        return apuntador;
    }

    public int verfificarEspaciosDisponibles() {
        return tamanno - apuntador;
    }

    public Empleados obtenerEmpleado(String id) {
        int posicion = buscarPosicion(id);
        if (posicion != -1) {
            return listaEmpleados[posicion];
        }

        return null;

    }

    public void mostrarTodos() {
        for (int i = 0; i < apuntador; i++) {
            listaEmpleados[i].mostrarInformacion();
        }
    }

}
