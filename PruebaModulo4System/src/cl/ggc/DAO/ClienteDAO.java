package cl.ggc.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import InterfaceDAO.IClienteDAO;
import cl.ggc.model.Cliente;
import cl.ggc.model.Conexion;

public class ClienteDAO implements IClienteDAO {

	Connection conn = null;
	Statement stm = null;
	ResultSet rs = null;
	
	
	@Override
	public boolean crearCliente(Cliente customer) {
		// TODO Auto-generated method stub
		
		boolean registrar = false;
		
		String sql = "INSERT INTO cliente VALUES(idCliente.nextval,'"+ customer.getRutCliente()  +"','"+ customer.getNombreCliente() +"','"+ customer.getDireccionCliente()    +"','"+ customer.getComunaCliente()  +"','"+ customer.getActividadEconomica()  +"','"+ customer.getContactoCliente() +"','"+ customer.getMailContactoCliente() +"')";
		
		try {
			
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			 stm.execute(sql);
             registrar = true;
             stm.close();
             		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("error registrar cliente");
		}
		
		
		return registrar;
	}

	@Override
	public List<Cliente> listarCustumer() {
		// TODO Auto-generated method stub

		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		 try{		 		 		 
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			 rs = stm.executeQuery("SELECT * FROM cliente ORDER BY IDCLIENTE");
			 
			 
			while (rs.next()) {
				Cliente c = new Cliente(0, null, null, null, null, null, null, null);
				c.setIdCliente(rs.getInt(1));
				c.setRutCliente(rs.getString(2));
				c.setNombreCliente(rs.getNString(3));
				c.setDireccionCliente(rs.getNString(4));
				c.setComunaCliente(rs.getNString(5));
				c.setActividadEconomica(rs.getNString(6));
				c.setContactoCliente(rs.getNString(7));
				c.setMailContactoCliente(rs.getNString(8));
				listaClientes.add(c);
				
			}
			 
			stm.close();
			rs.close();
			
			
			
			 }catch(Exception e){
			 System.out.println("Error en listarCustumer()");
			 e.printStackTrace();
			 return null;
			 }
		
		 return listaClientes;
		
		
		
	}

	@Override
	public boolean actualizarCliente(Cliente customer) {
	
	boolean registrar = false;
		
		try {
			
			 String sql = "UPDATE cliente SET nombrecliente='"+ customer.getNombreCliente() +"',direccioncliente='"+ customer.getDireccionCliente()    +"',comunacliente='"+ customer.getComunaCliente()  +"',actividadeconomica='"+ customer.getActividadEconomica()  +"',nombrecontacto='"+ customer.getContactoCliente() +"',mailcontacto='"+ customer.getMailContactoCliente() +"'"+"where idcliente="+customer.getIdCliente();
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			 stm.execute(sql);
             registrar = true;
             stm.close();
			
			
		} catch (Exception e) {
			System.out.println("Error en actualizar cliente");
			e.printStackTrace();
		}
		
		
		
		return registrar;
	}

		
		
		
		
		

	@Override
	public List<Cliente> listarRut(String rut) {
		// TODO Auto-generated method stub
		
		
		try {
			
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			 rs = stm.executeQuery("SELECT * FROM cliente WHERE rutcliente="+"'"+ rut +"'");
			
			 List<Cliente> listaClientes = new ArrayList<Cliente>();
			 
			 
			 while (rs.next()) {
					Cliente c = new Cliente(0, null, null, null, null, null, null, null);
					c.setIdCliente(rs.getInt(1));
					c.setRutCliente(rs.getString(2));
					c.setNombreCliente(rs.getNString(3));
					c.setDireccionCliente(rs.getNString(4));
					c.setComunaCliente(rs.getNString(5));
					c.setActividadEconomica(rs.getNString(6));
					c.setContactoCliente(rs.getNString(7));
					c.setMailContactoCliente(rs.getNString(8));
					listaClientes.add(c);
					
					String rutt = rs.getString(2);
					System.out.println(rutt);
				}
				 
				stm.close();
				rs.close();
					
				 return listaClientes;
				 				 
				 
				
			 
			 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return null;
	}

	

	
	

}
