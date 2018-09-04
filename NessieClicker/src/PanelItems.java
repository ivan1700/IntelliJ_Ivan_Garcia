import javax.swing.*;
import java.awt.*;

public class PanelItems {
    private JPanel main;
    private BotonAutoClicker BA= new BotonAutoClicker();
    private BotonNocheTriste BNT= new BotonNocheTriste();
    private JButton autoclicker;
    private JButton nocheSad;
    private int contAutoclicker=0;
    private int costAutoclicker=10;

        public PanelItems(){
            main= new JPanel();
            autoclicker = BA.getButton();
            nocheSad = BNT.getButton();
            CrearInterfaz();
    }

    private void CrearInterfaz() {
            main.setLayout(new GridLayout(2,2));
            main.add(autoclicker);
            main.add(nocheSad);
    }


    public JButton getAutoclicker(){
            return autoclicker;
    }

    public int getCostAutoclicker(){
            return BA.getCostAutoclicker();
    }

    public JButton getNocheTriste(){
            return nocheSad;
    }

    public int getCostNocheTriste(){
            return BNT.getCoste();
    }

    public JPanel getPanel(){
            return main;
    }
}
