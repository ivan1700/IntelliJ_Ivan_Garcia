/**
 * Medallero
 * Author: Ivan Garcia Belen
 * V.1.0
 */

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Medallero {


    List<Medalla> medallero = new ArrayList<>();


    public Medalla AgregarMedalla() {
        String nombre = JOptionPane.showInputDialog(null, "¿Cual es el nombre de la medalla?");
        TipoMedalla tipo = (TipoMedalla) JOptionPane.showInputDialog(null, "Tipo", "Selecciona el tipo de medalla", JOptionPane.QUESTION_MESSAGE, null, TipoMedalla.values(), TipoMedalla.MAGIC);
        int danyoBase = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el daño base de la medalla."));
        double multiplicador = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el multiplicador de la medalla (Con .  Ej: 1.23)"));
        Multiplicador AUp = (Multiplicador) JOptionPane.showInputDialog(null, "Buff", "Introduce el buff de ataque que proporciona", JOptionPane.QUESTION_MESSAGE, null, Multiplicador.values(), Multiplicador.CERO);
        Multiplicador PSMAUp = (Multiplicador) JOptionPane.showInputDialog(null, "Buff", "Introduce el buff de PSM ataque que proporciona", JOptionPane.QUESTION_MESSAGE, null, Multiplicador.values(), Multiplicador.CERO);
        Multiplicador DDown = (Multiplicador) JOptionPane.showInputDialog(null, "Buff", "Introduce el debuff de defensa que proporciona al enemigo", JOptionPane.QUESTION_MESSAGE, null, Multiplicador.values(), Multiplicador.CERO);
        Multiplicador PSMDDown = (Multiplicador) JOptionPane.showInputDialog(null, "Buff", "Introduce el debuff de PSM defensa que proporciona al enemigo", JOptionPane.QUESTION_MESSAGE, null, Multiplicador.values(), Multiplicador.CERO);
        int guilt = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tiene guilt la medalla? Introduce su valor de guilt"));
        Skills skill = (Skills) JOptionPane.showInputDialog(null, "Skill", "¿Que skill tiene?", JOptionPane.QUESTION_MESSAGE, null, Skills.values(), Skills.Ninguna);
        Traits trait0 = (Traits) JOptionPane.showInputDialog(null, "Traits", "¿Que trait tiene?Si no tiene o no tiene más dale a CANCELAR", JOptionPane.QUESTION_MESSAGE, null, Traits.values(), Traits.EA);
        if (trait0 != null) {
            Traits trait1 = (Traits) JOptionPane.showInputDialog(null, "Traits", "¿Que trait tiene?Si no tiene o no tiene más dale a CANCELAR", JOptionPane.QUESTION_MESSAGE, null, Traits.values(), Traits.EA);
            if (trait1 != null) {
                Traits trait2 = (Traits) JOptionPane.showInputDialog(null, "Traits", "¿Que trait tiene?Si no tiene o no tiene más dale a CANCELAR", JOptionPane.QUESTION_MESSAGE, null, Traits.values(), Traits.EA);
                if (trait2 != null) {
                    Traits trait3 = (Traits) JOptionPane.showInputDialog(null, "Traits", "¿Que trait tiene?Si no tiene o no tiene más dale a CANCELAR", JOptionPane.QUESTION_MESSAGE, null, Traits.values(), Traits.EA);
                    if (trait3 != null) {
                        return new Medalla(nombre, tipo, danyoBase, multiplicador, AUp, PSMAUp, DDown, PSMDDown, guilt, skill, trait0, trait1, trait2, trait3);
                    }
                    return new Medalla(nombre, tipo, danyoBase, multiplicador, AUp, PSMAUp, DDown, PSMDDown, guilt, skill, trait0, trait1, trait2);
                }
                return new Medalla(nombre, tipo, danyoBase, multiplicador, AUp, PSMAUp, DDown, PSMDDown, guilt, skill, trait0, trait1);
            }
            return new Medalla(nombre, tipo, danyoBase, multiplicador, AUp, PSMAUp, DDown, PSMDDown, guilt, skill, trait0);

        }
        return new Medalla(nombre, tipo, danyoBase, multiplicador, AUp, PSMAUp, DDown, PSMDDown, guilt, skill);

    }

    public String listarMedallas(){
        String salida="";
        for (int i = 0; i <medallero.size() ; i++) {
            salida+=medallero.get(i).getNombre()+"  \n";
        }
        return salida;
    }
}
