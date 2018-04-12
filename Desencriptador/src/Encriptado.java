import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Encriptado
 * Author:Ivan Garcia Belen
 * Version: 1.0
 */
public class Encriptado {

    private final String frase;

    public Encriptado(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return this.frase;
    }

    /**
     * Comprueba si la frase esta encriptada y que los caracteres '(' y ')' esten bien
     * puestos
     *
     * @param e
     * @return un booleando indicando si esta bien o no.
     */
    public boolean comprobarFrase(Encriptado e) {
        boolean esDesencriptable = false;
        try {

            Stack<Character> pila = new Stack<>();
            boolean pilaUsada = false;
            for (int i = 0; i < e.getFrase().length(); i++) {
                switch (e.getFrase().charAt(i)) {
                    case '(':
                        pila.push('*');
                        pilaUsada = true;
                        break;
                    case ')':
                        pila.pop();
                }


            }
            if (!pila.isEmpty()) {
                System.out.println("La frase NO está bien encriptada (No se cierra un " +
                        "parentesis)");
                return esDesencriptable = false;

            } else if (!pilaUsada) {
                System.out.println("La frase NO está encriptada");
                return esDesencriptable = false;
            } else {
                System.out.println("La frase está bien encriptada");
                return esDesencriptable = true;
            }
        } catch (EmptyStackException ese) {
            System.out.println("La frase NO está bien encriptada (Se cierra un " +
                    "parentesis sin abrirlo");
        }
        return esDesencriptable;
    }

    /**
     * Desencripta el mensaje quitandole los '(' y ')'
     * pero primero comprueba a traves del metodo comprobarFrase si está bien formada.
     *
     * @param e
     * @return Un String con la frase ya desencriptada.
     */
    public String desencriptarFrase(Encriptado e) {
        if (comprobarFrase(e) != true) return "No es posible desencriptar.";
        String salida = "";
        Stack<Character> pila = new Stack<>();
        boolean introducirAPila = false;
        int caracteresEnPila = 0;

        for (int i = 0; i < e.getFrase().length(); i++) {
            char actual = e.getFrase().charAt(i);

            if (actual != '(' && introducirAPila != true) {
                salida += actual;
            }

            if (actual == '(') {
                introducirAPila = true;
            } else if (actual == ')') {
                introducirAPila = false;
            }

            if (introducirAPila == true) {
                if (actual != '(') {
                    pila.push(actual);
                    caracteresEnPila++;
                }
            }

            if (actual == ')') {
                for (int j = 0; j < caracteresEnPila; j++) {
                    salida += pila.pop();
                }
                caracteresEnPila = 0;
            }

        }

        return salida;
    }

}
