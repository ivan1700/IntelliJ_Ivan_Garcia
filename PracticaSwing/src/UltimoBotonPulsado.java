import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UltimoBotonPulsado {
    public static void main(String[] args) {


        //Creación de objetos
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JLabel label2 = new JLabel();
        JButton botonUno = new JButton();
        JButton botonDos = new JButton();
        ImageIcon goku = new ImageIcon("goku.gif");
        ImageIcon vegeta = new ImageIcon("vegeta.gif");

        //Propiedades del objeto
        //setSize refimensiona la ventana
        frame.setSize(800, 400);
        frame.setTitle("Ventana 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        //Con el GridLayout modificas la estructura y la conposicion de la ventana
        panel.setLayout(new GridLayout(0,2,5,5));
        label.setHorizontalAlignment(JLabel.CENTER);
        botonUno.setText("Goku");
        botonDos.setText("Vegeta");
        label2.setText("Pulsa en un botón");
        //Reacciones de cada boton
        botonUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Has pulsado "+ botonUno.getText());
                label2.setIcon(goku);
            }
        });

        botonDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Has pulsado "+botonDos.getText());
                label2.setIcon(vegeta);
            }
        });


        //Añades al panel lo que quieras
        panel.add(botonUno);
        panel.add(botonDos);
        panel.add(label);
        panel.add(label2);

        //Añades el panel al frame
        frame.getContentPane().add(panel);
        //Haces el frame visible
        frame.setVisible(true);
    }
}