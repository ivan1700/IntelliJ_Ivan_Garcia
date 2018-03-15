import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class principal {
    public static void main(String[] args) throws IOException {


        List<String> lista = Files.readAllLines(Paths.get("caracteres"));
        System.out.println(lista);
    }
}
