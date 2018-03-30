/**
 * TipoMedalla
 * Author: Ivan Garcia Belen
 * V.1.0
 */
public enum TipoMedalla {
    POWER("Power"),
    SPEED("Speed"),
    MAGIC("Magic");

    private String tipo;

    TipoMedalla(String tipo){this.tipo=tipo;}

    public String getTipo(){return tipo;}

}