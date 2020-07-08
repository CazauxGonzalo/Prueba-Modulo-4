package cl.ggc.model;



public class Solicitud {
	
	private int idSolicitud;
	private String fechaSolicitud;
	private String direccionSolicitud;
	private String comunaSolicitud;
	private int estadoSolicitud;
	private int estadoPagoSolicitud;
	private int idEmpleado;
	private int idCliente;
	private String fechaVisita;
	
	public Solicitud(int idSolicitud, String fechaSolicitud, String direccionSolicitud, String comunaSolicitud,
			int estadoSolicitud, int estadoPagoSolicitud, int idEmpleado, int idCliente, String fechaVisita) {
		super();
		this.idSolicitud = idSolicitud;
		this.fechaSolicitud = fechaSolicitud;
		this.direccionSolicitud = direccionSolicitud;
		this.comunaSolicitud = comunaSolicitud;
		this.estadoSolicitud = estadoSolicitud;
		this.estadoPagoSolicitud = estadoPagoSolicitud;
		this.idEmpleado = idEmpleado;
		this.idCliente = idCliente;
		this.fechaVisita = fechaVisita;
	}
	
	
	public int getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public String getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(String fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public String getDireccionSolicitud() {
		return direccionSolicitud;
	}
	public void setDireccionSolicitud(String direccionSolicitud) {
		this.direccionSolicitud = direccionSolicitud;
	}
	public String getComunaSolicitud() {
		return comunaSolicitud;
	}
	public void setComunaSolicitud(String comunaSolicitud) {
		this.comunaSolicitud = comunaSolicitud;
	}
	public int getEstadoSolicitud() {
		return estadoSolicitud;
	}
	public void setEstadoSolicitud(int estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}
	public int getEstadoPagoSolicitud() {
		return estadoPagoSolicitud;
	}
	public void setEstadoPagoSolicitud(int estadoPagoSolicitud) {
		this.estadoPagoSolicitud = estadoPagoSolicitud;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getFechaVisita() {
		return fechaVisita;
	}
	public void setFechaVisita(String fechaVisita) {
		this.fechaVisita = fechaVisita;
	}
	
}
