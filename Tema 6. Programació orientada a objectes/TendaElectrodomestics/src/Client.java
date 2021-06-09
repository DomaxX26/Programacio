
import java.util.*;


/**
 * Class Client
 */
public class Client {

  //
  // Fields
  //

  public String nom;
  public String cognom1;
  public String cognom2;
  public String NIF;

  
  //
  // Constructors
  //
  public Client (String str) {
    if ( str.isEmpty() )
      return;

    String[]info = str.split(";");
    this.nom = info[0];
    this.cognom1 = info[1];
    this.cognom2 = info[2];
    this.NIF = info[3];
  }

  public Client() {

  }

  public String toString(){
    return this.nom + " " + this.cognom1 + " " + this.cognom2 + " " + this.NIF;
  }

  /**
   * Set the value of nom
   * @param newVar the new value of nom
   */
  public void setNom (String newVar) {
    nom = newVar;
  }

  /**
   * Get the value of nom
   * @return the value of nom
   */
  public String getNom () {
    return nom;
  }

  /**
   * Set the value of cognom1
   * @param newVar the new value of cognom1
   */
  public void setCognom1 (String newVar) {
    cognom1 = newVar;
  }

  /**
   * Get the value of cognom1
   * @return the value of cognom1
   */
  public String getCognom1 () {
    return cognom1;
  }

  /**
   * Set the value of cognom2
   * @param newVar the new value of cognom2
   */
  public void setCognom2 (String newVar) {
    cognom2 = newVar;
  }

  /**
   * Get the value of cognom2
   * @return the value of cognom2
   */
  public String getCognom2 () {
    return cognom2;
  }

  /**
   * Set the value of NIF
   * @param newVar the new value of NIF
   */
  public void setNIF (String newVar) {
    NIF = newVar;
  }

  /**
   * Get the value of NIF
   * @return the value of NIF
   */
  public String getNIF () {
    return NIF;
  }

  //
  // Other methods
  //

}
