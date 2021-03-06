import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PanelRenovarTarjeta {
    private JFrame frame;
    private JTextField dni;
    private JTextField nuevoID;
    private JButton confirmar;
    private List<Cliente> clientes;
    PanelRenovarTarjeta(){
        this.frame=new JFrame();
        this.dni=new JTextField();
        this.nuevoID=new JTextField();
        this.confirmar=new JButton();
        CrearInterfaz();
    }

    /**
     * Crea la interfaz de la ventana
     */
    private void CrearInterfaz() {
        frame.setLayout(new GridLayout(0,1,2,2));
        frame.setLocationRelativeTo(null);
        frame.setSize(400,400);
        frame.setVisible(false);
        //dni
        frame.add(dni);
        dni.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Introduce el DNI del cliente"));
        //nuevoID
        frame.add(nuevoID);
        nuevoID.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Pasa la nueva tarjeta"));
        //confirmar
        frame.add(confirmar);
        confirmar.setText("Confirmar");
        confirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(EncontrarDNI(dni.getText())){
                    CambiarID(dni.getText(),nuevoID.getText());
                    JOptionPane.showMessageDialog(frame,"Cambio de ID realizado correctamente");
                    ResetearCampos();
                    frame.setVisible(false);
                }
            }
        });
    }

    /**
     * Cuando se le da al boton de "Confirmar" llama a este metodo para poner todos los campos vacios para luego poder ser usados
     * nuevamente.
     */
    private void ResetearCampos() {
        dni.setText("");
        nuevoID.setText("");
    }

    /**
     * Cambia el valor "ID" de un cliente en cuestión por uno nuevo
     * @param dni valor "DNI" del cliente a cambiar la ID
     * @param nuevaID Nueva id que se le aporta
     */
    private void CambiarID(String dni, String nuevaID) {
        for (Cliente c:
             clientes) {
            if(c.getDni().equalsIgnoreCase(dni)){
                Cliente aux=new Cliente(c.getNombre(),c.getDni(),nuevaID);
                clientes.remove(c);
                clientes.add(aux);
                break;
            }
        }

    }

    /**
     * Busca el valor "DNI" del cliente a cambiar la ID
     * @param dni valor "DNI" del cliente
     * @return un booleano, dando true si ese usurio existe en la lista y dando falso en el caso contrario.
     */
    private boolean EncontrarDNI(String dni){
        for (Cliente c:
                clientes) {
            if(c.getDni().equalsIgnoreCase(dni)){
                return true;
            }
        }
        JOptionPane.showMessageDialog(frame,"No existe un usuario con ese DNI");
        return false;
    }
    public void setVisible(){
        frame.setVisible(true);

    }
    public void pasarClientes(List<Cliente> lista){
        this.clientes=lista;
    }

    public List<Cliente> devolverClientes(){
        return clientes;
    }
}
