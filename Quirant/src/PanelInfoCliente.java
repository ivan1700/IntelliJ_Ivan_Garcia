import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelInfoCliente {
    private JPanel panel;
    private JTextArea texto;
    private JScrollPane scrollText;

    public PanelInfoCliente(){
        panel=new JPanel();
        texto= new JTextArea();
        scrollText= new JScrollPane(texto);

        CrearInterfaz();
    }

    private void CrearInterfaz() {
        panel.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Informacion del cliente"));
        panel.setVisible(true);
        panel.setLayout(new GridLayout(1,0));
        panel.add(scrollText);
    }

    public JPanel getPanel(){
        return this.panel;
    }
}
