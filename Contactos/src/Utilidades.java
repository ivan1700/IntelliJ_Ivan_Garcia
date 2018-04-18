public class Utilidades {
    public String comprobarContacto(String nombre){
        if(nombre=="" || nombre==null){
            throw new NullPointerException("Error en el nombre");
        }
    return nombre;
    }
}
