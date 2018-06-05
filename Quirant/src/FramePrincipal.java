import javax.swing.*;
import java.awt.*;

public class FramePrincipal {
    private JFrame frame;
    private JPanel PCliente;
    private JPanel PInfoCliente;

    public FramePrincipal(){
        PanelCliente pc= new PanelCliente();
        PanelInfoCliente pic= new PanelInfoCliente();
        this.frame =new JFrame("Clientes Electricidad Quirant                                                                                                               By:Iván García Belén");
        this.PCliente=pc.getPanel();
        this.PInfoCliente=pic.getPanel();
        CrearInterfaz();
    }

    private void CrearInterfaz() {
        //frame
        frame.add(PCliente);
        frame.add(PInfoCliente);
        frame.setSize(655, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0,2,5,5));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
