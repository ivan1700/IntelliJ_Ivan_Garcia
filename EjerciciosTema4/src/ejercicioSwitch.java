import javax.swing.*;
import java.util.Scanner;

public class ejercicioSwitch {
    public static void main(String[] args) {
        char a = 'g';
        switch(a){
            case 'g':
                a++;
                default:
                    if (a<'g')
                        a--;
                    else
                        a='m';
                    System.out.println(a);
        }
    }
}
