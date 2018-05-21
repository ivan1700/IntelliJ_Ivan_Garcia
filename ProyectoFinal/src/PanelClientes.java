import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelClientes {
    private JPanel panel;

    public PanelClientes(){
        this.panel= new JPanel();
        CrearInterfaz();
    }

    private void CrearInterfaz() {
        panel.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Cliente"));

    }

    public JPanel getPanel(){
        return panel;
    }
}
