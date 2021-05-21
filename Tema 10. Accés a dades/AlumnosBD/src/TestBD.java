import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.sql.*;

public class TestBD {



	
    public static void main(String[] args) throws SQLException {
        System.out.println("Alumnes");
        Alumnos a = new Alumnos();
        a.llistarAlumnes();
        a.mostrar();
        System.out.println("\nAssignatures");
        Assignatures A = new Assignatures();
        A.llistarAssignatures();
        A.mostrar();
    }
    
    public TestBD() {
    	
    }
}