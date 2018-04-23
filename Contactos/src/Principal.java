import javax.swing.*;

public class Principal {

    private static Agenda agenda = new Agenda();
    private static int SALIR = -1;

    public static void main(String[] args) {
        int botonIntroducido;

        do {
            botonIntroducido = JOptionPane.showOptionDialog(null, "Seleccione una opción.",
                    "Seleccione una opcion.", 0, 0, null, OMenu.values(), OMenu.AÑADIR_CONTACTO);
            System.out.println(botonIntroducido);

            switch (botonIntroducido) {
                case 0:
                    agenda.anyadirContacto();
                    break;
                case 1:
                    agenda.borrarContacto();
                    break;
                case 2:
                    agenda.anyadirInfo();
                    break;
                case 3:
                    agenda.verInfo();

                    break;
                case 4:
                    agenda.verInfoConcreta();
                    break;
            }

        } while (botonIntroducido != SALIR);
    }
}
