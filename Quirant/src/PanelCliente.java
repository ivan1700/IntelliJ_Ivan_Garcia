import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PanelCliente implements Serializable {

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
    PanelNuevoCliente pnc= new PanelNuevoCliente();
    //Herramientas herramientas=new Herramientas();
    private static List<Cliente> lista = Herramientas.leerClientesDeFichero();
    PanelInfoCliente pic = new PanelInfoCliente();


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
        System.out.println(lista);
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

        Bnombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aBuscar= nombre.getText().toString();
                for (Cliente c:lista
                     ) {
                    if(c.getNombre().equalsIgnoreCase(aBuscar)){
                        System.out.println("encontrado");
                        nombre.setText(c.getNombre());
                        apellido.setText(c.getApellido0());
                        apellido1.setText(c.getApellido1());
                        telefono.setText(String.valueOf(c.getTelefono()));
                        direccion.setText(c.getDireccion());
                        pic.cargarInfo(c.getInformacion());

                    }
                }
            }
        });






        crearCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnc.setVisible();

            }
        });
    }

    public JPanel getPanel(){
        return this.panel;
    }

    public static List<Cliente> getLista(){
        return lista;
    }

    public static void recargarLista(List<Cliente> l){
        lista=l;
    }
}
