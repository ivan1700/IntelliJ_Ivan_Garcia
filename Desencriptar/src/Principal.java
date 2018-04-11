import java.util.Stack;

public class Principal  {
    public static void main(String[] args) {
        Stack<Character> aDesencriptar = new Stack<>();
        String fraseADesencriptar="Olimpia(ad) de I(rofn)mática";

        for (int i = 0; i <fraseADesencriptar.length() ; i++) {
            char actual=fraseADesencriptar.charAt(i);
            System.out.println(actual);
        }
    }
}
