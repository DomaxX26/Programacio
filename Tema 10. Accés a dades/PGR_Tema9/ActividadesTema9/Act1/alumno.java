package Act1;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.protocol.Resultset;

public class alumno {
	int NIA, telefono;
	String nombre, apellido, nacimiento, email;
	
	public alumno() {
		
	}
	/*
	public boolean guardar() {
		Connection con;

		ConexionBD bd = new ConexionBD();
		if (NIA != null) {
			// update
			PreparedStatement ps = con.prepareStatement("UPDATE alumno SET nombre='Pepe' WHERE NIA='1231415'");
			return true;
		}else {
			// insert
			Resultset rs = bd.query();
			bd.close();
			return false;
		}
	}
	*/
	public void borrar() {
		
	}
	
	
}
