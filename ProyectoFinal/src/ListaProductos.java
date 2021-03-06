import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListaProductos implements Serializable {
    List<Producto> productos;
    Herramientas herramientas=new Herramientas();




    public ListaProductos(){
       productos=getProductos();
    }
    /**
     * A partir de la lista de donde están los productos, selecciona solo los de tipo "Periféricos".
     * @return Una lista en la que solo aparece los productos de tipo "Periféricos".
     */
    public List<Producto> getProductos(){
        List<Producto> salida = new ArrayList<>();
        salida=herramientas.leerProdcutosDeFichero();
        System.out.println(salida);
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
