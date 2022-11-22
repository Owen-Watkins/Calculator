/**
 * Enumerated type for the types of variables used in calculations.
 *
 * @author zkac249
 *
 */
public enum Type {
  /**
   * A number has been inputed.
   */
  NUMBER,
  /**
   * A symbol has been inputed.
   */
  SYMBOL,
  /**
   * A string has been inputed.
   */
  STRING,
  /**
   * None of the aforementioned types have been inputed.
   */
  INVALID;

  private String type;

  private Type() {
    type = this.name();
  }

  @Override
  public String toString() {
    return (type);
  }


}
