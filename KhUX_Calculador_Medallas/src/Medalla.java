/**
 * Medalla
 * Author: Ivan Garcia Belen
 * V 1.0
 */

public class Medalla {
    private final String nombre;
    private final TipoMedalla tipo;
    private final int danyoBase;
    private final double multiplicador;
    private final Multiplicador AUp;
    private final Multiplicador PSMAUp;
    private final Multiplicador DUp;
    private final Multiplicador PSMDDown;
    private final int guilt;
    private final Skills skill;
    private  Traits trait0;
    private  Traits trait1;
    private  Traits trait2;
    private  Traits trait3;

    /**
     * Crea una medalla con todos los traits posibles
     * @param nombre
     * @param tipo
     * @param danyoBase
     * @param multiplicador
     * @param guilt
     * @param skill
     * @param trait0
     * @param trait1
     * @param trait2
     * @param trait3
     */
    public Medalla (String nombre,TipoMedalla tipo, int danyoBase, double multiplicador,Multiplicador AUp,Multiplicador PSMAUp,Multiplicador DUp,Multiplicador PSMDown, int guilt, Skills skill, Traits trait0, Traits trait1, Traits trait2,Traits trait3){
        this.nombre=nombre;
        this.tipo=tipo;
        this.danyoBase=danyoBase;
        this.multiplicador=multiplicador;
        this.AUp=AUp;
        this.PSMAUp=PSMAUp;
        this.DUp=DUp;
        this.PSMDDown=PSMDown;
        this.guilt=guilt;
        this.skill=skill;
        this.trait0=trait0;
        this.trait1=trait1;
        this.trait2=trait2;
        this.trait3=trait3;
    }

    /**
     * Crear una medalla con solo tres traits
     * @param nombre
     * @param tipo
     * @param danyoBase
     * @param multiplicador
     * @param guilt
     * @param skill
     * @param trait0
     * @param trait1
     * @param trait2
     */
    public Medalla(String nombre,TipoMedalla tipo, int danyoBase, double multiplicador,Multiplicador AUp,Multiplicador PSMAUp,Multiplicador DUp,Multiplicador PSMDown, int guilt, Skills skill, Traits trait0, Traits trait1, Traits trait2) {
        this.nombre = nombre;
        this.tipo=tipo;
        this.danyoBase = danyoBase;
        this.multiplicador = multiplicador;
        this.AUp=AUp;
        this.PSMAUp=PSMAUp;
        this.DUp=DUp;
        this.PSMDDown=PSMDown;
        this.guilt = guilt;
        this.skill = skill;
        this.trait0 = trait0;
        this.trait1 = trait1;
        this.trait2 = trait2;
    }

    /**
     * Crear una medalla con dos traits
     * @param nombre
     * @param tipo
     * @param danyoBase
     * @param multiplicador
     * @param guilt
     * @param skill
     * @param trait0
     * @param trait1
     */
    public Medalla(String nombre,TipoMedalla tipo, int danyoBase, double multiplicador,Multiplicador AUp,Multiplicador PSMAUp,Multiplicador DUp,Multiplicador PSMDown, int guilt, Skills skill, Traits trait0, Traits trait1) {
        this.nombre = nombre;
        this.tipo=tipo;
        this.danyoBase = danyoBase;
        this.multiplicador = multiplicador;
        this.AUp=AUp;
        this.PSMAUp=PSMAUp;
        this.DUp=DUp;
        this.PSMDDown=PSMDown;
        this.guilt = guilt;
        this.skill = skill;
        this.trait0 = trait0;
        this.trait1 = trait1;
    }

    /**
     * Crear una medalla con solo una trait
     * @param nombre
     * @param tipo
     * @param danyoBase
     * @param multiplicador
     * @param guilt
     * @param skill
     * @param trait0
     */
    public Medalla(String nombre,TipoMedalla tipo, int danyoBase, double multiplicador,Multiplicador AUp,Multiplicador PSMAUp,Multiplicador DUp,Multiplicador PSMDown, int guilt, Skills skill, Traits trait0) {
        this.nombre = nombre;
        this.tipo=tipo;
        this.danyoBase = danyoBase;
        this.multiplicador = multiplicador;
        this.AUp=AUp;
        this.PSMAUp=PSMAUp;
        this.DUp=DUp;
        this.PSMDDown=PSMDown;
        this.guilt = guilt;
        this.skill = skill;
        this.trait0 = trait0;
    }

    /**
     * Crea una medalla sin traits
     * @param nombre
     * @param tipo
     * @param danyoBase
     * @param multiplicador
     * @param guilt
     * @param skill
     */
    public Medalla(String nombre,TipoMedalla tipo, int danyoBase, double multiplicador,Multiplicador AUp,Multiplicador PSMAUp,Multiplicador DUp,Multiplicador PSMDown, int guilt, Skills skill) {
        this.nombre = nombre;
        this.tipo=tipo;
        this.danyoBase = danyoBase;
        this.multiplicador = multiplicador;
        this.AUp=AUp;
        this.PSMAUp=PSMAUp;
        this.DUp=DUp;
        this.PSMDDown=PSMDown;
        this.guilt = guilt;
        this.skill = skill;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoMedalla getTipo() {
        return tipo;
    }

    public int getDanyoBase() {
        return danyoBase;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public Multiplicador getAUp() {
        return AUp;
    }

    public Multiplicador getPSMAUp() {
        return PSMAUp;
    }

    public Multiplicador getDUp() {
        return DUp;
    }

    public Multiplicador getPSMDDown() {
        return PSMDDown;
    }

    public int getGuilt() {
        return guilt;
    }

    public Skills getSkill() {
        return skill;
    }

    public Traits getTrait0() {
        return trait0;
    }

    public Traits getTrait1() {
        return trait1;
    }

    public Traits getTrait2() {
        return trait2;
    }

    public Traits getTrait3() {
        return trait3;
    }
}
