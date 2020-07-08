package cl.ggc.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import InterfaceDAO.IAccesoDAO;

import cl.ggc.model.Conexion;
import cl.ggc.model.Empleado;


public class AccesoDAO implements IAccesoDAO {
	
	List<Empleado> listaEmpleados = new ArrayList<Empleado>();
    int idEmpleado;
	int cargo;
	
	@Override	
	public boolean validarAcceso(String mail, String clave) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		
		
		boolean validar = false;
			
		
		try {
			
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			
			 String sql = "SELECT * FROM empleado where mailempleado="+"'"+ mail +"'";
			 rs = stm.executeQuery(sql);
			
			 
		
			while (rs.next()) {
				
				Empleado e = new Empleado(0, null, 0, 0);			
				e.setIdEmpleado(rs.getInt(1));
				//e.setRutEmpleado(rs.getNString(2));
				e.setNombreEmpleado(rs.getNString(3));
				//e.setMailEmpleado(rs.getNString(4));
				//e.setFechaContratacion(rs.getDate(5));
				e.setEstadoEmpleado(rs.getInt(6));
				e.setCargoEmpleado(rs.getInt(7));
				//e.setClave(rs.getNString(8));
				 listaEmpleados.add(e); 
				
								
		     String claveBDD = rs.getNString(8);
		     cargo = rs.getInt(7);	
		     idEmpleado = rs.getInt(1);
		    int estado = rs.getInt(6);
		     
			 if (claveBDD.contentEquals(clave) && estado == 4) {			 				
				 
				 validar = true; 	
				 
				
				 
				 
			}
			 
			}
			
			
			 rs.close();
			 stm.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			 
			System.out.println("Error en AccesoDAO");
			e.printStackTrace();
			
		}				
		
		return validar;
	}

	
	
	
	@Override
	public List<Empleado> listarEmployed() {
		// TODO Auto-generated method stub
		return listaEmpleados;
		
		
		
	}




	
	
	@Override
	public int idEmpleado() {
		
		return idEmpleado;
		
	}




	
}
