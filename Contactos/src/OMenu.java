public enum OMenu {
    AÑADIR_CONTACTO("Añadir Contacto"),
    BORRAR_CONTACTO("Borrar Contacto"),
    AÑADIR_INFO("Añadir info"),
    CONTACTOS_CON_INFO_DETERMINADA("Contactos con info determinada");

    String opcion;

    OMenu (String opcion){
        this.opcion=opcion;
    }

    @Override
    public String toString() {
        return opcion;
    }
}
