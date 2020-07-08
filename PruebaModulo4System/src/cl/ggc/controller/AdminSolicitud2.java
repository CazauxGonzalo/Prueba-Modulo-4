package cl.ggc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.ggc.DAO.SolicitudDAO;

import cl.ggc.model.Solicitud;

/**
 * Servlet implementation class AdminSolicitud2
 */
@WebServlet("/AdminSolicitud2")
public class AdminSolicitud2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSolicitud2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String dato = request.getParameter("solicitud");
		
		
		try {
			
		
		
		if (dato.contentEquals("crear")) {
			
			String fechaSolicitud = request.getParameter("fechaSolicitud");
			String direccion = request.getParameter("direccionSolicitud");
			String comuna = request.getParameter("comunaSolicitud");
			int estadoSolicitud = Integer.parseInt(request.getParameter("estadoSolicitud"));
			int estadoPago = Integer.parseInt(request.getParameter("estadoPago"));
			int idEmpleado = Integer.parseInt(request.getParameter("idEmpleado"));
			int idCliente = Integer.parseInt(request.getParameter("idCliente"));
			String fechaVisita = request.getParameter("fechaVisita");
			String hora = request.getParameter("hora");
			String minuto = request.getParameter("minutos");
			
			String visitaDate = "TO_DATE('"+ fechaVisita + " " + hora +":"+ minuto +":"+"00','DD-MM-YYYY HH:MI:SS')";
			
			System.out.println("punto 1");
			System.out.println(visitaDate);
			System.out.println(idCliente);
			
            Solicitud solicitud = new Solicitud(0, fechaSolicitud ,direccion , comuna, estadoSolicitud, estadoPago, idEmpleado, idCliente, visitaDate);
			
			SolicitudDAO solicituddao = new SolicitudDAO();
			boolean agregar = solicituddao.crearSolicitud(solicitud);
			
			
			if (agregar) {
				
				request.getRequestDispatcher("Confirmacion.jsp").forward(request,response);
				
			}
			
			
			
			
		} else {

			if (dato.contentEquals("listartodos")) {
				
				SolicitudDAO sdao = new SolicitudDAO();
				List<Solicitud> lSolicitud = new ArrayList<Solicitud>();
				
				lSolicitud = sdao.listaSolicitudes();
				
				request.setAttribute("listadoSolicitudes", lSolicitud);
				
				request.getRequestDispatcher("ListarSolicitud.jsp").forward(request,response);
				
				
				
				
			} else {
				
				
					if (dato.contentEquals("misSolicitudes")) {
						
					
					
					HttpSession session = request.getSession();
					
					
					
					int idempleado = (int) session.getAttribute("idEmpleado");
					
					 
					
					
					 List<Solicitud> lMiSolicitud = new ArrayList<Solicitud>();
					
					SolicitudDAO sdao = new SolicitudDAO();
					
					
					lMiSolicitud = sdao.listarId(idempleado);
					
					
						
					if(lMiSolicitud != null){
						
						 
						request.setAttribute("miSolicitudes",lMiSolicitud);
						
					    request.getRequestDispatcher("MisSolicitudes.jsp").forward(request, response);
					
						

			         	}
					
					
					
		        }else {
		        	
		        	if (dato.contentEquals("finalizaSolicitud")) {
						
		        		int idSolicitud = Integer.parseInt(request.getParameter("actualizarEstado"));
		        		System.out.println(idSolicitud);
		        		
		        		SolicitudDAO solicituddao = new SolicitudDAO();
		        		System.out.println("caso1");
		        		boolean respuesta = solicituddao.actualizarEstado(idSolicitud, 2);
		        		System.out.println("caso2");
		        		if (respuesta) {		        			
		        			
		        			request.getRequestDispatcher("Confirmacion.jsp").forward(request,response);
							
						}else {
							
							request.getRequestDispatcher("Error.jsp").forward(request,response);
							
						}
		        		
		        		
					}
		        	
		        	
		        }			
					
					
				
				
				
			
			
			
			
		}
		}
		
		} catch (Exception e) {
			// TODO: handle exception
			request.getRequestDispatcher("Error.jsp").forward(request,response);
			e.printStackTrace();
			
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
