
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


/**
 * Class Estoc
 */
public class Estoc {
  private Scanner scan = new Scanner(System.in);
  private String [] Menu = new String[5];
  private boolean comprovacio = false;
  Electrodomestic e = new Electrodomestic();
  ArrayList productes;


  public ArrayList estufesArray = new ArrayList();

  public ArrayList telesArray = new ArrayList();

  public ArrayList microsArray = new ArrayList();

  public ArrayList neveresArray = new ArrayList();

  public ArrayList fornsArray = new ArrayList();

  public ArrayList llavadoresArray = new ArrayList();
  
  //
  // Constructors
  //
  public Estoc () {
    productes = new ArrayList();
    carregarElectrodomestic();
    inicialitzarMenu();
  }

  public void inicialitzarMenu(){
    Menu [0] = "[1] Mostrar Estoc";
    Menu [1] = "[2] Donar Alta Electrodomèstics";
    Menu [2] = "[3] Donar Baixa Electrodomèstics";
    Menu [3] = "[4] Editar Electrodomèstics";
    Menu [4] = "[5] Tornar Menu Tenda";
  }

  public void mostrarPrograma(){
    System.out.print("------------MENÚ ESTOC------------\n");
    for (String m: Menu) {
      System.out.print(m + "\n");
    }
  }

  public void menuEstoc(int menuEstoc){
    Tenda tenda = new Tenda();
    Electrodomestic e = new Electrodomestic();
    Scanner lector = new Scanner(System.in);
    switch (menuEstoc){
      case 1:
        System.out.println("--------ELECTRODOMÈSTICS--------");
        e.comprobarMenuElectrodomestic();
        comprobarMenuEstoc();
        break;
      case 2:
        System.out.println("----ELECTRODOMÈSTICS ACTUALITZAT----");
        comprovacio = true;
        quinElectrodomestic();
        comprobarMenuEstoc();
        break;
      case 3:
        System.out.println("----ELECTRODOMÈSTICS ESBORRAT----");
        quinElectrodomestic();
        comprobarMenuEstoc();
        break;
      case 4:
        System.out.println("----EDITAR ELECTRODOMÈSTICS----");
        System.out.print("Quin electrodomèstics vols editar(introdueix Nº Referencia)?: ");


        comprobarMenuEstoc();
        break;
      case 5:
        tenda.comprobarMenuTenda();
        break;
    }
  }

