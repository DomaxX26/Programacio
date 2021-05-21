
import java.util.*;


/**
 * Class Llavadora
 */
public class Llavadora extends Electrodomestic {

  //
  // Fields
  //

  public double Volum;
  public String Programes;
  
  //
  // Constructors
  //
  public Llavadora () { };

  public Llavadora(String str){
    if ( str.isEmpty() )
      return;

    String [] info = str.split(";");

    this.numRef = Integer.parseInt(info[0]);
    this.PVP = Double.parseDouble(info[1]);
    this.Marca = info[2];
    this.Model = info[3];
    this.EE = info[4];
    this.Quantitat = Integer.parseInt(info[5]);
    this.Volum = Double.parseDouble(info[6]);
    this.Programes = info[7];
  }

  public String toString(){
    return "Nº de Referencia: " + numRef + ", Preu Venta Public: " + PVP + "€ , Marca: " + Marca + ", Model: " + Model + ", Etiqueta Energetica: " + EE + ", Quantitat: " + Quantitat + ", Volum: " + Volum + ", Programes: " + Programes;
  }

  /**
   * Set the value of Volum
   * @param newVar the new value of Volum
   */
  public void setVolum (double newVar) {
    Volum = newVar;
  }

  /**
   * Get the value of Volum
   * @return the value of Volum
   */
  public double getVolum () {
    return Volum;
  }

  /**
   * Set the value of Programes
   * @param newVar the new value of Programes
   */
  public void setProgrames (String newVar) {
    Programes = newVar;
  }

  /**
   * Get the value of Programes
   * @return the value of Programes
   */
  public String getProgrames () {
    return Programes;
  }

  //
  // Other methods
  //

}
