public class Vaca extends Animal {
    public Vaca(String nombre){
        super(nombre);
    }

    @Override
    public String comunicarse(){
        return getNombre()+ " Dice : MUUUUU MUUU";
    }
}
