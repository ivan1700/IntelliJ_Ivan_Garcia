import javax.swing.*;
import java.awt.*;

public class FramePrincipal {
    private JFrame frame;
    private JPanel productos;
    private JPanel previewProducto;
    private JPanel infoProducto;
    private JPanel clientes;

    public FramePrincipal() {
        PreviewProducto pp = new PreviewProducto();
        PanelProductos ppro = new PanelProductos();
        PanelClientes pc = new PanelClientes();
        PanelInfoProducto pip = new PanelInfoProducto();
        this.frame = new JFrame();
        this.productos = ppro.getPanel();
        this.previewProducto = pp.getPanel();
        this.clientes = pc.getPanel();
        this.infoProducto = pip.getPanel();
        CrearInterfaz();

    }

    private void CrearInterfaz() {
        frame.setLayout(new GridLayout(0, 2, 5, 5));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);
        frame.add(productos);
        frame.add(previewProducto);
        frame.add(clientes);
        frame.add(infoProducto);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
