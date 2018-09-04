import javax.swing.*;
import java.awt.*;

public class green implements Semaforo{
    private JPanel main;

    public green(){
        main = new JPanel();
        apagar();
    }
     public JPanel getPanel(){
        return main;
     }

    @Override
    public void iluminar() {
        main.setBackground(Color.GREEN);

    }

    @Override
    public void apagar() {
        main.setBackground(Color.BLACK);

    }

    @Override
    public boolean estaApagado() {
        if(main.getBackground()==Color.BLACK){
            return true;
        }
        return false;
    }
}
