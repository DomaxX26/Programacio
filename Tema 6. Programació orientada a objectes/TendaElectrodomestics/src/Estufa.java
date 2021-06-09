
import java.util.*;


/**
 * Class Estufa
 */
public class Estufa extends Electrodomestic {

  //
  // Fields
  //

  public int potencia;
  
  //
  // Constructors
  //
  public Estufa () { };
  
 public Estufa (String str){
     if ( str.isEmpty() )
         return;

   String [] info = str.split(";");

   this.numRef = Integer.parseInt(info[0]);
   this.PVP = Double.parseDouble(info[1]);
   this.Marca = info[2];
   this.Model = info[3];
   this.EE = info[4];
   this.Quantitat = Integer.parseInt(info[5]);
   this.potencia = Integer.parseInt(info[6]);
 }

  public String toString(){
    return "Nº de Referencia: " + numRef + ", Preu Venta Public: " + PVP + "€ , Marca: " + Marca + ", Model: " + Model + ", Etiqueta Energetica: " + EE + ", Quantitat: " + Quantitat + ", Potencia: " + potencia;
  }
  /**
   * Set the value of potencia
   * @param newVar the new value of potencia
   */
  public void setPotencia (int newVar) {
    potencia = newVar;
  }

  /**
   * Get the value of potencia
   * @return the value of potencia
   */
  public int getPotencia () {
    return potencia;
  }

  //
  // Other methods
  //

}
