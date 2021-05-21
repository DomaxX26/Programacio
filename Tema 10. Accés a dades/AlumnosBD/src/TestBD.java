import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.sql.*;

public class TestBD {

	public 	ArrayList<Alumnos> al = new ArrayList<>();
	public ConectaBD con;
	int numNIA, contador;
	
    public static void main(String[] args) throws SQLException {
        Alumnos a = new Alumnos();
        TestBD test = new TestBD();
        test.llistarAlumnes();
        test.mostrar();
    }
    
    public TestBD() {
    	
    }
    
    public void llistarAlumnes() throws SQLException {
    	
    	ConectaBD con = new ConectaBD();
    	String strQuery = "SELECT * FROM Alumnes";
    	ResultSet rs = con.ExecutarSQL(strQuery);
    	
    	while(rs.next()) {
    		Alumnos a = new Alumnos();
    		a.NIA = rs.getInt("nia");
    		a.nombre = rs.getString("Nom");
    		a.apellido = rs.getString("apellido");
    		a.correo = rs.getString("Correo");
    		a.telefono = rs.getInt("Telefono");
    	al.add(a);
    	}
 
    }
    
    public void mostrar() {
    	
    	Iterator<Alumnos> iter;
    	iter = al.iterator(); 
    	while(iter.hasNext()) {
    		Alumnos a = iter.next();
    		System.out.println(a.toString(a));
    		//a.toString(a);
    	}
    }
    
    public ArrayList<Alumnos> listaAlumnos() {
    	return al;
    }

    
}