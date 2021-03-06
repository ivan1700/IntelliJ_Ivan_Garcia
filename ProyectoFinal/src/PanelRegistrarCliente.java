import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PanelRegistrarCliente {
    private JFrame frame;
    private JPanel panel;
    private JLabel nombre;
    private JLabel dni;
    private JTextField Inombre;
    private JTextField IDni;
    private JButton aceptar;
    private JButton cancelar;
    private Herramientas herramientas=new Herramientas();

    public PanelRegistrarCliente() {
        this.frame=new JFrame("Nuevo cliente");
        this.panel=new JPanel();
        this.nombre=new JLabel();
        this.dni=new JLabel();
        this.Inombre=new JTextField();
        this.IDni=new JTextField();
        this.aceptar=new JButton();
        this.cancelar=new JButton();
        CrearInterfaz();
    }

    /**
     * Crea la interfaz de la ventana
     */
    private void CrearInterfaz() {
        panel.setLayout(new GridLayout(0,2,5,5));
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        panel.add(nombre);
        panel.add(Inombre);
        panel.add(dni);
        panel.add(IDni);
        panel.add(aceptar);
        panel.add(cancelar);
        frame.setVisible(false);
        nombre.setText("Introduzca el nombre: ");
        dni.setText("Introduce el DNI");
        aceptar.setText("Crear cuenta");
        cancelar.setText("Cancelar creacion");
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });

    }

    public JFrame getFrame() {
        return frame;
    }

    /**
     * Cuando se le da al boton "Aceptar" crear el usuario, es añadido a la lista y luego se guarda en el fichero
     * @param clientes lista de clientes para poder luego añadir al nuevo cliente.
     * @param login ID de la tarjeta que se usará para identificarse.
     */
    public void CrearUsuario(List<Cliente>clientes ,String login){
        frame.setVisible(true);
        System.out.println("ESTE Es EL LOGIN: "+login);
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente c = new Cliente(Inombre.getText(),IDni.getText(),login);
                clientes.add(c);
                herramientas.GuardarClientesEnFichero(clientes);
                Inombre.setText("");
                IDni.setText("");
                frame.setVisible(false);
            }
        });
    }
}


