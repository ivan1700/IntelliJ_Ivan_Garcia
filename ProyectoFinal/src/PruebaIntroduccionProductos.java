import java.util.ArrayList;
import java.util.List;

public class PruebaIntroduccionProductos {
    public static void main(String[] args) {
        Videojuego v0= new Videojuego("God of war",59.98,"gow.jpg",Plataforma.PS4,Genero.AVENTURA);
        Videojuego v1= new Videojuego("Sunset Overdrive",29.98,"sunset.jpg",Plataforma.XONE,Genero.HACKNSLASH);
        Videojuego v2= new Videojuego("DOOM",49.98,"DOOM.jpg",Plataforma.PC,Genero.FPS);
        Periferico p0 = new Periferico("Mando ps4",59.98,"mandops4.jpg",Plataforma.PS4);
        Periferico p1 = new Periferico("Mando XOne",59.98,"mandoXone.jpg",Plataforma.XONE);
        Herramientas herramientas=new Herramientas();
        List<Producto> productos = new ArrayList<>();
        productos.add(v0);
        productos.add(v1);
        productos.add(v2);
        productos.add(p0);
        productos.add(p1);
        herramientas.guardarProductosEnFicheros(productos);
    }
}
