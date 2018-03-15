public class collatz {
    public static void main(String[] args) {
        int numeroIntroducido = 20;

        do {
            if(numeroIntroducido%2==0){
                numeroIntroducido=numeroIntroducido/2;

            }
            else if(numeroIntroducido%2==1){
                numeroIntroducido=(numeroIntroducido*3)+1;
            }
            System.out.println(numeroIntroducido);
        } while (numeroIntroducido != 1);

    }
}