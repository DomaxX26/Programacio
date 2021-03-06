import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.sql.*;

public class ConectaBD {


	 private Connection con;
	    private Statement stat;

	    public ConectaBD () {
	        try {
	            // 1. Establim la connexió amb la base de dades.
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ies", "root", "");

	            // 2. Creem l'objecte Statement.
	            stat = con.createStatement();

	        } catch (Exception e) {
	            System.out.println("Error Accés BD");
	        }
	  }
	    
	    public ResultSet ExecutarSQL (String strQuery) {
	        ResultSet rs = null;

	        if ( strQuery == null )
	            return null;
	        try {
	            rs = stat.executeQuery(strQuery);
	        } catch (Exception e) {
	            System.out.println("Error executant SQL");
	        }
	        return rs;
	        }

}	

