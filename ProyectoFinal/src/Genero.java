public enum Genero {
    PLATAFORMA("Plataforma"),
    FPS("FPS"),
    HACKNSLASH("Hack n Slash"),
    AVENTURA("Aventura");

    private String genero;
    Genero(String genero){this.genero=genero;}

    @Override
    public String toString() {
        return genero;
    }
}
