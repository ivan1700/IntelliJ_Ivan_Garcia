import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Herramientas {
    /**
     * Guarda la lista de los productos en un fichero para luego poder ser cargado.
     * @param lista de los productos disponibles
     */
    public void guardarProductosEnFicheros(List<Producto> lista){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("productos.ob"))) {
            try{
                oos.writeObject(lista);
            }catch (NotSerializableException e){
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Producto> leerProdcutosDeFichero(){
        List<Producto> salida = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("productos.ob"))) {
            try{
                salida= (List<Producto>) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return salida;
    }
}
