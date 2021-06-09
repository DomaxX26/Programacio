package Act1;

import java.sql.*;
import javax.sql.*;

public class ConexionBD {
	private Connection con;
	private Statement stat;

	public ConexionBD() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Miau");

			con = DriverManager.getConnection("jdbc:mysql://localhost:4000/IES", "root", "secret");
			
			System.out.println("Conectado con BD");
			//stat = con.createStatement();
		} catch (Exception e) {
			System.out.println("Error de acceso a BD");
		}
	}
/*
	public ResultSet EjecutarSQL(String strQuery) {
		ResultSet rs = null;
		alumno a = new alumno();
		//if (strQuery == null) {
			//return null;
		try {
			System.out.println("Miau3");
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM alumnos");
			rs = stat.executeQuery(strQuery);
			while (rs.next()) {
				System.out.println(rs.getString(a.NIA));
			}
		} catch (Exception e) {
			System.out.println("Error ejecutando SQL");
		}
		return rs;
	}*/
}
