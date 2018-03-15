import java.util.Scanner;


public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;
    private static int relojes;
    public static char separador = ':';
    static final int TIEMPO = 60;
    static final int Horas_DIA = 24;


    public Reloj() {
        this(0, 0, 0);
    }

    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;


        relojes++;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public static char getSeparador() {
        return separador;
    }

    public void ponHora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = 0;
    }

    public void ponHora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void leeHora() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca Horas:");
        this.hora = sc.nextInt();
        System.out.println("Introduzca Minutos:");
        this.minutos = sc.nextInt();
        System.out.println("Introduzca Segundos:");
        this.segundos = sc.nextInt();

    }

    public static void cambiaSeparador(char separador) {
        Reloj.separador = separador;
    }


    public void sumaTiempo(int hora, int minutos, int segundos) {

        int segundosTotales = getSegundos() + segundos;
        int segundosSobrante = segundosTotales % TIEMPO;
        int segundosAMinuto = segundosTotales / TIEMPO;
        int minutosTotales = segundosAMinuto + getMinutos() + minutos;
        int minutosSobrantes = minutosTotales % TIEMPO;
        int minutosAHoras = minutosTotales / TIEMPO;
        int horasTotales = (minutosAHoras + hora + getHora()) % Horas_DIA;

        this.hora = horasTotales;
        this.minutos = minutosSobrantes;
        this.segundos = segundosSobrante;
    }

    public String devuelveHora() {
        String salida = " " + this.hora + getSeparador() + this.minutos + getSeparador() + this.segundos;
        return salida;
    }


    public static String totalRelojes() {
        String salida = "" + relojes;
        return salida;
    }

    public static String esValida(int hora, int minutos, int segundos) {
        String salida = hora < Horas_DIA ? (minutos < TIEMPO ? (segundos < TIEMPO ? "Es válida" : "No es válida") : "No es válida ") : "No es válida";
        return salida;
    }

}