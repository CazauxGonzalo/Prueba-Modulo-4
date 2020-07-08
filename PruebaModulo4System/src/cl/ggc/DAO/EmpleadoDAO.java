package cl.ggc.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import InterfaceDAO.IEmpleadoDAO;

import cl.ggc.model.Conexion;
import cl.ggc.model.Empleado;

public class EmpleadoDAO implements IEmpleadoDAO {
	
	Connection conn = null;
	Statement stm = null;
	ResultSet rs = null;

	@Override
	public boolean actualizarMisDatos(String rut) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Empleado> listaRut(String rut) {
		
				
		try {
			
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			 rs = stm.executeQuery("SELECT * FROM empleado WHERE rutempleado="+"'"+ rut +"'");
			
			 List<Empleado> listaEmpleado = new ArrayList<Empleado>();
			 
			 
			 while (rs.next()) {
					Empleado e = new Empleado(0, null, 0);
					e.setIdEmpleado(rs.getInt(1));					
					e.setNombreEmpleado(rs.getNString(3));
					e.setEstadoEmpleado(rs.getInt(6));	
					listaEmpleado.add(e);
					
					
				}
				 
				stm.close();
				rs.close();
					
				 
				 				 
				 
				return listaEmpleado;	
			 
			 
			
		} catch (Exception e) {
			// TODO: handle exception
			
			
		}
		
		
		return null;	
		
	}

	

	@Override
	public List<Empleado> listaEmpleados() {
		
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		 try{		 		 		 
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			 rs = stm.executeQuery("SELECT * FROM empleado ORDER BY IDEMPLEADO");
			 
			 
			while (rs.next()) {
				Empleado e = new Empleado(0, null, null, null, null, 0, 0, null);
				e.setIdEmpleado(rs.getInt(1));
				e.setRutEmpleado(rs.getString(2));
				e.setNombreEmpleado(rs.getNString(3));
				e.setMailEmpleado(rs.getNString(4));
				e.setFechaContratacion(rs.getNString(5));
				e.setEstadoEmpleado(rs.getInt(6));
				e.setCargoEmpleado(rs.getInt(7));
				
				listaEmpleados.add(e);
				
			}
			 
			stm.close();
			rs.close();
			
			
			
			 }catch(Exception e){
			 System.out.println("Error en listarCustumer()");
			 e.printStackTrace();
			 return null;
			 }
		
		 return listaEmpleados;
		
		
		

		
	}

	

	@Override
	public boolean actualizarEmpleado(Empleado employed) {
		
               boolean registrar = false;
		
		try {
			
			 String sql = "UPDATE empleado SET estadoemp_idestadoe="+ employed.getEstadoEmpleado() +" where idempleado="+employed.getIdEmpleado();
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			 stm.execute(sql);
             registrar = true;
             stm.close();
			
			
		} catch (Exception e) {
			System.out.println("Error en actualizar empleado");
			e.printStackTrace();
		}
		
		
		
		return registrar;
	}

	@Override
	public boolean crearEmpleado(Empleado employed) {
		
	boolean registrar = false;
		
		String sql = "INSERT INTO empleado VALUES(idempleado.nextval,'"+ employed.getRutEmpleado()  +"','"+ employed.getNombreEmpleado() +"','"+ employed.getMailEmpleado()    +"','"+ employed.getFechaContratacion()  +"','"+ employed.getEstadoEmpleado()  +"','"+ employed.getCargoEmpleado() +"','"+ employed.getClave() +"')";
		
		try {
			
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			 stm.execute(sql);
             registrar = true;
             stm.close();
             		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("error registrar empleado");
		}
		
		
		return registrar;

		
		
	}

}
