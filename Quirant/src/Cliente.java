import java.io.Serializable;

public class Cliente implements Serializable {
    private String nombre;
    private String apellido0;
    private String apellido1;
    private String nombreCompleto;
    private String direccion;
    private int telefono;
    private String informacion;

    public Cliente(String nombre, String apellido0, String apellido1, String direccion, int telefono) {
        this.nombre = nombre;
        this.apellido0 = apellido0;
        this.apellido1 = apellido1;
        this.nombreCompleto=nombre+" "+apellido0+" "+apellido1;
        this.direccion = direccion;
        this.telefono = telefono;
        this.informacion = informacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido0() {
        return apellido0;
    }

    public void setApellido0(String apellido0) {
        this.apellido0 = apellido0;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    @Override
    public String toString() {
        return nombreCompleto + '\n';
    }
}
