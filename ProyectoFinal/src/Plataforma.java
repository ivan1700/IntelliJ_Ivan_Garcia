public enum Plataforma {
    PS4("PS4"),
    XONE("XOne"),
    SWITCH("Switch"),
    PC("PC");

    private String plataforma;
    Plataforma(String plataforma){
        this.plataforma=plataforma;
    }

    @Override
    public String toString() {
        return plataforma;
    }
}
