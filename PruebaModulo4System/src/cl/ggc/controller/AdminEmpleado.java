package cl.ggc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cl.ggc.DAO.EmpleadoDAO;

import cl.ggc.model.Empleado;

/**
 * Servlet implementation class AdminEmpleado
 */
@WebServlet("/AdminEmpleado")
public class AdminEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String dato = request.getParameter("empleado");
		
		if (dato.contentEquals("crear")) {
			
		
		
		String rutEmpl = request.getParameter("rutEmpleado");
		String nombreEmpl = request.getParameter("nombreEmpleado");
		String mailEmpl = request.getParameter("mailEmpleado");
		String fechaContratacion = request.getParameter("fechaContartacion");
		int estadoEmpl = Integer.parseInt(request.getParameter("estadoEmpl"));
		int cargoEmpl = Integer.parseInt(request.getParameter("cargoEmpl"));
		
		
		
		Empleado empleados = new Empleado(0, rutEmpl, nombreEmpl, mailEmpl, fechaContratacion, estadoEmpl, cargoEmpl, null);
		
		EmpleadoDAO emleadodao = new EmpleadoDAO();
		boolean agregar = emleadodao.crearEmpleado(empleados);
		
		if (agregar) {
			
			request.getRequestDispatcher("Confirmacion.jsp").forward(request,response);
			
		}
		
		}else {
			
			
			if (dato.contentEquals("listartodos")) {
				
				try {
					
					EmpleadoDAO edao = new EmpleadoDAO();
					List<Empleado> lempleado = new ArrayList<Empleado>();
					
					lempleado = edao.listaEmpleados();
					
					request.setAttribute("listadoEmpleado", lempleado);
					
					request.getRequestDispatcher("ListadoEmpleado.jsp").forward(request,response);
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					request.getRequestDispatcher("Error.jsp").forward(request,response);
					
				}				
				
				
				}else {
					
					if (dato.contentEquals("actualizarEstado")) {
						
						int idEmpleado = Integer.parseInt(request.getParameter("idempleado"));
						int estadoEmpleado = Integer.parseInt(request.getParameter("estadoEmpleado"));
						
						Empleado actualizarEmpleado = new Empleado(idEmpleado, estadoEmpleado);						
						
						EmpleadoDAO empDao = new EmpleadoDAO();
						
						boolean actualizarEmp = empDao.actualizarEmpleado(actualizarEmpleado);
						
                              if (actualizarEmp) {
							
							request.getRequestDispatcher("Confirmacion.jsp").forward(request,response);
							
							
						}else {
							
							request.getRequestDispatcher("Error.jsp").forward(request,response);
							
						}
						
					}else {
						if (dato.contentEquals("buscarPorRut")) {
							
							String rutEmpleado = request.getParameter("rutEmpleado");
							
							List<Empleado> empleado = new ArrayList<Empleado>();
							
							EmpleadoDAO eDao = new EmpleadoDAO();
							
							empleado = eDao.listaRut(rutEmpleado);
							
							if(empleado != null){
								
								request.setAttribute("listEmpleado",empleado);
								request.getRequestDispatcher("AdministrarEmpleado.jsp").forward(request, response);
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
