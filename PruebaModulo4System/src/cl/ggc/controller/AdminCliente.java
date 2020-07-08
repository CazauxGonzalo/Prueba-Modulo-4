package cl.ggc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.ggc.DAO.ClienteDAO;
import cl.ggc.model.Cliente;

/**
 * Servlet implementation class AdminCliente
 */
@WebServlet("/AdminCliente")
public class AdminCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String dato = request.getParameter("cliente");
		
		if (dato.contentEquals("listartodos")) {
			
		try {
			
			ClienteDAO cdao = new ClienteDAO();
			List<Cliente> lclientes = new ArrayList<Cliente>();
			
			lclientes = cdao.listarCustumer();
			
			request.setAttribute("listadoClientes", lclientes);
			
			request.getRequestDispatcher("ListadoClienteRut.jsp").forward(request,response);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.getRequestDispatcher("Error.jsp").forward(request,response);
			
		}				
		
		
		}else {
		
		
		if (dato.contentEquals("registrar")) {
			
			String rut = request.getParameter("rutCliente");
			String nombre = request.getParameter("nombreCliente");
			String direccion = request.getParameter("direccionCliente");
			String comuna = request.getParameter("comunaCliente");
			String actividad = request.getParameter("actividadCliente");
			String contacto = request.getParameter("contactoCliente");
			String mail = request.getParameter("mailCliente");
			
			
			Cliente clientes = new Cliente(0, rut, nombre, direccion, comuna, actividad, contacto, mail);
			
			ClienteDAO clientedao = new ClienteDAO();
			boolean agregar = clientedao.crearCliente(clientes);
			
			if (agregar) {
				
				request.getRequestDispatcher("Confirmacion.jsp").forward(request,response);
				
			}
		}else {
				
				if (dato.contentEquals("buscarRutCliente")) {
					
					
					
					String rutCliente = request.getParameter("rutCliente");
					String pageCliente = request.getParameter("clienteActualizar");
					
					List<Cliente> listaClientes = new ArrayList<Cliente>();
					
					ClienteDAO cdaoListaRut = new ClienteDAO();
							
					listaClientes = cdaoListaRut.listarRut(rutCliente);
					
					if(listaClientes != null){					
											
						if (pageCliente.contentEquals("ClienteBuscarlistar")){
					    	 request.setAttribute("listadoClientes",listaClientes);
					    	 
						    request.getRequestDispatcher("ListadoClienteRut.jsp").forward(request, response);
						  }else {
							  
							  if (pageCliente.contentEquals("solicitudCliente")) {
								  
								  request.setAttribute("datoscliente",listaClientes);
								 
								  request.getRequestDispatcher("CrearSolicitud.jsp").forward(request, response);
								  
							}else {
							  if (pageCliente.contentEquals("ClienteBuscarActualizar")) {
																					  
							    request.setAttribute("list",listaClientes);
							    
							    request.getRequestDispatcher("ActualizarCliente2.jsp").forward(request, response);
							
							  }else {
								  
								  
							  }
							  
							} 							  
						  }
					  
						  }else {
							  
							  
						  }
					
					}else {
						
						
						if(dato.contentEquals("actualizar")){
							
						int idCliente = Integer.parseInt(request.getParameter("idCliente"));
						String nombreCliente =  request.getParameter("nombreCliente");
						String direccionCliente =  request.getParameter("direccionCliente");	
						String comunaCliente =  request.getParameter("comunaCliente");
						String actividadCliente =  request.getParameter("actividadCliente");
						String contactoCliente =  request.getParameter("contactoCliente");
						String mailCliente =  request.getParameter("mailCliente");
						
						
						Cliente clienteActualizar = new Cliente(idCliente, null, nombreCliente, direccionCliente, comunaCliente, actividadCliente, contactoCliente, mailCliente);
						
						ClienteDAO clienteDao = new ClienteDAO();
						
						boolean actualizar = clienteDao.actualizarCliente(clienteActualizar);
						
						
						if (actualizar) {
							
							request.getRequestDispatcher("Confirmacion.jsp").forward(request,response);
							
							
						}else {
							
							request.getRequestDispatcher("Error.jsp").forward(request,response);
							
						}
						
						
						}
						
						
						
						
				}
			}
		
	}
		
		
		
		
		 
	}	
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
