import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class meterGente implements Serializable {

    private String nombre;
    private int id;

    public meterGente(String nombre,int id){
        this.nombre=nombre;
        this.id=id;
    }

    public String getNombre(){
    return nombre;
    }


    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        List<meterGente> lista =new ArrayList<>();

        lista.add(new meterGente("ivan",1700));
        lista.add(new meterGente("hgola",1111));
        lista.add(new meterGente("fasfas",1222));
        lista.add(new meterGente("fasfsaf",1333));

        try(RandomAccessFile raf = new RandomAccessFile("datos.dat","rw")){
            int contador=0;
            int salto=20;
            for (meterGente g:lista
                 ) {
                raf.seek(contador*salto);
                    raf.writeUTF(g.getNombre());
                raf.seek((contador*salto)+16);
                    raf.writeInt(g.getId());
                contador++;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
