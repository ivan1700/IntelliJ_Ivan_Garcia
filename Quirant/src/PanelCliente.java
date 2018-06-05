import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelCliente {
    private JPanel panel;
    private JTextField nombre;
    private JTextField apellido;
    private JTextField apellido1;
    private JTextField direccion;
    private JTextField telefono;
    private JButton Bnombre;
    private JButton Bapellido;
    private JButton Bapellido1;
    private JButton Btelefono;
    private JButton crearCliente;


    public PanelCliente() {
        this.panel = new JPanel();
        this.nombre =new JTextField();
        this.apellido = new JTextField();
        this.apellido1 = new JTextField();
        this.direccion = new JTextField();
        this.telefono = new JTextField();
        Bnombre = new JButton("Buscar por nombre");
        Bapellido = new JButton("Buscar por 1ºapellido");
        Bapellido1 = new JButton("Buscar por 2ºapellido");
        Btelefono = new JButton("Buscar por télefono");
        crearCliente =new JButton("Nuevo cliente");
        CrearInterfaz();
    }

    private void CrearInterfaz() {
        //panel principal
        panel.add(nombre);
        panel.add(Bnombre);
        panel.add(apellido);
        panel.add(Bapellido);
        panel.add(apellido1);
        panel.add(Bapellido1);
        panel.add(telefono);
        panel.add(Btelefono);
        panel.add(direccion);
        panel.add(crearCliente);
        panel.setLayout(new GridLayout(0,1,5,5));
        panel.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.gray), "Buscador cliente"));
        panel.setVisible(true);
        nombre.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Nombre Cliente"));
        apellido.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"1ºApellido Cliente"));
        apellido1.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"2ºApellido Cliente"));
        direccion.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Direccion Cliente"));
        telefono.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Telefono Cliente"));
    }

    public JPanel getPanel(){
        return this.panel;
    }
}
