public class mineral extends bebidas {
    private final String procedencia;
    public mineral(int ID,int litros, int precio,String marca,String procedencia){
        super(ID,litros,precio,marca);
        this.procedencia=procedencia;
    }
    public String getProcedencia(){
        return procedencia;
    }

}
