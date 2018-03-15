
import javax.swing.*;
import java.text.DecimalFormat;


public class autobus{
    static final int MINIMO=20;
    static final double RECARGO=0.03;
    static final int DISTANCIA_RECARGO=200;
    static final int DISTANCIA_DESCUENTO=400;
    static final int DESCUENTO=15;
    static final int DESCUENTO_GRUPO=10;
    static DecimalFormat df= new DecimalFormat("#.##");
    public static void main(String[] args) {
        int personas=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantas personas sois?"));
        int kilometros=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Kilometros a recorrer?"));
        double calculoRecargo=((kilometros-DISTANCIA_RECARGO)*RECARGO)+MINIMO;
        double KilometroDescuento=(calculoRecargo*DESCUENTO)/100;
        double grupoDescuento=(calculoRecargo*DESCUENTO_GRUPO)/100;



        if(personas<=1 && kilometros>DISTANCIA_RECARGO && kilometros<DISTANCIA_DESCUENTO ){
            JOptionPane.showMessageDialog(null,"El precio es de: "+df.format(calculoRecargo));



        }
        if(personas<=1 && kilometros>DISTANCIA_DESCUENTO){

            JOptionPane.showMessageDialog(null,"El precio es de: "+df.format(calculoRecargo - KilometroDescuento));

        }

        if(personas>=3 && kilometros>DISTANCIA_RECARGO && kilometros<DISTANCIA_DESCUENTO){
            JOptionPane.showMessageDialog(null,"El precio es de: "+df.format(calculoRecargo-grupoDescuento));
        }

        if(personas>=3 && kilometros>DISTANCIA_DESCUENTO){

            JOptionPane.showMessageDialog(null,"El precio es de: "+df.format((calculoRecargo - KilometroDescuento)-grupoDescuento));

        }

        if(kilometros<DISTANCIA_RECARGO && personas==1){
            JOptionPane.showMessageDialog(null,"El precio es de: "+MINIMO);
        }
        else{
            JOptionPane.showMessageDialog(null,"El precio es de: "+df.format(MINIMO-(DESCUENTO_GRUPO*10)/100));
        }

    }
}


