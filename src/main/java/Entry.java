/**
 * Class for the entries given for the calculations, creation and modifications.
 *
 * @author zkac249
 *
 */
public class Entry {
  Type type;
  String str;
  Float value;
  Symbol other;

  /**
   * Creates a blank entry.
   */
  public Entry() {}

  /**
   * Creates an entity with variable type Type.
   *
   * @param type holds the type of the entry given
   */
  public Entry(Type type) {
    this.type = type;
  }

  /**
   * Creates an entity with variable type String.
   *
   * @param string holds the string given by entry made
   */
  public Entry(String string) {
    this.str = string;
  }

  /**
   * Creates an entity with variable type Float.
   *
   * @param value holds the float given by the entry made
   */
  public Entry(Float value) {
    this.value = value;
  }

  /**
   * Creates an entity with variavble type Symbol.
   *
   * @param symbol holds the symbol given for the calculation to be done with
   */
  public Entry(Symbol symbol) {
    this.other = symbol;
  }

  /**
   * Retrieves the value of the Type for the specific entry.
   *
   * @return returns the value of Type
   * @throws BadTypeException thrown if there is not an assigned variable to this type
   */
  public Type getType() throws BadTypeException {
    if (type == null) {
      throw new BadTypeException();
    }

    return type;
  }

  /**
   * Retrieves the value of the String for the specific entry.
   *
   * @return returns the value of String
   * @throws BadTypeException thrown if there is not an assigned variable to this type
   */
  public String getString() throws BadTypeException {
    if (str == null) {
      throw new BadTypeException();
    }
    return str;
  }

  /**
   * Retrieves the value of the Float for the specific entry.
   *
   * @return returns the value of Float
   * @throws BadTypeException thrown if there is not an assigned variable to this type
   */
  public Float getValue() throws BadTypeException {
    if (value == null) {
      throw new BadTypeException();
    }
    return value;
  }

  /**
   * Retrieves the value of the Symbol for the specific entry.
   *
   * @return returns the value of Symbol
   * @throws BadTypeException thrown if there is not an assigned variable to this type
   */
  public Symbol getSymbol() throws BadTypeException {
    if (other == null) {
      throw new BadTypeException();
    }
    return other;
  }



}
