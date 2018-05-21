import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListaProductos implements Serializable {
    //static Herramientas herramientas= new Herramientas();
    List<Producto> productos;




    public ListaProductos(){
       productos=gerProductos();
    }
    /**
     * A partir de la lista de donde están los productos, selecciona solo los de tipo "Periféricos".
     * @return Una lista en la que solo aparece los productos de tipo "Periféricos".
     */
    public List<Producto> gerProductos(){
        List<Producto> salida = new ArrayList<>();
        salida=Herramientas.leerProdcutosDeFichero();
        return salida;
    }
    public  List<Producto> SeleccionarListaVideojuegos() {
        List<Producto> salida = new ArrayList<>();
        for (Producto v:
                productos) {
            if(v.getClass().equals(Videojuego.class)){
                salida.add(v);
            }}
        return salida;
    }

    /**
     * A partir de la lista de donde están todos los productos, selecciona solo los de tipo "Periféricos".
     * @return Una lista en la que solo aparece los productos de tipo "Periféricos".
     */
    public  List<Producto> SeleccionarListaPerifericos() {
        List<Producto> salida = new ArrayList<>();
        for (Producto v:
                productos) {
            if(v.getClass().equals(Periferico.class)){
                salida.add(v);
            }}
        return salida;
    }

    /**
     * A partir de la lista de donde están todos los productos, selecciona solo los de tipo "Merchandising".
     * @return Una lista en la que solo aparece los productos de tipo "Merchandising".
     */
    public  List<Producto> SeleccionarListaMerchandising() {
        List<Producto> salida = new ArrayList<>();
        for (Producto v:
                productos) {
            if(v.getClass().equals(Merchandising.class)){
                salida.add(v);
            }}
        return salida;
    }


}
