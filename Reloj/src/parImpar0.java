import javax.swing.*;

public class parImpar0 {


    public static int NUMERO_FIN = 0;

    public static String esPar(int numero) {
        String salida = numero % 2 == 0 ? " Es par " : " Es Impar ";
        return salida;
    }


}
