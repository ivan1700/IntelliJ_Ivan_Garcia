import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FicherosTexto {
    public static void main(String[] args) {


        //Escritura ficheros pequeños
    List<String> lista =new ArrayList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
   /*     Path path=Paths.get("datos.txt");
        Charset charset=StandardCharsets. UTF_8;
        try {
            Files.write(path,lista,charset);
        }catch (IOException e){
            System.out.println(e);
        }
*/

        //Lectura ficheros pequeños
       /* List<String> leidas = new ArrayList<>();
        try{
            leidas=Files.readAllLines(path,charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(leidas);
        */
    //Escritura de ficheros grandes
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt"))) {
            for (String s:
                 lista) {
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Lectura de Ficheros grandes
        List<String> leidos = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            try{
                String linea="";
                while((linea=br.readLine())!=null){
                    leidos.add(linea);
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
    }

}
