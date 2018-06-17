import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelInfoCliente {
    private JPanel panel;
    private JLabel texto;
    private JScrollPane scrollText;


    public PanelInfoCliente(){
        panel=new JPanel();
        texto= new JLabel();
        //scrollText= new JScrollPane(texto);

        CrearInterfaz();
    }

    private void CrearInterfaz() {
        panel.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Informacion del cliente"));
        panel.setVisible(true);
        panel.setLayout(new GridLayout(1,0));
        panel.add(texto);
    }

    public void cargarInfo(String s){
        System.out.println(s);
        texto.setText(s);
//        scrollText.add(texto);
    }

    public JPanel getPanel(){
        return this.panel;
    }
}
