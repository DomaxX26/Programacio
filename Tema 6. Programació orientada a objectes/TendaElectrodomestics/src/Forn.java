
import java.util.*;


/**
 * Class Forn
 */
public class Forn extends Electrodomestic {

  //
  // Fields
  //

  public int Potencia;
  public double Volum;
  
  //
  // Constructors
  //
  public Forn () { };

  public Forn(String str){
    if ( str.isEmpty() )
      return;

    String [] info = str.split(";");

    this.numRef = Integer.parseInt(info[0]);
    this.PVP = Double.parseDouble(info[1]);
    this.Marca = info[2];
    this.Model = info[3];
    this.EE = info[4];
    this.Quantitat = Integer.parseInt(info[5]);
    this.Potencia = Integer.parseInt(info[6]);
    this.Volum = Double.parseDouble(info[7]);
  }

  public String toString(){
    return "Nº de Referencia: " + numRef + ", Preu Venta Public: " + PVP + "€ , Marca: " + Marca + ", Model: " + Model + ", Etiqueta Energetica: " + EE + ", Quantitat: " + Quantitat + ", Potencia: " + Potencia + ", Volum: " + Volum;
  }
  /**
   * Set the value of Potencia
   * @param newVar the new value of Potencia
   */
  public void setPotencia (int newVar) {
    Potencia = newVar;
  }

  /**
   * Get the value of Potencia
   * @return the value of Potencia
   */
  public int getPotencia () {
    return Potencia;
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

  //
  // Other methods
  //

}
