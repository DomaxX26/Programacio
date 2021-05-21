
import java.util.*;


/**
 * Class Electrodomestic
 */
public class Electrodomestic {

  //
  // Fields
  //
  private String [] Menu = new String[7];
  private Scanner scan = new Scanner(System.in);
  public int numRef;
  public double PVP;
  public String Marca;
  public String Model;
  public String EE;
  public int Quantitat;
  
  //
  // Constructors
  //
  public Electrodomestic () {
    inicialitzarMenu();
  }
  public void inicialitzarMenu(){
    Menu [0] = "[1] Estufes";
    Menu [1] = "[2] Forns";
    Menu [2] = "[3] Llavadores";
    Menu [3] = "[4] Microones";
    Menu [4] = "[5] Neveres";
    Menu [5] = "[6] Televisions";
    Menu [6] = "[7] Tornar Menu Estoc";
  }
  public void mostrarPrograma(){
    System.out.print("------------MENÚ ELECTRODOMÈSTICS------------\n");
    for (String m: Menu) {
      System.out.print(m + "\n");
    }
  }
  public void menuElectro(int menuElectro){
    Tenda tenda = new Tenda();
    Estoc e = new Estoc();
    switch (menuElectro){
      case 1:
        System.out.println("------------ESTUFES------------");
        tenda.mostrarEstufa();
        comprobarMenuElectrodomestic();
        break;
      case 2:
        System.out.println("------------FORNS------------");
        tenda.mostrarForn();
        comprobarMenuElectrodomestic();
        break;
      case 3:
        System.out.println("------------LLAVADORES------------");
        tenda.mostrarLlavadora();
        comprobarMenuElectrodomestic();
        break;
      case 4:
        System.out.println("------------MICROONES------------");
        tenda.mostrarMicroones();
        comprobarMenuElectrodomestic();
        break;
      case 5:
        System.out.println("------------NEVERES------------");
        tenda.mostrarNevera();
        break;
      case 6:
        System.out.println("------------TELEVISIONS------------");
        tenda.mostrarTelevisio();
        break;
      case 7:
        e.comprobarMenuEstoc();
        break;
    }
  }


  public void comprobarMenuElectrodomestic(){
    int menu = -1;
    do {
      mostrarPrograma();
      System.out.print("Introdueix un valor de 1-7 per a elegir un programa: ");
      if (scan.hasNextInt()){
        menu = scan.nextInt();
        System.out.println(" ");
        if (menu >= 1 && menu <= 7){
          menuElectro(menu);
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
    while (menu < 1 || menu > 7);
  }
  /**
   * Set the value of numRef
   * @param newVar the new value of numRef
   */
  public void setNumRef (int newVar) {
    numRef = newVar;
  }

  /**
   * Get the value of numRef
   * @return the value of numRef
   */
  public int getNumRef () {
    return numRef;
  }

  /**
   * Set the value of PVP
   * @param newVar the new value of PVP
   */
  public void setPVP (double newVar) {
    PVP = newVar;
  }

  /**
   * Get the value of PVP
   * @return the value of PVP
   */
  public double getPVP () {
    return PVP;
  }

  /**
   * Set the value of Marca
   * @param newVar the new value of Marca
   */
  public void setMarca (String newVar) {
    Marca = newVar;
  }

  /**
   * Get the value of Marca
   * @return the value of Marca
   */
  public String getMarca () {
    return Marca;
  }

  /**
   * Set the value of Model
   * @param newVar the new value of Model
   */
  public void setModel (String newVar) {
    Model = newVar;
  }

  /**
   * Get the value of Model
   * @return the value of Model
   */
  public String getModel () {
    return Model;
  }

  /**
   * Set the value of EE
   * @param newVar the new value of EE
   */
  public void setEE (String newVar) {
    EE = newVar;
  }

  /**
   * Get the value of EE
   * @return the value of EE
   */
  public String getEE () {
    return EE;
  }

  /**
   * Set the value of Quantitat
   * @param newVar the new value of Quantitat
   */
  public void setQuantitat (int newVar) {
    Quantitat = newVar;
  }

  /**
   * Get the value of Quantitat
   * @return the value of Quantitat
   */
  public int getQuantitat () {
    return Quantitat;
  }

  //
  // Other methods
  //

}
