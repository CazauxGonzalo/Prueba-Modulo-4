package InterfaceDAO;

import java.sql.Date;
import java.util.List;


import cl.ggc.model.Solicitud;

public interface ISolicitudDAO {
	
	public List<Solicitud> listaPorEstado(String estado);
	
	public List<Solicitud> calendarioFuturoAct(String rut);

	public List<Solicitud> listaPorCobrar(String pago);
	
	public List<Solicitud> reporteVisitas(Date desde, Date hasta);
	
	public boolean crearSolicitud(Solicitud solicitud);
	
	public List<Solicitud> listaSolicitudes();
	
	public  List<Solicitud> listarId(int id);
	
	public boolean actualizarEstado(int idSolicitud, int newEstado);
	
	
}
