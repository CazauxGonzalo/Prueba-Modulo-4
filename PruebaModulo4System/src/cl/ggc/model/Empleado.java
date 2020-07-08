package cl.ggc.model;




public class Empleado {
	
	private int idEmpleado;
	private String rutEmpleado;
	private String nombreEmpleado;
	private String mailEmpleado;
	private String fechaContratacion;
	private int estadoEmpleado;
	private int cargoEmpleado;
	private String clave;
	
	
	
	
	
	
	
	public Empleado(int idEmpleado, int estadoEmpleado) {
		super();
		this.idEmpleado = idEmpleado;
		this.estadoEmpleado = estadoEmpleado;
	}




	public Empleado(int idEmpleado, String nombreEmpleado, int estadoEmpleado) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.estadoEmpleado = estadoEmpleado;
	}




	public Empleado(int idEmpleado, String nombreEmpleado, int estadoEmpleado, int cargoEmpleado) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.estadoEmpleado = estadoEmpleado;
		this.cargoEmpleado = cargoEmpleado;
	}




	public Empleado(int idEmpleado, String rutEmpleado, String nombreEmpleado, String mailEmpleado,
			String fechaContratacion, int estadoEmpleado, int cargoEmpleado, String clave) {
		super();
		this.idEmpleado = idEmpleado;
		this.rutEmpleado = rutEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.mailEmpleado = mailEmpleado;
		this.fechaContratacion = fechaContratacion;
		this.estadoEmpleado = estadoEmpleado;
		this.cargoEmpleado = cargoEmpleado;
		this.clave = clave;
	}


	

	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getRutEmpleado() {
		return rutEmpleado;
	}


	public void setRutEmpleado(String rutEmpleado) {
		this.rutEmpleado = rutEmpleado;
	}


	public String getNombreEmpleado() {
		return nombreEmpleado;
	}


	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}


	public String getMailEmpleado() {
		return mailEmpleado;
	}


	public void setMailEmpleado(String mailEmpleado) {
		this.mailEmpleado = mailEmpleado;
	}


	public String getFechaContratacion() {
		return fechaContratacion;
	}


	public void setFechaContratacion(String fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}


	public int getEstadoEmpleado() {
		return estadoEmpleado;
	}


	public void setEstadoEmpleado(int estadoEmpleado) {
		this.estadoEmpleado = estadoEmpleado;
	}


	public int getCargoEmpleado() {
		return cargoEmpleado;
	}


	public void setCargoEmpleado(int cargoEmpleado) {
		this.cargoEmpleado = cargoEmpleado;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	
	
	
	
}
