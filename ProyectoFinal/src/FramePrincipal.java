import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class FramePrincipal implements Serializable {
    private JFrame frame;
    private JPanel productos;
    private JPanel previewProducto;
    private JPanel infoProducto;
    private JPanel clientes;

    public FramePrincipal() {
        PanelPreviewProducto pp = new PanelPreviewProducto();
        PanelProductos ppro = new PanelProductos();
        PanelClientes pc = new PanelClientes();
        PanelInfoProducto pip = new PanelInfoProducto();
        this.frame = new JFrame("GAME By:Ivan Garcia Belen");
        this.productos = ppro.getPanel();
        this.previewProducto = pp.getPanel();
        this.clientes = pc.getPanel();
        this.infoProducto = pip.getPanel();
        CrearInterfaz();

    }

    /**
     * Configuración de la ventana
     */
    private void CrearInterfaz() {
        frame.setLayout(new GridLayout(0, 2, 5, 5));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(655, 800);
        frame.add(productos);
        frame.add(previewProducto);
        frame.add(clientes);
        frame.add(infoProducto);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
