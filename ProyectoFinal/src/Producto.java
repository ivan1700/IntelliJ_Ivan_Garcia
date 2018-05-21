import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Producto implements Serializable {
    protected final String nombre;
    protected double precio;
    protected  final String imagen;
    Herramientas Herramientas= new Herramientas();


    public Producto (String nombre, double precio, String imagen){
        this.nombre=nombre;
        this.precio=precio;
        this.imagen=imagen;
        List<Producto> productos = Herramientas.leerProdcutosDeFichero();

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
