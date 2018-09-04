import javax.swing.*;
import java.awt.*;

public class yellow implements Semaforo {
    private JPanel main;

    public yellow(){
        main = new JPanel();
        apagar();
    }

    public void iluminar(){
        main.setBackground(Color.YELLOW);
    }

    public void apagar(){
        main.setBackground(Color.BLACK);
    }

    @Override
    public boolean estaApagado() {
        if(main.getBackground()==Color.BLACK){
            return true;
        }
        return false;
    }

    public JPanel getPanel(){
        return main;
    }
}
