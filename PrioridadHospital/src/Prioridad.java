public enum Prioridad {
    DOLOR_DE_CABEZA(5,"Dolor De Cabeza"),
    VOMITOS(4,"Vomitos"),
    EXTREMIDAD_DOBLADA(3,"Extremidad doblada"),
    APUNYALADA(2,"Apuñalada"),
    EXTREMIDAD_COLGANDO(1,"Extremidad colgando");

    private int prioridad;
    private String dolencia;
    Prioridad(int prioridad,String dolencia){
        this.prioridad=prioridad;
        this.dolencia=dolencia;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getDolencia() {
        return dolencia;
    }

    @Override
    public String toString() {
        return dolencia;
    }
}