  public void comprobarMenuEstoc(){
    int menu = -1;
    do {
      mostrarPrograma();
      System.out.print("Introdueix un valor de 1-5 per a elegir un programa: ");
      if (scan.hasNextInt()){
        menu = scan.nextInt();
        System.out.println(" ");
        if (menu >= 1 && menu <= 5){
          menuEstoc(menu);
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
  public ArrayList<Estoc> getEstoc() {
    return this.productes;
  }
  public void carregarElectrodomestic(){
    try {
      File fEstufa = new File("/home/jpons/IdeaProjects/TendaElectrodomestics/src/Estufa.txt");
      Scanner scanEstufa = new Scanner(fEstufa);
      while(scanEstufa.hasNextLine()){
        String srtLine = scanEstufa.nextLine();
        Estufa estufa = new Estufa(srtLine);
        estufesArray.add(estufa);
      }
      scanEstufa.close();

      File fForn = new File("/home/jpons/IdeaProjects/TendaElectrodomestics/src/Forn.txt");
      Scanner scanForn = new Scanner(fForn);
      while(scanForn.hasNextLine()){
        String srtLine = scanForn.nextLine();
        Forn forn = new Forn(srtLine);
        fornsArray.add(forn);
      }
      scanForn.close();

      File fLlavadora = new File("/home/jpons/IdeaProjects/TendaElectrodomestics/src/Llavadora.txt");
      Scanner scanLlavadora = new Scanner(fLlavadora);
      while(scanLlavadora.hasNextLine()){
        String srtLine = scanLlavadora.nextLine();
        Llavadora llavadora = new Llavadora(srtLine);
        llavadoresArray.add(llavadora);
      }
      scanLlavadora.close();

      File fMicroones = new File("/home/jpons/IdeaProjects/TendaElectrodomestics/src/Microones.txt");
      Scanner scanMicroones = new Scanner(fMicroones);
      while(scanMicroones.hasNextLine()){
        String srtLine = scanMicroones.nextLine();
        Microones microones = new Microones(srtLine);
        microsArray.add(microones);
      }
      scanMicroones.close();

      File fNevera = new File("/home/jpons/IdeaProjects/TendaElectrodomestics/src/Nevera.txt");
      Scanner scanNevera = new Scanner(fNevera);
      while(scanNevera.hasNextLine()){
        String srtLine = scanNevera.nextLine();
        Nevera nevera = new Nevera(srtLine);
        neveresArray.add(nevera);
      }
      scanNevera.close();


      File fTelevisio = new File("/home/jpons/IdeaProjects/TendaElectrodomestics/src/Televisio.txt");
      Scanner scanTelevisio = new Scanner(fTelevisio);
      while(scanTelevisio.hasNextLine()){
        String srtLine = scanTelevisio.nextLine();
        Televisio televisio = new Televisio(srtLine);
        telesArray.add(televisio);
      }
      scanTelevisio.close();
    }
    catch (FileNotFoundException e ) {
      System.out.println("Hi ha un error");
    }
  }

  public void altaElectrodomestic(int opcioMenu){
  switch (opcioMenu){
    case 1:
      altaEstufa();
      break;
    case 2:
      altaForn();
      break;
    case 3:
      altaLlavadora();
      break;
    case 4:
      altaMicroones();
      break;
    case 5:
      altaNevera();
      break;
    case 6:
      altaTelevisio();
      break;
  }

  }

  public void baixaElectrodomestic(int opcioMenu){
    switch (opcioMenu){
      case 1:

        break;
      case 2:

        break;
      case 3:

        break;
      case 4:

        break;
      case 5:

        break;
      case 6:

        break;
    }
  }

  public void quinElectrodomestic(){
    int menu = -1;
    do {
      e.mostrarPrograma();
      System.out.print("Quin electrodomèstic vols?: ");
      if (scan.hasNextInt()){
        menu = scan.nextInt();
        System.out.println(" ");
        if (menu >= 1 && menu <= 6){
          if (comprovacio == true) {
            altaElectrodomestic(menu);
          }
          else {
            baixaElectrodomestic(menu);
          }
        }
        else{
          System.out.println("Opció incorrecta, no has seleccionat un nùmero correcte.");
        }
      }
      else{
        scan.next();
        System.out.println("Valor introduït incorrecte, introdueix un valor (1 al 7).");
      }
    }
    while (menu < 1 || menu > 6);
  }

  public void altaEstufa(){
    Estufa e = new Estufa();
    System.out.print("Nº de referencia: ");
    e.numRef = scan.nextInt();
    System.out.print("P.V.P: ");
    e.PVP = scan.nextDouble();
    System.out.print("Marca: ");
    e.Marca = scan.next();
    System.out.print("Model: ");
    e.Model = scan.next();
    System.out.print("E.E: ");
    e.EE = scan.next();
    System.out.print("Quantitat: ");
    e.Quantitat = scan.nextInt();
    System.out.print("Potencia: ");
    e.potencia = scan.nextInt();
    getEstufesList();
    addEstufes(e);
  }

  public void altaForn(){
    Forn f = new Forn();
    System.out.print("Nº de referencia: ");
    f.numRef = scan.nextInt();
    System.out.print("P.V.P: ");
    f.PVP = scan.nextDouble();
    System.out.print("Marca: ");
    f.Marca = scan.next();
    System.out.print("Model: ");
    f.Model = scan.next();
    System.out.print("E.E: ");
    f.EE = scan.next();
    System.out.print("Quantitat: ");
    f.Quantitat = scan.nextInt();
    System.out.print("Potencia: ");
    f.Potencia = scan.nextInt();
    System.out.print("Volum: ");
    f.Volum = scan.nextInt();
    getFornsList();
    addForns(f);
  }

  public void altaLlavadora(){
    Llavadora l = new Llavadora();
    System.out.print("Nº de referencia: ");
    l.numRef = scan.nextInt();
    System.out.print("P.V.P: ");
    l.PVP = scan.nextDouble();
    System.out.print("Marca: ");
    l.Marca = scan.next();
    System.out.print("Model: ");
    l.Model = scan.next();
    System.out.print("E.E: ");
    l.EE = scan.next();
    System.out.print("Quantitat: ");
    l.Quantitat = scan.nextInt();
    System.out.print("Volum: ");
    l.Volum = scan.nextInt();
    System.out.print("Programes: ");
    l.Programes = scan.next();
    getLlavadoresList();
    addLlavadores(l);
  }

  public void altaMicroones(){
    Microones m = new Microones();
    System.out.print("Nº de referencia: ");
    m.numRef = scan.nextInt();
    System.out.print("P.V.P: ");
    m.PVP = scan.nextDouble();
    System.out.print("Marca: ");
    m.Marca = scan.next();
    System.out.print("Model: ");
    m.Marca = scan.next();
    System.out.print("E.E: ");
    m.Marca = scan.next();
    System.out.print("Quantitat: ");
    m.Quantitat = scan.nextInt();
    System.out.print("Potencia: ");
    m.Potencia = scan.nextInt();
    System.out.print("Volum: ");
    m.Volum = scan.nextInt();
    getMicrosList();
    addMicros(m);
  }

  public void altaNevera(){
    Nevera n = new Nevera();
    System.out.print("Nº de referencia: ");
    n.numRef = scan.nextInt();
    System.out.print("P.V.P: ");
    n.PVP = scan.nextDouble();
    System.out.print("Marca: ");
    n.Marca = scan.next();
    System.out.print("Model: ");
    n.Marca = scan.next();
    System.out.print("E.E: ");
    n.Marca = scan.next();
    System.out.print("Quantitat: ");
    n.Quantitat = scan.nextInt();
    System.out.print("Alsada: ");
    n.Alsada = scan.nextInt();
    System.out.print("Amplada: ");
    n.Amplada = scan.nextInt();
    System.out.print("Fons: ");
    n.Fons = scan.nextInt();
    System.out.print("Congelador: ");
    n.Congelador = scan.next();
    getNeveresList();
    addNeveres(n);
  }

  public void altaTelevisio(){
    Televisio t = new Televisio();
    System.out.print("Nº de referencia: ");
    t.numRef = scan.nextInt();
    System.out.print("P.V.P: ");
    t.PVP = scan.nextDouble();
    System.out.print("Marca: ");
    t.Marca = scan.next();
    System.out.print("Model: ");
    t.Marca = scan.next();
    System.out.print("E.E: ");
    t.Marca = scan.next();
    System.out.print("Quantitat: ");
    t.Quantitat = scan.nextInt();
    System.out.print("Definicio: ");
    t.Definicio = scan.next();
    System.out.print("Polzades: ");
    t.Polzades = scan.nextInt();
    getTelesList();
    addTeles(t);
  }


  public void addEstufes (Estufa new_object) {
    estufesArray.add(new_object);
  }

  /**
   * Remove a Estufes object from estufesVector List
   */
  public void removeEstufes (Estufa new_object)
  {
    estufesArray.remove(new_object);
  }

  /**
   * Get the List of Estufes objects held by estufesVector
   * @return List of Estufes objects held by estufesVector
   */
  public ArrayList<Estufa> getEstufesList () {
    return this.estufesArray;
  }


  /**
   * Add a Teles object to the telesVector List
   */
  public void addTeles (Televisio new_object) {
    telesArray.add(new_object);
  }

  /**
   * Remove a Teles object from telesVector List
   */
  public void removeTeles (Televisio new_object)
  {
    telesArray.remove(new_object);
  }

  /**
   * Get the List of Teles objects held by telesVector
   * @return List of Teles objects held by telesVector
   */
  public ArrayList<Televisio> getTelesList () {
    return this.telesArray;
  }


  /**
   * Add a Micros object to the microsVector List
   */
  public void addMicros (Microones new_object) {
    microsArray.add(new_object);
  }

  /**
   * Remove a Micros object from microsVector List
   */
  public void removeMicros (Microones new_object)
  {
    microsArray.remove(new_object);
  }

  /**
   * Get the List of Micros objects held by microsVector
   * @return List of Micros objects held by microsVector
   */
  public ArrayList<Microones> getMicrosList () {
    return this.microsArray;
  }


  /**
   * Add a Neveres object to the neveresVector List
   */
  public void addNeveres (Nevera new_object) {
    neveresArray.add(new_object);
  }

  /**
   * Remove a Neveres object from neveresVector List
   */
  public void removeNeveres (Nevera new_object)
  {
    neveresArray.remove(new_object);
  }

  /**
   * Get the List of Neveres objects held by neveresVector
   * @return List of Neveres objects held by neveresVector
   */
  public ArrayList<Nevera> getNeveresList () {
    return this.neveresArray;
  }


  /**
   * Add a Forns object to the fornsVector List
   */
  public void addForns (Forn new_object) {
    fornsArray.add(new_object);
  }

  /**
   * Remove a Forns object from fornsVector List
   */
  public void removeForns (Forn new_object)
  {
    fornsArray.remove(new_object);
  }

  /**
   * Get the List of Forns objects held by fornsVector
   * @return List of Forns objects held by fornsVector
   */
  public ArrayList<Forn> getFornsList () {
    return this.fornsArray;
  }


  /**
   * Add a Llavadores object to the llavadoresVector List
   */
  public void addLlavadores (Llavadora new_object) {
    llavadoresArray.add(new_object);
  }

  /**
   * Remove a Llavadores object from llavadoresVector List
   */
  public void removeLlavadores (Llavadora new_object)
  {
    llavadoresArray.remove(new_object);
  }

  /**
   * Get the List of Llavadores objects held by llavadoresVector
   * @return List of Llavadores objects held by llavadoresVector
   */
  public ArrayList<Llavadora> getLlavadoresList () {
    return this.llavadoresArray;
  }


  //
  // Other methods
  //

  /**
   * @param        nou
   */
  public void donar(Electrodomestic nou)
  {
  }


  /**
   */
  public void llistar()
  {
  }


  /**
   * @param        ref
   */
  public void donarBaixa(int ref)
  {
  }


}
