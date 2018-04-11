import java.util.ArrayDeque;
import java.util.Deque;

public class Principal  {
    public static void main(String[] args) {
        Deque<Character> aDesencriptar = new ArrayDeque<>();
        String fraseADesencriptar="Olimpia(ad) de I(rofn)mática";
        boolean introducirAPila=false;

        for (int i = 0; i <fraseADesencriptar.length() ; i++) {
            char actual=fraseADesencriptar.charAt(i);
            if(actual=='('){
                introducirAPila=true;
            }else if(actual==')'){
                introducirAPila=false;
            }
            if(introducirAPila==true){
                if(actual!='('){
                    aDesencriptar.add(actual);
                }
            }

        }
        System.out.println(aDesencriptar);
        System.out.println(fraseADesencriptar);
    }
}
