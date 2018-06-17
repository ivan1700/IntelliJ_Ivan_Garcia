import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelListaCliente {
    private JPanel panel;
    private JList lista;

    public PanelListaCliente(){
        this.panel=new JPanel();
        this.lista=new JList(PanelCliente.getLista().toArray());
        CrearInterfaz();
    }

    private void CrearInterfaz() {
        panel.add(lista);
        lista.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Lista de clientes"));
        panel.setLayout(new GridLayout(1,0));
        panel.setVisible(true);

    }

    public void recargarLista(){
        this.lista=new JList(PanelCliente.getLista().toArray());
    }
    public JPanel getPanel(){
        return this.panel;
    }
}
