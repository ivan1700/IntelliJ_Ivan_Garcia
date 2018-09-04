import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    int clicks=0;
    int nessieClicksPerSecond=0;
    private JFrame main;
    private JLabel mostradorClicks;
    private JButton mainButton;
    private JPanel items;
    private PanelItems pi= new PanelItems();
    public MainFrame(){
        main=new JFrame("Nessie Clicker");
        mostradorClicks = new JLabel();
        mainButton = new JButton("Consigue tus Knebep");
        items = pi.getPanel();
        CrearInterfaz();
        temporizador();
    }

    public void temporizador() {
        while(true){
            try {
                Thread.sleep(1000);
                clicks=clicks+nessieClicksPerSecond;
                mostradorClicks.setText(clicks+"");
                System.out.println(clicks + nessieClicksPerSecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void CrearInterfaz() {
        //adds
        main.add(mostradorClicks);
        main.add(items);
        main.add(mainButton);
        //main
        main.setVisible(true);
        main.setSize(800,500);
        main.setLayout(new GridLayout(2,2,2,2));
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //mostrador de clicks
        mostradorClicks.setText(clicks+"");
        //mainButton
        mainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicks++;
                mostradorClicks.setText(clicks+"");
            }
        });
        //items
            //AutoClicker
        pi.getAutoclicker().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(clicks>=BotonAutoClicker.getCostAutoclicker()){
                BotonAutoClicker.subirAutoclicker();
                nessieClicksPerSecond=nessieClicksPerSecond+BotonAutoClicker.getGenera();
                System.out.println("nessieClicksPerSecond "+nessieClicksPerSecond);
                clicks=clicks-BotonAutoClicker.getCostAutoclicker();
                mostradorClicks.setText(clicks+"");
            }
            }
        });
            //NocheTriste
        pi.getNocheTriste().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(clicks>=BotonNocheTriste.getCoste()){
                    BotonNocheTriste.subirNocheTriste();
                    nessieClicksPerSecond=nessieClicksPerSecond+BotonNocheTriste.getGenera();
                    clicks=clicks-BotonNocheTriste.getCoste();
                    mostradorClicks.setText(clicks+"");

                }
            }
        });

    }
}
