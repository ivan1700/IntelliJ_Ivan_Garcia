import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonAutoClicker {
    private static JButton main;
    private static int contAutoclicker=0;
    private static int costAutoclicker=10;
    private static int genera=1;
            public BotonAutoClicker(){
                main = new JButton("Autoclicker (Tienes "+contAutoclicker+" Cuesta "+costAutoclicker+" Genera 1)");

            }
    public static void subirAutoclicker(){
        main.setText("Autoclicker (Tienes "+ ++contAutoclicker+" Cuesta "+costAutoclicker+" Genera 1)");

    }

    public static int getCostAutoclicker(){
                return costAutoclicker;
    }

    public JButton getButton(){
                return main;
    }

    public static int getGenera(){
                return genera;
    }
}
