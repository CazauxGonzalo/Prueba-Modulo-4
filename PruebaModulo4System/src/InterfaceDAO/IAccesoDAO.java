package InterfaceDAO;

import java.util.List;

import cl.ggc.model.Empleado;



public interface IAccesoDAO {
	
	
	public boolean validarAcceso(String mail, String clave);
	
	public List<Empleado> listarEmployed();
	
	public int idEmpleado();

}
