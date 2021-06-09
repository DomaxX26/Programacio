import java.util.*;
import java.io.*;


/**
 * Class Agenda
 */
public class Agenda {
  private Scanner scan = new Scanner(System.in);
  private String [] Menu = new String[5];
  private static boolean comprovacio = false;
  ArrayList llista;

  public Agenda () {
    llista = new ArrayList();
    carregarClients();
    inicialitzarMenu();
  }

  public void inicialitzarMenu(){
    Menu [0] = "[1] Mostrar Clients";
    Menu [1] = "[2] Donar Alta Clients";
    Menu [2] = "[3] Donar Baixa Clients";
    Menu [3] = "[4] Editar Clients";
    Menu [4] = "[5] Tornar Menu Tenda";
  }
  public void mostrarPrograma(){
    System.out.print("------------MENÚ AGENDA------------\n");
    for (String m: Menu) {
      System.out.print(m + "\n");
    }
  }
  public void menuAgenda(int menuAgenda){
    Tenda tenda = new Tenda();
    Client c = new Client();
    Scanner lector = new Scanner(System.in);
    switch (menuAgenda){
      case 1:
        System.out.println("--------CLIENTS--------");
        tenda.mostrarClients();
        comprobarMenuAgenda();
        break;
      case 2:
        System.out.println("----CLIENTS ACTUALITZAT----");
        nouClient(altaClient());
        comprobarMenuAgenda();
        break;
      case 3:
        System.out.println("----CLIENTS ESBORRAT----");
        System.out.print("Quin client vols esborrar (introdueix NIF)?: ");
        c.NIF = lector.nextLine();
        baixaClient(c.NIF);
        comprovacioBaixaClient();
        comprobarMenuAgenda();
        break;
      case 4:
        System.out.println("----EDITAR CLIENTS----");
        System.out.print("Quin client vols editar (introdueix NIF)?: ");
        c.NIF = lector.nextLine();
        editarCLient(c.NIF);
        comprobarMenuAgenda();
        break;
      case 5:
        tenda.comprobarMenuTenda();
        break;
    }
  }

  public void comprobarMenuAgenda(){
    int menu = -1;
    do {
      mostrarPrograma();
      System.out.print("Introdueix un valor de 1-4 per a elegir un programa: ");
      if (scan.hasNextInt()){
          menu = scan.nextInt();
        System.out.println(" ");
          if (menu >= 1 && menu <= 4){
            menuAgenda(menu);
          }
          else{
            System.out.println("Opció incorrecta, no has seleccionat un nùmero correcte.");
          }
      }
      else{
        scan.next();
        System.out.println("Valor introduït incorrecte, introdueix un valor (1, 2, 3 o 4).");
      }
    }
    while (menu < 1 || menu > 4);
  }

  public Client altaClient() {
    Client client = new Client();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nom del Client: ");
    client.nom = scanner.nextLine();

    System.out.print("Cognom 1 del Client: ");
    client.cognom1 = scanner.nextLine();

    System.out.print("Cognom 2 del Client: ");
    client.cognom2 = scanner.nextLine();

    System.out.print("NIF del Client: ");
    client.NIF = scanner.nextLine();

    getClients();
    return client;
  }

  public boolean baixaClient(String DNI) {
    Iterator<Client> iter;
    iter = this.llista.iterator();
    while(iter.hasNext()){
      Client c = (Client) iter.next();
      if (c.NIF.equals(DNI)){
        this.llista.remove(c);
        return comprovacio = true;
      }
    }
    return comprovacio;
  }

  public void comprovacioBaixaClient(){
    if (comprovacio == true){
      System.out.println("EL CLIENT S'HA ELIMINAT CORRECTAMENT");
    }
    else {
      System.out.println("EL CLIENT NO S'HA TROBAT");
    }
    comprovacio = false;
  }

  public ArrayList<Client> getClients() {
      return this.llista;
  }

  public void editarCLient(String DNI){
    int cont = -1;
    Iterator<Client> iter;
    iter = this.llista.iterator();
    while(iter.hasNext()){
      cont++;
      Client c = (Client) iter.next();
      if (c.NIF.equals(DNI)){
        this.llista.set(cont,altaClient());
        return;
      }
    }
  }
  public void nouClient(Client client){
    this.llista.add(client);
  }

  private void carregarClients () {
    try {
      File fClients = new File("/home/jpons/IdeaProjects/TendaElectrodomestics/src/Clients.txt");
      Scanner lector = new Scanner(fClients);
      while ( lector.hasNextLine() ) {
        String strLine = lector.nextLine();
        Client c = new Client(strLine);
        nouClient(c);
      }
    }
    catch (FileNotFoundException e ) {
      System.out.println("Hi ha un error");
    }
  }
}
