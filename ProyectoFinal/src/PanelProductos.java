import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class PanelProductos {
    static private JPanel panelProductos;
    static private JComboBox selectorTipoProducto;
    static private JComboBox selectorProducto;
    private JLabel textoSelectoTProducto;
    private JLabel textoSelectoProducto;
    List<Producto> productos;
    List<Producto> listaFiltrada;
    ListaProductos l = new ListaProductos();

    //Constructor
    public PanelProductos() {
        this.panelProductos = new JPanel();
        this.selectorTipoProducto = new JComboBox();
        this.selectorProducto = new JComboBox();
        this.textoSelectoProducto = new JLabel();
        this.textoSelectoTProducto = new JLabel();
        this.productos=new ArrayList<>();
        this.listaFiltrada=new ArrayList<>();
        productos=l.gerProductos();
        CrearInterfaz();
    }

    private void CrearInterfaz() {
        //Menu del SelectorProducto
        final String[] MenuProductos = {"Videojuegos", "Periféricos", "Merchandising"};
        //Panel
        panelProductos.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.gray), "Selector productos"));
        panelProductos.add(textoSelectoTProducto);
        panelProductos.add(selectorTipoProducto);
        panelProductos.add(textoSelectoProducto);
        panelProductos.add(selectorProducto);
        panelProductos.setLayout(new GridLayout(2, 2, 10, 10));
        //Selector Tipo Producto
        selectorTipoProducto.setModel(new DefaultComboBoxModel(MenuProductos));
        selectorTipoProducto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getItem().toString().equals("Videojuegos")) {
                    listaFiltrada = l.SeleccionarListaVideojuegos();
                } else if (e.getItem().toString().equals("Periféricos")) {
                    listaFiltrada = l.SeleccionarListaPerifericos();
                } else if (e.getItem().toString().equals("Merchandising")) {
                    listaFiltrada = l.SeleccionarListaMerchandising();
                }
                //Cambia la lista a mostrar de los productos filtrados
                selectorProducto.setModel(new DefaultComboBoxModel(listaFiltrada.toArray()));
            }
        });

        selectorProducto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                seleccionarProducto(e);
            }
        });
        //Texto
        textoSelectoTProducto.setText("Tipo de producto:");
        textoSelectoProducto.setText("Producto:");



    }

    /**
     * Metodo para mostrar la información de los productos
     * @param e
     */
    private void seleccionarProducto(ItemEvent e) {
        for (int i = 0; i <listaFiltrada.size() ; i++) {
            if(e.getItem().toString().equals(listaFiltrada.get(i).getNombre())){
                PreviewProducto.setImagenProducto(new ImageIcon(listaFiltrada.get(i).getImagen()));;
                PreviewProducto.setIcono(new ImageIcon(PreviewProducto.getImagenProducto().getImage().getScaledInstance
                        (PreviewProducto.getLimagenProducto().getWidth(),PreviewProducto.getLimagenProducto().getHeight(), Image.SCALE_DEFAULT)));
                PreviewProducto.getLimagenProducto().setIcon(PreviewProducto.getIcono());
            }
        }
    }

    public static JPanel getPanel() {
        return panelProductos;
    }
}