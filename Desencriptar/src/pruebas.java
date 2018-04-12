import java.util.Stack;

public class pruebas {
    public static void main(String[] args) {
        Stack<Character> prueba= new Stack<>();
        String hola="aloh";
        String resultado="";
        for (int i = 0; i <hola.length(); i++) {
            char actual=hola.charAt(i);
            prueba.push(actual);

        }

        for (int i = 0; i <hola.length() ; i++) {
            resultado+=prueba.pop();
            System.out.println(resultado);
        }
    }
}
