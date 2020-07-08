package cl.ggc.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import InterfaceDAO.ISolicitudDAO;

import cl.ggc.model.Conexion;
import cl.ggc.model.Solicitud;

public class SolicitudDAO implements ISolicitudDAO {
	
	
	
	Connection conn = null;
	Statement stm = null;
	ResultSet rs = null;

	@Override
	public List<Solicitud> listaPorEstado(String estado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitud> calendarioFuturoAct(String rut) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitud> listaPorCobrar(String pago) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitud> reporteVisitas(Date desde, Date hasta) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean crearSolicitud(Solicitud solicitud) {
		
boolean registrar = false;
		
		String sql = "INSERT INTO solicitud VALUES(idSolicitud.nextval,'"+ solicitud.getFechaSolicitud()  +"','"+ solicitud.getDireccionSolicitud() +"','"+ solicitud.getComunaSolicitud()    +"','"+ solicitud.getEstadoSolicitud()  +"','"+ solicitud.getEstadoPagoSolicitud() +"','"+ solicitud.getIdEmpleado() +"','"+ solicitud.getIdCliente() +"',"+ solicitud.getFechaVisita() +")";
		
		
		try {
			
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			 stm.execute(sql);
             registrar = true;
             stm.close();
             		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("error registrar solicitud");
		}
			
		return registrar;
	}

	@Override
	public List<Solicitud> listaSolicitudes() {
		
		List<Solicitud> listaSolicitudes = new ArrayList<Solicitud>();
		
		 try{		 		 		 
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			 rs = stm.executeQuery("SELECT * FROM solicitud ORDER BY FECHASOLIC");
			 
			 
			while (rs.next()) {
				Solicitud s = new Solicitud(0, null, null, null, 0, 0, 0, 0, null);
				s.setIdSolicitud(rs.getInt(1));
				s.setFechaSolicitud(rs.getNString(2));
				s.setDireccionSolicitud(rs.getString(3));
				s.setComunaSolicitud(rs.getNString(4));				
				s.setEstadoSolicitud(rs.getInt(5));
				s.setEstadoPagoSolicitud(rs.getInt(6));
				s.setIdEmpleado(rs.getInt(7));
				s.setIdCliente(rs.getInt(8));
				s.setFechaVisita(rs.getNString(9));
				listaSolicitudes.add(s);
				
			}
			 
			stm.close();
			rs.close();
			
			
			
			 }catch(Exception e){
			 System.out.println("Error en listar Solicitudes");
			 e.printStackTrace();
			 return null;
			 }
		
		 return listaSolicitudes;
		
		
		
	}

	
	
	@Override
	public List<Solicitud> listarId(int id) {
		
				
		List<Solicitud> misSolicitudes = new ArrayList<Solicitud>();
		
		try {
			
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			 rs = stm.executeQuery("SELECT * FROM solicitud WHERE empleado_idempleado="+ id +" AND estadosol_idestadosol=1 ORDER BY fechavisita" );
			
			 
			 
			 while (rs.next()) {
					Solicitud miSol = new Solicitud(0, null, null, null, 0, 0, 0, 0, null);
					miSol.setIdSolicitud(rs.getInt(1));
					miSol.setFechaSolicitud(rs.getNString(2));
					miSol.setDireccionSolicitud(rs.getString(3));
					miSol.setComunaSolicitud(rs.getNString(4));					
					miSol.setEstadoSolicitud(rs.getInt(5));
					miSol.setEstadoPagoSolicitud(rs.getInt(6));
					miSol.setIdEmpleado(rs.getInt(7));
					miSol.setIdCliente(rs.getInt(8));
					miSol.setFechaVisita(rs.getNString(9));
					misSolicitudes.add(miSol);
					
				}
			 
			 stm.close();
			 rs.close();
			
			 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return misSolicitudes;
		
		
	}

	@Override
	public boolean actualizarEstado(int idSolicitud, int newEstado) {
	 
		
		boolean registrar = false;
		
		try {
			
			 String sql = "UPDATE solicitud SET estadosol_idestadosol="+ newEstado + "where idsolicitud="+idSolicitud;
			 conn = Conexion.conectar();		 
			 stm = conn.createStatement();
			 stm.execute(sql);
             registrar = true;
             stm.close();
			
			
		} catch (Exception e) {
			System.out.println("Error en actualizar estado");
			e.printStackTrace();
		}
		
		
		
		return registrar;
	}

	

}
