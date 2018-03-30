import javax.swing.*;

/**
 * Principal
 * Author: Ivan Garcia Belen
 * V.1.0
 *
 */


public class Principal {
    final static int AGREGAR=0;
    final static int BORRAR=1;
    final static int DETALLES=2;
    final static int LISTADO=3;
    final static int SALIR=4;

    public static void main(String[] args) {
        int botonIntroducido;
        do{
            botonIntroducido=JOptionPane.showOptionDialog(null,"Menú","Escoga una opción",0,0,null,OMenu.values(),OMenu.AGREGAR.getOpcion());
            System.out.println(botonIntroducido);

            switch (botonIntroducido){
                case AGREGAR:
            }

        }while (botonIntroducido!=SALIR);


    }
}
