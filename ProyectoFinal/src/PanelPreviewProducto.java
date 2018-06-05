import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelPreviewProducto {
    static private JPanel panelPreviewProducto;
    static private JLabel LimagenProducto;
    static private ImageIcon imagenProducto;
    static private Icon icono;


    public PanelPreviewProducto() {
        this.panelPreviewProducto = new JPanel();
        this.LimagenProducto = new JLabel();
        this.imagenProducto = new ImageIcon();
        CrearInterfaz();

    }

    /**
     * Crea la interdaz de la ventana
     */
    private void CrearInterfaz() {
        panelPreviewProducto.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.BLACK), "Preview"));
        panelPreviewProducto.add(LimagenProducto);
        panelPreviewProducto.setLayout(new GridLayout(0, 1));
        panelPreviewProducto.setSize(1000, 1000);

    }

    public static void setLimagenProducto(JLabel limagenProducto) {
        LimagenProducto = limagenProducto;
    }

    public static void setImagenProducto(ImageIcon imagenProducto) {
        PanelPreviewProducto.imagenProducto = imagenProducto;
    }

    public static JLabel getLimagenProducto() {
        return LimagenProducto;
    }

    public static ImageIcon getImagenProducto() {
        return imagenProducto;
    }

    public static Icon getIcono() {
        return icono;
    }

    public static void setIcono(Icon icono) {
        PanelPreviewProducto.icono = icono;
    }

    public static JPanel getPanel() {
        return panelPreviewProducto;
    }
}
