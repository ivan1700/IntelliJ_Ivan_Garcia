import java.io.*;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class FicheroDatos {
    //Escritura
    public static void main(String[] args) {
        List<meterGente> lista =new ArrayList<>();

        lista.add(new meterGente("ivan",1700));
        lista.add(new meterGente("hgola",1111));
        lista.add(new meterGente("fasfas",1222));
        lista.add(new meterGente("fasfsaf",1333));

        try(DataOutputStream dis = new DataOutputStream(new FileOutputStream("datos.dt"))) {
            for (meterGente g:lista
                    ) {
                dis.writeUTF(g.getNombre());
                dis.writeInt(g.getId());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Lectura
        List<meterGente>leidos =new ArrayList<>();
        try(DataInputStream dis= new DataInputStream(new FileInputStream("datos.dt"))) {
            try{
                String nombre="";
                while((nombre=dis.readUTF())!=null){
                    meterGente g= new meterGente(nombre,dis.readInt());
                    System.out.println(g);
                    leidos.add(g);
                }
            }catch (EOFException e){
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(leidos);
    }}
