package cl.ggc.model;

public class Cliente {
	
	private int idCliente;
	private String rutCliente;
	private String nombreCliente;
	private String direccionCliente;
	private String comunaCliente;
	private String actividadEconomica;
	private String contactoCliente;
	private String mailContactoCliente;
	
	public Cliente(int idCliente, String rutCliente, String nombreCliente, String direccionCliente,
			String comunaCliente, String actividadEconomica, String contactoCliente, String mailContactoCliente) {
		super();
		this.idCliente = idCliente;
		this.rutCliente = rutCliente;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		this.comunaCliente = comunaCliente;
		this.actividadEconomica = actividadEconomica;
		this.contactoCliente = contactoCliente;
		this.mailContactoCliente = mailContactoCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String getComunaCliente() {
		return comunaCliente;
	}

	public void setComunaCliente(String comunaCliente) {
		this.comunaCliente = comunaCliente;
	}

	public String getActividadEconomica() {
		return actividadEconomica;
	}

	public void setActividadEconomica(String actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}

	public String getContactoCliente() {
		return contactoCliente;
	}

	public void setContactoCliente(String contactoCliente) {
		this.contactoCliente = contactoCliente;
	}

	public String getMailContactoCliente() {
		return mailContactoCliente;
	}

	public void setMailContactoCliente(String mailContactoCliente) {
		this.mailContactoCliente = mailContactoCliente;
	}
	
	
	
	

}
