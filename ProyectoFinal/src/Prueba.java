import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prueba {
    //Videojuego creado para poder usar los metodos de lectura y escritura.
    static Videojuego v= new Videojuego("juego",10.1,"das",Plataforma.PS4,Genero.AVENTURA);
    static List<Producto> productosFiltrados = new ArrayList<>();
    static Herramientas Herramientas= new Herramientas();
    static List<Producto> productos = Herramientas.leerProdcutosDeFichero();

    /**
     * Funcion de prueba para crear los productos.
     */
    public static void AnyadirProductos(){
        Videojuego v0= new Videojuego("Doom",39.99,"DOOM.jpg",Plataforma.PC,Genero.FPS);
        Videojuego v1= new Videojuego("Sunset Overdrive",59.99,"sunset.jpg",Plataforma.XONE,Genero.HACKNSLASH);
        Videojuego v2= new Videojuego("God of war",54.99,"gow.jpg",Plataforma.PS4,Genero.AVENTURA);
        Periferico p0 =new Periferico("Mando PS4",54.89,"mandops4.jpg",Plataforma.PS4);
        Periferico p1 =new Periferico("Mando XBox One",54.89,"mandoXone.jpg",Plataforma.XONE);
        Merchandising m1 = new Merchandising("Jose Angel",0.99,"jose.jpg");
        productos.add(v0);
        productos.add(v1);
        productos.add(v2);
        productos.add(p0);
        productos.add(p1);
        productos.add(m1);
    }
    static final String[] MenuProductos = {"Videojuegos","Periféricos","Merchandising"};
    static private JFrame framePrincipal = new JFrame();
    static private JPanel panelPrincipal = new JPanel();
    static private JComboBox selectorTipoProducto= new JComboBox();
    static private JComboBox selectorProducto = new JComboBox();
    static private JLabel LimagenProducto = new JLabel();
    static private ImageIcon imagenProducto = new ImageIcon();
    static private Icon icono;

    /**
     * A partir de la lista de donde están los productos, selecciona solo los de tipo "Periféricos".
     * @return Una lista en la que solo aparece los productos de tipo "Periféricos".
     */
    private static List<Producto> SeleccionarListaVideojuegos() {
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
    private static List<Producto> SeleccionarListaPerifericos() {
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
    private static  List<Producto> SeleccionarListaMerchandising() {
        List<Producto> salida = new ArrayList<>();
        for (Producto v:
                productos) {
            if(v.getClass().equals(Merchandising.class)){
                salida.add(v);
            }}
        return salida;
    }
    /**
     * Metodo para mostrar la información de los productos
     * @param e
     */
    private static void SeleccionarObjeto(ItemEvent e) {
        for (int i = 0; i <productosFiltrados.size() ; i++) {
            if(e.getItem().toString().equals(productosFiltrados.get(i).getNombre())){
                imagenProducto = new ImageIcon(productosFiltrados.get(i).getImagen());
                icono= new ImageIcon(imagenProducto.getImage().getScaledInstance(LimagenProducto.getWidth(),LimagenProducto.getHeight(), java.awt.Image.SCALE_DEFAULT));
                LimagenProducto.setIcon(icono);
            }
        }
    }
    //Empieza
    public static void main(String[] args) {
        //AnyadirProductos();
        Herramientas.guardarProductosEnFicheros(productos);
        selectorTipoProducto.setModel(new DefaultComboBoxModel(MenuProductos));

        //ActionListener para filtrar los productos por categorias.
        selectorTipoProducto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getItem().toString().equals("Videojuegos")) {
                    productosFiltrados = SeleccionarListaVideojuegos();
                }else if(e.getItem().toString().equals("Periféricos")){
                    productosFiltrados = SeleccionarListaPerifericos();
                }else if(e.getItem().toString().equals("Merchandising")){
                    productosFiltrados = SeleccionarListaMerchandising();
                }
                //Cambia la lista a mostrar de los productos filtrados.
                selectorProducto.setModel(new DefaultComboBoxModel(productosFiltrados.toArray()));
            }


        });
        //ActionListener para seleccionar uno de los productos ya filtrados.
        selectorProducto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                SeleccionarObjeto(e);
            }


        });

        //Configuracion de la ventana
        framePrincipal.setSize(1000,800);
        panelPrincipal.setLayout(new GridLayout(0,2,5,5));
        LimagenProducto.setPreferredSize(new Dimension(1000,1000));
        panelPrincipal.add(selectorTipoProducto);
        panelPrincipal.add(LimagenProducto);
        panelPrincipal.add(selectorProducto);
        framePrincipal.add(panelPrincipal);
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setVisible(true);
    }




}
