
import java.util.*;


/**
 * Class Nevera
 */
public class Nevera extends Electrodomestic {

  //
  // Fields
  //

  public int Alsada;
  public int Amplada;
  public int Fons;
  public String Congelador;
  
  //
  // Constructors
  //
  public Nevera () { };
  
  public Nevera (String str){
    if ( str.isEmpty() )
      return;

    String [] info = str.split(";");

    this.numRef = Integer.parseInt(info[0]);
    this.PVP = Double.parseDouble(info[1]);
    this.Marca = info[2];
    this.Model = info[3];
    this.EE = info[4];
    this.Quantitat = Integer.parseInt(info[5]);
    this.Alsada = Integer.parseInt(info[6]);
    this.Amplada = Integer.parseInt(info[7]);
    this.Fons = Integer.parseInt(info[8]);
    this.Congelador = info[9];
  }

  public String toString(){
    return "Nº de Referencia: " + numRef + ", Preu Venta Public: " + PVP + "€ , Marca: " + Marca + ", Model: " + Model + ", Etiqueta Energetica: " + EE + ", Quantitat: " + Quantitat + ", Alsada: " + Alsada + ", Amplada: " + Amplada + ", Fons: " + Fons + ", Congelador: " + Congelador;
  }
  /**
   * Set the value of Alsada
   * @param newVar the new value of Alsada
   */
  public void setAlsada (int newVar) {
    Alsada = newVar;
  }

  /**
   * Get the value of Alsada
   * @return the value of Alsada
   */
  public int getAlsada () {
    return Alsada;
  }

  /**
   * Set the value of Amplada
   * @param newVar the new value of Amplada
   */
  public void setAmplada (int newVar) {
    Amplada = newVar;
  }

  /**
   * Get the value of Amplada
   * @return the value of Amplada
   */
  public int getAmplada () {
    return Amplada;
  }

  /**
   * Set the value of Fons
   * @param newVar the new value of Fons
   */
  public void setFons (int newVar) {
    Fons = newVar;
  }

  /**
   * Get the value of Fons
   * @return the value of Fons
   */
  public int getFons () {
    return Fons;
  }

  /**
   * Set the value of Congelador
   * @param newVar the new value of Congelador
   */
  public void setCongelador (String newVar) {
    Congelador = newVar;
  }

  /**
   * Get the value of Congelador
   * @return the value of Congelador
   */
  public String getCongelador () {
    return Congelador;
  }

  //
  // Other methods
  //

}
