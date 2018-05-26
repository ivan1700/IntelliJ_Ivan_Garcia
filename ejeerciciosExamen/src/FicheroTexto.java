import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FicheroTexto {
    public static void main(String[] args) {
        String fEntrada = "datos.txt";
        String fSalida = "salida.txt";
        //A rellenar
        List<String> n =new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fEntrada))) {
            try{
                while(true){
                    n.add(br.readLine());
                }
            }catch (EOFException e){
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
