
import java.util.*;


/**
 * Class Compra
 */
public class Compra {

  //
  // Fields
  //

  public String data;
  public double total;
  public double IVA;

  public Vector itemsVector = new Vector();

  public Client m_client;
  
  //
  // Constructors
  //
  public Compra () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of data
   * @param newVar the new value of data
   */
  public void setData (String newVar) {
    data = newVar;
  }

  /**
   * Get the value of data
   * @return the value of data
   */
  public String getData () {
    return data;
  }

  /**
   * Set the value of total
   * @param newVar the new value of total
   */
  public void setTotal (double newVar) {
    total = newVar;
  }

  /**
   * Get the value of total
   * @return the value of total
   */
  public double getTotal () {
    return total;
  }

  /**
   * Set the value of IVA
   * @param newVar the new value of IVA
   */
  public void setIVA (double newVar) {
    IVA = newVar;
  }

  /**
   * Get the value of IVA
   * @return the value of IVA
   */
  public double getIVA () {
    return IVA;
  }

  /**
   * Add a Items object to the itemsVector List
   */
  public void addItems (Electrodomestic new_object) {
    itemsVector.add(new_object);
  }

  /**
   * Remove a Items object from itemsVector List
   */
  public void removeItems (Electrodomestic new_object)
  {
    itemsVector.remove(new_object);
  }

  /**
   * Get the List of Items objects held by itemsVector
   * @return List of Items objects held by itemsVector
   */
  public List getItemsList () {
    return (List) itemsVector;
  }


  /**
   * Set the value of m_client
   * @param newVar the new value of m_client
   */
  public void setClient (Client newVar) {
    m_client = newVar;
  }

  /**
   * Get the value of m_client
   * @return the value of m_client
   */
  public Client getClient () {
    return m_client;
  }

  //
  // Other methods
  //

  /**
   * @param        elect
   * @param        quantitat
   */
  public void afegirItem(Electrodomestic elect, int quantitat)
  {
  }


  /**
   * @param        linia
   */
  public void llevarItem(int linia)
  {
  }


  /**
   */
  public void mostrar()
  {
  }


}
