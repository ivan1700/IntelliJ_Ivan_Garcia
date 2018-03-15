public enum numeroRondas {
    CUATRO_RONDAS(4),
    OCHO_RONDAS(8);

    private final int numero;

    numeroRondas(int numero){
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }
}
