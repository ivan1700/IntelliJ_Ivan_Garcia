public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String comunicarse(){
        return getNombre()+ " Dice : GUAU  GUAU"  ;
    }
}
