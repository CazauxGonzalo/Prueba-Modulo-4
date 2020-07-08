package InterfaceDAO;

import java.util.List;

import cl.ggc.model.Empleado;



public interface IEmpleadoDAO {
	
	public boolean actualizarMisDatos(String rut);
	public List<Empleado> listaRut(String rut);
	public List<Empleado> listaEmpleados();
	public boolean crearEmpleado(Empleado employed);
	public boolean actualizarEmpleado(Empleado employed);
		
	
}
