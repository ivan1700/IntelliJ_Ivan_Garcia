import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelInfoProducto {
    private JPanel panel;
    private JLabel nombre;
    private JLabel plataforma;
    private JLabel precio;
    private JLabel genero;
    private static JTextField TFNombre;
    private static JTextField TFPlataforma;
    private static JTextField TFPrecio;
    private static JTextField TFGenero;


    public PanelInfoProducto() {
        this.panel = new JPanel();
        this.nombre = new JLabel();
        this.plataforma = new JLabel();
        this.genero = new JLabel();
        this.precio = new JLabel();
        TFNombre = new JTextField();
        TFPlataforma = new JTextField();
        TFPrecio = new JTextField();
        TFGenero = new JTextField();
        CrearInterfaz();
    }


    private void CrearInterfaz() {
        panel.setLayout(new GridLayout(0, 2));
        panel.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY), "Info. Producto"));
        //Nombre
        panel.add(nombre);
        panel.add(TFNombre);
        nombre.setText("Nombre:");
        TFNombre.setEnabled(false);
        TFNombre.setDisabledTextColor(Color.BLACK);
        //Plataforma
        panel.add(plataforma);
        panel.add(TFPlataforma);
        plataforma.setText("Plataforma:");
        TFPlataforma.setEnabled(false);
        TFPlataforma.setDisabledTextColor(Color.BLACK);
        //Genero
        panel.add(genero);
        panel.add(TFGenero);
        genero.setText("Genero");
        TFGenero.setEnabled(false);
        TFGenero.setDisabledTextColor(Color.BLACK);
        //Precio
        panel.add(precio);
        panel.add(TFPrecio);
        precio.setText("Precio:");
        TFPrecio.setEnabled(false);
        TFPrecio.setDisabledTextColor(Color.BLACK);
    }

    public static void setTFNombre(String nombreProducto) {
        TFNombre.setText(nombreProducto);
    }

    public static void setTFPlataforma(String plataforma) {
        TFPlataforma.setText(plataforma);
    }

    public static void setTFPrecio(double precio) {
        TFPrecio.setText(String.valueOf(precio));
    }

    public static void setTFGenero(String genero) {
        TFGenero.setText(genero);
    }

    public JPanel getPanel() {
        return panel;
    }
}
