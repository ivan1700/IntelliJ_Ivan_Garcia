import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelInfoProducto {
    private JPanel panel;

    public PanelInfoProducto(){
        this.panel=new JPanel();
        CrearInterfaz();
    }

    private void CrearInterfaz() {
        panel.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Info. Producto"));
    }

    public JPanel getPanel() {return panel;}
}
