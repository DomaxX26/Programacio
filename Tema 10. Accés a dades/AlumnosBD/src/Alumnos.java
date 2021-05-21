import java.sql.*;
import javax.sql.*;

public class Alumnos {

	int NIA;
	String nombre;
	String apellido;
	String correo;
	int telefono;
	
	ConectaBD con;
	
	public Alumnos() {
//		String strQuery;
//		
//		try {
//			con = new ConectaBD();
//			strQuery = ("SELECT * FROM Alumnes");
//			ResultSet rs = con.ExecutarSQL(strQuery);
//			
//			if(rs.next()) {
//				this.NIA = rs.getInt("NIA");
//				this.nombre = rs.getString("NOM");
//			}
//			
//		}catch (Exception e) {
//			System.out.println("Error");
//		}
	}
	
	public String toString(Alumnos a) {
		return a.NIA + " " + a.nombre + " " + a.apellido + " " + a.correo;
	}
}
