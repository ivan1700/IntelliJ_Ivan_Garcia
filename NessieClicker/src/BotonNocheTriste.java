import javax.swing.*;

public class BotonNocheTriste {
    private static JButton main;
    private static int contador=0;
    private static int coste=50;
    private static int genera=10;

    public BotonNocheTriste(){
        main = new JButton("Noche Triste (Tienes "+contador+" Cuesta "+coste+" Genera 10)");

    }

    public static void subirNocheTriste(){

        main.setText("Noche Triste (Tienes "+ ++contador+" Cuesta "+coste+" Genera 10)");

    }

    public static  int getCoste(){
        return coste;
    }

    public static int getGenera() {
        return genera;
    }

    public JButton getButton(){
        return main;
    }
}
