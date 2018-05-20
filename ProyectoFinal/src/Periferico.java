public class Periferico extends Producto {
    private Plataforma plataforma;
    public Periferico(String nombre, double precio, String imagen, Plataforma plataforma) {
        super(nombre, precio, imagen);
        this.plataforma=plataforma;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }
}
