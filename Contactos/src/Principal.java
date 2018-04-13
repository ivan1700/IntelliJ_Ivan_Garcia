import javax.swing.*;

public class Principal {

    private static  Agenda agenda=new Agenda();
    private static int SALIR=-1;
    public static void main(String[] args) {
        int botonIntroducido;

        do{
            botonIntroducido= JOptionPane.showOptionDialog(null,"Opcion",
                    "Seleccione una opcion",0,0,null,OMenu.values(),OMenu.AÑADIR_CONTACTO);
            System.out.println(botonIntroducido);
            switch (botonIntroducido){
                case 0:
                    agenda.anyadirContacto();
                    break;
            }

        }while(botonIntroducido!=SALIR);
    }
}
