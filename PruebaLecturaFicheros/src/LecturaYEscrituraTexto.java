import java.io.*;
public class LecturaYEscrituraTexto {
    public static void main(String[] args) {
        try{
            File fichero = new File ("prueba.txt");
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea=br.readLine())!=null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
