import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableroAjedrez {
    private JFrame frame;
    private JPanel tablero;
    JButton boton;
    public TableroAjedrez(JFrame frame){
        this.frame = frame;
        this.tablero = new JPanel();
        CrearInterfaz();
    }

    private void CrearInterfaz() {
        frame.setSize(400,400);
        this.tablero.setLayout(new GridLayout(0,8));
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <8 ; j++) {
                 boton = new JButton();
                 boton.setToolTipText((i+1)+","+(j+i));
                DefinirColor(i,j);
                tablero.add(boton);
                CrearActionListener(boton);
            }
        }
    }

    private void CrearActionListener(JButton boton) {
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boton.getBackground().equals(Color.BLACK)){
                    JOptionPane.showMessageDialog(Ajedrez.framePrincipal,"Negra");
                }else{
                    JOptionPane.showMessageDialog(Ajedrez.framePrincipal,"Blanca");

                }
            }
        });
    }

    private void DefinirColor(int i, int j) {
        if((i+j)%2==0){
            boton.setBackground(Color.WHITE);
        }else
        boton.setBackground(Color.BLACK);
    }

    public JFrame getFrame(){
        return frame;
    }

    public JPanel getTablero() {
        return tablero;
    }
}
