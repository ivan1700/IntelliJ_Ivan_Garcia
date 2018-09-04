import javax.swing.*;
import java.awt.*;

public class SemaforoPeatonal {
    JFrame main;
    private green verde;
    private red rojo;
    public SemaforoPeatonal(){
        main = new JFrame("Peatones");
        main.setVisible(true);
        main.setSize(250,400);
        main.setLayout(new GridLayout(2,0));
        main.setLocation(800,200);
        rojo =new red();
        rojo.iluminar();
        verde = new green();
        main.add(rojo.getPanel());
        main.add(verde.getPanel());
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void ponerseVerde(){
        verde.iluminar();
        rojo.apagar();
    }

    public void ponerseRojo(){
        rojo.iluminar();
        verde.apagar();
    }

    public void parpadeo(){
        int contador=0;
        System.out.println("Va a cambiar de color!");
        while (contador!=6){
            try {
                verde.iluminar();
                Thread.sleep(200);
                verde.apagar();
                Thread.sleep(200);
                contador++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public JFrame getFrame(){
        return main;
    }
}
