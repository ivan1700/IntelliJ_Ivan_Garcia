import javax.swing.*;
import java.awt.*;

public class Ajedrez {
    public static JFrame framePrincipal;
    private JPanel tablero;

    public Ajedrez(){
        this.framePrincipal= new JFrame();
        this.tablero= new TableroAjedrez(framePrincipal).getTablero();
        crearInterfaz();
    }

    private void crearInterfaz(){
        framePrincipal.setTitle("Ajedrez");
        framePrincipal.setSize(800,800);
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setLayout(new GridLayout(0,1));
        framePrincipal.getContentPane().add(tablero);
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setVisible(true);

    }
}
