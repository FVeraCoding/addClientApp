
package logica;

import java.util.List;
import java.util.ArrayList;


public class ListaClientes {
    private static List<Cliente> listaClientes = new ArrayList<>();
    
    public static void addCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    
    
    
}
