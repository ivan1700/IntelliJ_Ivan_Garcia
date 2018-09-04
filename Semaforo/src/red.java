import javax.swing.*;
import java.awt.*;

public class red implements Semaforo{
    private JPanel main;

    public red(){
        main = new JPanel();
        apagar();
    }

    public JPanel getPanel(){
        return main;
    }

    @Override
    public void iluminar() {
        main.setBackground(Color.RED);

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
