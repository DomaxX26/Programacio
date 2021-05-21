import java.io.*;
import java.util.*;
//https://www.geeksforgeeks.org/arraylist-of-arraylist-in-java/
public class Inici {
    private static Inici programa;
    private static Agenda agenda;
    private Usuaris usuaris = new Usuaris();
    private static Cartelera cartelera;
    private String [] Menu = new String[3];
    private boolean comprobant = false;
    private static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {
        programa = new Inici();
        agenda = new Agenda();
        cartelera = new Cartelera();
        programa.carregarPantalla();
    }

    public void mostrarMenu(){
        System.out.println("--------MENÚ NETFLIX--------");
        for (String m: Menu) {
            System.out.print(m + "\n");
        }
    }

    public void inicialitzarMenu(){
        Menu [0] = "[1] Inicia Sessió";
        Menu [1] = "[2] Registrar-se";
        Menu [2] = "[3] Tancar aplicació";
    }

    public void carregarPantalla(){
        int menu = -1;
        do {
            inicialitzarMenu();
            mostrarMenu();
            System.out.print("Introdueix un valor: ");
            if (scan.hasNextInt()){
                menu = scan.nextInt();
                if (menu >= 1 || menu <= 3){
                    switchCaseMenu(menu);
                }
                else{
                    System.out.println("Opció elegida incorrecta, torna introduïr un valor");
                }
            }
            else {
                scan.next();
                System.out.print("Valor introduït incorrecte");
            }
        }
        while (menu < 1 || menu > 3);
    }

    public void switchCaseMenu(int menuOpcio){
        switch (menuOpcio){
            case 1:
                iniciarSessio();
                break;
            case 2:
                agenda.nouUsuari(agenda.altaUsuari());
                iniciarSessio();
                break;
            case 3:
                System.out.println("Tancant la aplicació...");
                break;
        }
    }

    public void iniciarSessio(){
        Scanner scanner = new Scanner(System.in);
        Cartelera cartelera = new Cartelera();

        do {
            System.out.println("--------INICIAR SESSIÓ-------");
            System.out.print("Correu electronic: ");
            usuaris.correu = scanner.nextLine();

            System.out.print("Contrasenya: ");
            usuaris.contrasenya = scanner.nextLine();
            comprovacioIniciarSessio(usuaris.correu ,usuaris.contrasenya);
            if (comprobant == true){
                cartelera.carregarPantalla();
            }
        }
        while (comprobant == false);
    }

    public void comprovacioIniciarSessio(String correu, String contrasenya){
        ArrayList<Usuaris> llista = agenda.getUsuaris();
        Iterator<Usuaris> iter = llista.iterator();

        while(iter.hasNext()) {
            Usuaris usuaris = (Usuaris) iter.next();
            //Comprovació de correu electronic
            if (correu.contains("@")) {
                if(usuaris.correu.equals(correu) && usuaris.contrasenya.equals(contrasenya)){
                    System.out.println("\nCorreu Vàlid");
                    System.out.println("Contrasenya Vàlida\n");
                    comprobant = true;
                }
            }
            else {
                System.out.println("Correu electronic incorrecte");
                iniciarSessio();
            }
        }
    }
}
