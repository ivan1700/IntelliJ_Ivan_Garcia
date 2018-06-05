import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Herramientas implements Serializable{
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

    /**
     * Lee los productos del archivo
     * @return lista de los prodcutos disponibles
     */
    public  List<Producto> leerProdcutosDeFichero(){
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

    /**
     * Guarda una lista de clientes en un archivo para poder leerlos nada más ejecutar el programa
     * @param lista Una lista con los clientes
     */
    public  void GuardarClientesEnFichero(List<Cliente> lista){
        try(DataOutputStream dos= new DataOutputStream(new FileOutputStream("clientes.cl"))) {
            for (Cliente c:
                 lista) {
                dos.writeUTF(c.getNombre());
                dos.writeUTF(c.getDni());
                dos.writeUTF(c.getId());
                dos.writeInt(c.getPuntos());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Lee un archivo los clientes que están registrados
     * @return una lista con los clientes.
     */
    public  List<Cliente> LeerClientesDeFichero(){
        List<Cliente> lista =new ArrayList<>();
        try(DataInputStream dis= new DataInputStream(new FileInputStream("clientes.cl"))) {
            try{
                while (true){
                    Cliente c=new Cliente(dis.readUTF(),dis.readUTF(),dis.readUTF(),dis.readInt());
                    lista.add(c);

                }
            }catch (EOFException e){
                System.out.println("He llegado al final del fichero");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
