package cl.ggc.model;

import java.sql.*;


public class Conexion {
	
	private static Connection jdbcConnection = null;
	private String driver;
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	
	private Conexion() {
				
		driver = "oracle.jdbc.driver.OracleDriver";
		jdbcURL ="jdbc:oracle:thin:@localhost:1521:xe";
		jdbcUsername ="Gonzalo";
		jdbcPassword ="04210421ggc";
		
		try {
			Class.forName(driver);
			jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);	
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error en la conexion...");
			e.printStackTrace();
		}
		
	}	
	
	public static Connection conectar() {
		
		
			if (jdbcConnection == null) {
				new Conexion();
			}
					
		return jdbcConnection;		
	}

}
