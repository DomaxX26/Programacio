import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Assignatures {

    private ArrayList<Assignatures> al = new ArrayList<>();
    int codic;
    String nom;
    String descripcio;
    String abreviatura;
    int hores;

    public Assignatures() {

    }

    public void llistarAssignatures() throws SQLException {

        ConectaBD con = new ConectaBD();
        String strQuery = "SELECT * FROM Assignatures";
        ResultSet rs = con.ExecutarSQL(strQuery);

        while(rs.next()) {
            Assignatures a = new Assignatures();
            a.codic = rs.getInt("codic");
            a.nom = rs.getString("Nom");
            a.descripcio = rs.getString("Descripcio");
            a.abreviatura = rs.getString("Abreviatura");
            a.hores = rs.getInt("Hores");
            al.add(a);
        }

    }

    public void mostrar() {

        Iterator<Assignatures> iter;
        iter = al.iterator();
        while(iter.hasNext()) {
            Assignatures a = iter.next();
            System.out.println(a.toString(a));
        }
    }

    public ArrayList<Assignatures> listaAssignatures() {
        return al;
    }

    public String toString(Assignatures a) {
        return a.codic + " " + a.nom + " " + a.descripcio + " " + a.abreviatura + " " + a.hores;
    }
}
