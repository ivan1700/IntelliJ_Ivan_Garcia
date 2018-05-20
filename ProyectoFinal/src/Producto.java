import java.io.Serializable;

public abstract class Producto implements Serializable {
    protected final String nombre;
    protected double precio;
    protected  final String imagen;



    public Producto (String nombre, double precio, String imagen){
        this.nombre=nombre;
        this.precio=precio;
        this.imagen=imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
