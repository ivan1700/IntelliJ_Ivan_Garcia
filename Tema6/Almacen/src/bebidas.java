public abstract class bebidas {
    private final int ID;
    private int litros;
    private int precio;
    private final String marca;

    public bebidas(int ID,int litros,int precio,String marca){
        this.ID=ID;
        this.litros=litros;
        this.precio=precio;
        this.marca=marca;
    }

    public int getID(){
        return ID;
    }

    public int getLitros(){
        return litros;
    }

    public void setLitros(int litros){
        this.litros=litros;
    }

    public int getPrecio(){
        return precio;
    }

    public void setPrecio(int precio){
        this.precio=precio;
    }

    public String getMarca(){
        return marca;
    }

    public String salidaDatos(){
        String salida="El ID es "+ getID() +" tiene "+getLitros()+" Litros. Su precio es "+getPrecio()+ " Y su marca es: "+getMarca();
        return salida;
    }


}
