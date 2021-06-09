
import java.util.*;


/**
 * Class Televisio
 */
public class Televisio extends Electrodomestic {

  //
  // Fields
  //

  public String Definicio;
  public int Polzades;
  
  //
  // Constructors
  //
  public Televisio () { };
  
  public Televisio (String str){
    if ( str.isEmpty() )
      return;

    String [] info = str.split(";");

    this.numRef = Integer.parseInt(info[0]);
    this.PVP = Double.parseDouble(info[1]);
    this.Marca = info[2];
    this.Model = info[3];
    this.EE = info[4];
    this.Quantitat = Integer.parseInt(info[5]);
    this.Definicio = info[6];
    this.Polzades = Integer.parseInt(info[7]);
  }

  public String toString(){
    return "Nº de Referencia: " + numRef + ", Preu Venta Public: " + PVP + "€ , Marca: " + Marca + ", Model: " + Model + ", Etiqueta Energetica: " + EE + ", Quantitat: " + Quantitat + ", Definicio: " + Definicio + ", Polzades: " + Polzades;
  }

  /**
   * Set the value of Definicio
   * @param newVar the new value of Definicio
   */
  public void setDefinicio (String newVar) {
    Definicio = newVar;
  }

  /**
   * Get the value of Definicio
   * @return the value of Definicio
   */
  public String getDefinicio () {
    return Definicio;
  }

  /**
   * Set the value of Polzades
   * @param newVar the new value of Polzades
   */
  public void setPolzades (int newVar) {
    Polzades = newVar;
  }

  /**
   * Get the value of Polzades
   * @return the value of Polzades
   */
  public int getPolzades () {
    return Polzades;
  }

  //
  // Other methods
  //

}
