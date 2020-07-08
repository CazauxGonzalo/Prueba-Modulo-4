package cl.ggc.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.ggc.DAO.AccesoDAO;
import cl.ggc.model.Empleado;


/**
 * Servlet implementation class AdminAcceso
 */
@WebServlet("/AdminAcceso")
public class AdminAcceso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminAcceso() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String email = request.getParameter("mail");
		String clave = request.getParameter("clave");
		
			
		
		AccesoDAO accesoDao = new AccesoDAO();
		
		boolean acceso = accesoDao.validarAcceso(email,clave);
		
		
		if (acceso) {
			
			List<Empleado> listlogin = accesoDao.listarEmployed();
						
			HttpSession session = request.getSession();
			session.setAttribute("sessionLogin", listlogin);
		
			int idEmpleado = accesoDao.idEmpleado();
	        
			session.setAttribute("idEmpleado", idEmpleado);
			
	        request.getRequestDispatcher("NavAdm.jsp").forward(request,response);
	        
		
			
			
		}else {
						
			
			request.getRequestDispatcher("Intranet.jsp").forward(request,response);
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
