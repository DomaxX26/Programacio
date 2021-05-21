import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Alumnos {

	private ArrayList<Alumnos> al = new ArrayList<>();
	int NIA;
	String nombre;
	String apellido;
	String correo;
	int telefono;
	

	
	public Alumnos(){

	}

	public void llistarAlumnes() throws SQLException {

		ConectaBD con = new ConectaBD();
		String strQuery = "SELECT * FROM Alumnes";
		ResultSet rs = con.ExecutarSQL(strQuery);

		while(rs.next()) {
			Alumnos a = new Alumnos();
			a.NIA = rs.getInt("nia");
			a.nombre = rs.getString("Nom");
			a.apellido = rs.getString("Cognom");
			a.correo = rs.getString("Correu");
			a.telefono = rs.getInt("Telefon");
			al.add(a);
		}

	}

	public void mostrar() {

		Iterator<Alumnos> iter;
		iter = al.iterator();
		while(iter.hasNext()) {
			Alumnos a = iter.next();
			System.out.println(a.toString(a));
		}
	}

	public ArrayList<Alumnos> listaAlumnos() {
		return al;
	}
	
	public String toString(Alumnos a) {
		return a.NIA + " " + a.nombre + " " + a.apellido + " " + a.correo + " " + a.telefono;
	}
}
