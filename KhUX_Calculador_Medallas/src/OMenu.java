public enum OMenu {
    AGREGAR("Agregar"),
    BORRAR("Borrar"),
    DETALLES("Detalles"),
    LISTADO("Listado"),
    SALIR("Salir");

    private String opcion;

    OMenu(String opcion) {
        this.opcion = opcion;
    }


    public String getOpcion(){
        return opcion;
    }
}

