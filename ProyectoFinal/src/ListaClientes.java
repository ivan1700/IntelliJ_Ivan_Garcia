import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
    List<Cliente> clientes;

    public ListaClientes(){
        clientes=new ArrayList<>();
        //Borrar esto
        AnyadirClientes();
    }

    //Metodo para practicas
    public void AnyadirClientes(){
        Cliente c0= new Cliente("Ivan Garcia","74386711L", "1111111111");
        Cliente c1= new Cliente("Miguel","1111111A","2222222222");
        Cliente c2= new Cliente("Uganda","222222B","1111111113");
        Cliente c3= new Cliente("Pochinki","3333333C","1111111114");
        clientes.add(c0);
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        System.out.println(clientes);
    }

    public List<Cliente> getClientes(){
        return clientes;
    }

}
