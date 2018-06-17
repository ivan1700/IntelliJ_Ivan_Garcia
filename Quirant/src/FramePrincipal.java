import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FramePrincipal implements Serializable {
    private JFrame frame;
    private JPanel PCliente;
    private JPanel PLcliente;
    private JPanel PInfoCliente;

    public FramePrincipal(){
        PanelCliente pc= new PanelCliente();
        PanelInfoCliente pic= new PanelInfoCliente();
        PanelListaCliente plc=new PanelListaCliente();
        this.frame =new JFrame("Clientes Electricidad Quirant                                                                                                               By:Iván García Belén");
        this.PCliente=pc.getPanel();
        this.PInfoCliente=pic.getPanel();
        this.PLcliente=plc.getPanel();
        CrearInterfaz();
    }

    private void CrearInterfaz() {
        //frame
        frame.add(PCliente);
        frame.add(PInfoCliente);
        frame.add(PLcliente);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0,3,5,5));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
