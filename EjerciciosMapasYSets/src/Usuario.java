public class Usuario implements Comparable {
    private  final String nombre;
    private String contraseñya;

    public Usuario (String nombre,String contraseñya){
        this.nombre=nombre;
        this.contraseñya=contraseñya;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String salida(){
        return "Usuario: "+this.nombre + " Contraseña: " + this.contraseñya;
    }

    @Override
    public int compareTo(Object o) {
        Usuario aComparar = (Usuario) o;
        return -1*this.getNombre().compareToIgnoreCase(aComparar.getNombre());
    }
}
