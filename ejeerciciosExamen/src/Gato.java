public class Gato extends Animal{
    public Gato(String nombre){
        super(nombre);
    }

    @Override
    public String comunicarse(){
        return getNombre()+" Dice : MIAU MIAU";
    }
}
