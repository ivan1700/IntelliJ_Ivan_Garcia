import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SemaforoVehiculo {
     int secundero=0;
    final static int TIEMPO_VERDE=5;
    final static int TIEMPO_AMARILLO=2;
    final static int TIEMPO_ROJO=5;
    private green verde;
    private yellow amarillo;
    private red rojo;
    private SemaforoPeatonal SP =new SemaforoPeatonal();

    public SemaforoVehiculo(){

        JFrame main = new JFrame("Vehiculos");
        //Frame main2 = new SemaforoPeatonal().getFrame();
        rojo = new red();
        amarillo = new yellow();
        verde = new green();
        main.add(rojo.getPanel());
        main.add(amarillo.getPanel());
        main.add(verde.getPanel());
        main.setLayout(new GridLayout(3,1));
        main.setSize(250,600);
        main.setLocation(400,100);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        verde.iluminar();
        temporizador();


    }

    public void temporizador(){
        int tiempoAmarillo=TIEMPO_VERDE+TIEMPO_AMARILLO;
        int tiempoRojo=TIEMPO_VERDE+TIEMPO_AMARILLO+TIEMPO_ROJO;
        System.out.println("TIEMPO DE VERDE: " + TIEMPO_VERDE);
        System.out.println("TIEMPO DE AMARILLO: " + tiempoAmarillo);
        System.out.println("TIEMPO DE ROJO: " + tiempoRojo);
        while(true){
            try {
                Thread.sleep(1000);
                //pasa de verde a amarillo
                if(secundero==TIEMPO_VERDE){
                    verde.apagar();
                    amarillo.iluminar();
                    //secundero=0;
                    System.out.println("Se pone amarillo");
                }
                //pasa de amarillo a rojo
                if(secundero==tiempoAmarillo){
                    amarillo.apagar();
                    rojo.iluminar();
                    SP.ponerseVerde();
                    System.out.println("Se pone rojo");
                }
                //Pasa de rojo a verde
                if(secundero==tiempoRojo){
                    SP.parpadeo();
                    rojo.apagar();
                    verde.iluminar();
                    secundero=0;
                    SP.ponerseRojo();
                    System.out.println("Se pone verde");
                }

                System.out.println(secundero);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            secundero++;
        }
    }

    public  int getSecundero(){
        return secundero;
    }

}

