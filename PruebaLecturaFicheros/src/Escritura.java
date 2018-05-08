import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
    public static void main(String[] args) {
        String frase = "Hola que tal?";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("prueba.txt"));){
            for (int i = 0; i <10 ; i++) {
                bw.write(frase+" "+i);
                bw.newLine();
            }

    } catch (IOException e) {
            e.printStackTrace();
        }

    }}
