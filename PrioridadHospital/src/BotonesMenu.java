public enum BotonesMenu {
    NUEVO_PACIENTE ("Nuevo paciente"),
    ATENDER_PACIENTE ("Atender paciente");

    private String opcion;

    BotonesMenu(String opcion){
        this.opcion=opcion;
    }

    @Override
    public String toString() {
        return opcion;
    }
}
