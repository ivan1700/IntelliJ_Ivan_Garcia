public class Animal {
    private String nombre;

    public Animal(String nombre){
        this.nombre=nombre;
    }

    public String  getNombre(){
        return nombre;
    }

    public String comunicarse(){
        return "Piticli piticlin, ole que bnico";
    }
}
