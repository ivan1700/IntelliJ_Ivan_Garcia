import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Videojuego extends Producto implements Serializable {
    private Plataforma plataforma;
    private final Genero genero;
    public Videojuego(String nombre, double precio, String imagen,Plataforma plataforma, Genero genero) {
        super(nombre, precio, imagen);
        this.plataforma=plataforma;
        this.genero=genero;

    }
    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public String getImagen(){
        return this.imagen;
    }


    public Plataforma getPlataforma() {
        return plataforma;
    }

    public Genero getGenero() {
        return genero;
    }


}
