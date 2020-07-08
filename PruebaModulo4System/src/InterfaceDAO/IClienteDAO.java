package InterfaceDAO;

import java.util.*;

import cl.ggc.model.Cliente;

public interface IClienteDAO {
	
	
	public boolean crearCliente(Cliente customer);
	public List<Cliente> listarCustumer();
	public boolean actualizarCliente(Cliente cliente);
	public  List<Cliente> listarRut(String rut);
}
