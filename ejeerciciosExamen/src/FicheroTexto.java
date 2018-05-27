import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FicheroTexto {
    public static void main(String[] args) {
        String fEntrada = "datos.txt";
        String fSalida = "salida.txt";
        //A rellenar
        List<String> n =new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fEntrada))) {
            try{
                String numero="";
                while((numero=br.readLine())!=null){
                    n.add(numero);
                }
            }catch (EOFException e){
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(n);
        Collections.sort(n);
        int posicion=n.size();
        List<String>o=new ArrayList<>();
        System.out.println(n.size());
        try(DataOutputStream dos= new DataOutputStream(new FileOutputStream(fSalida))) {
            for (int i = 0; i <2 ; i++) {
                dos.writeUTF(n.get(posicion-1-i));
                System.out.println(n.get(posicion - 1 - i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
