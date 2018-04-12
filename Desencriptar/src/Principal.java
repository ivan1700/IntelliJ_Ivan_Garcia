import java.util.ArrayDeque;
import java.util.Deque;

public class Principal  {
    public static void main(String[] args) {
        Deque<Character> aDesencriptar = new ArrayDeque<>();
        String fraseADesencriptar="Olimpia(ad) de I(rofn)mática";
        boolean introducirAPila=false;
        String resultado="";
        int caracteresEnPila=0;

        for (int i = 0; i <fraseADesencriptar.length() ; i++) {
            char actual=fraseADesencriptar.charAt(i);
            if(actual!='(' && introducirAPila==false){
                resultado+=actual;
            }
            if(actual=='('){
                introducirAPila=true;
            }else if(actual==')'){
                introducirAPila=false;
            }
            if(introducirAPila==true){
                if(actual!='('){
                    aDesencriptar.push(actual);
                    caracteresEnPila++;
                }
            }
            if(actual==')'){
                for (int j = 0; j <caracteresEnPila ; j++) {
                    resultado+=aDesencriptar.pop();
                }
                caracteresEnPila=0;
            }

        }
        System.out.println(aDesencriptar);
        System.out.println(resultado);
        System.out.println(fraseADesencriptar);
    }
}
