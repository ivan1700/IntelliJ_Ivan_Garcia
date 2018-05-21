import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PreviewProducto {
    static private JPanel panelPreviewProducto;
    static private JLabel LimagenProducto;
    static private ImageIcon imagenProducto;
    static private Icon icono;


    public PreviewProducto() {
        this.panelPreviewProducto = new JPanel();
        this.LimagenProducto = new JLabel();
        this.imagenProducto = new ImageIcon();
        CrearInterfaz();

    }

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
        PreviewProducto.imagenProducto = imagenProducto;
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
        PreviewProducto.icono = icono;
    }

    public static JPanel getPanel() {
        return panelPreviewProducto;
    }
}
