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
import cl.ggc.DAO.EmpleadoDAO;
import cl.ggc.model.Cliente;
import cl.ggc.model.Empleado;

/**
 * Servlet implementation class AdminSolicitud
 */
@WebServlet("/AdminSolicitud")
public class AdminSolicitud extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSolicitud() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ClienteDAO cdao = new ClienteDAO();
		List<Cliente> lclientes = new ArrayList<Cliente>();
		
		lclientes = cdao.listarCustumer();
		
		request.setAttribute("listadoClientes", lclientes);
		
		EmpleadoDAO edao = new EmpleadoDAO();
		List<Empleado> lempleado = new ArrayList<Empleado>();
		
		lempleado = edao.listaEmpleados();
		
		request.setAttribute("listadoEmpleado", lempleado);
		
		request.getRequestDispatcher("CrearSolicitud.jsp").forward(request,response);
		
			
		
		
	}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
		
		
	}

}
