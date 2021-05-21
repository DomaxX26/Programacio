import java.util.*;
import java.io.*;

public class Agenda {
    private Scanner scan = new Scanner(System.in);
    private String [] Menu = new String[4];
    ArrayList llista;

    public Agenda() {
        llista = new ArrayList();
        carregarUsuari();
    }

    public Usuaris altaUsuari(){
        Usuaris usuaris = new Usuaris();
        Scanner scanner = new Scanner(System.in);
       System.out.println("--------REGISTRAR-SE--------");
        System.out.print("Nom: ");
        usuaris.nom = scanner.nextLine();

        System.out.print("Cognom 1: ");
        usuaris.cognom1 = scanner.nextLine();

        System.out.print("Cognom 2: ");
        usuaris.cognom2 = scanner.nextLine();

        System.out.print("Correu Electronic: ");
        usuaris.correu = scanner.nextLine();

        System.out.print("Contrasenya: ");
        usuaris.contrasenya = scanner.nextLine();

        getUsuaris();
        return usuaris;
    }
    public void nouUsuari(Usuaris usuari){
        this.llista.add(usuari);
    }

    public ArrayList<Usuaris> getUsuaris(){
        return this.llista;
    }
    //C:/Users/DomaxX26/IdeaProjects/Netflix/src/UsuarisCredencials.txt
    private void carregarUsuari(){
        try {
            File fClients = new File("C:/Users/DomaxX26/IdeaProjects/Netflix/src/UsuarisCredencials.txt");
            Scanner lector = new Scanner(fClients);
            while (lector.hasNextLine()) {
                String srtLine = lector.nextLine();
                Usuaris u = new Usuaris(srtLine);
                nouUsuari(u);
            }
        }
        catch (FileNotFoundException e ) {
            System.out.println("Hi ha un error");
        }
    }
}

