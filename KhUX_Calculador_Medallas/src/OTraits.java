public enum OTraits {
    CONTINUAR("Continuar"),
    SIN_MAS_TRAITS("Sin más traits"),
    CANCELAR("Cancelar");

    private String opcion;

    OTraits (String opcion){this.opcion=opcion;}

    public String getOpcion(){return opcion;}
}
