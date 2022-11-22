/**
 * Enumerated type for the symbol used for calculations.
 *
 * @author zkac249
 */
public enum Symbol {
  /**
   * Left bracket symbol : (.
   */
  LEFT_BRACKET,
  /**
   * Right bracket symbol : ).
   */
  RIGHT_BRACKET,
  /**
   * Multiplication symbol : *.
   */
  TIMES,
  /**
   * Division symbol : /.
   */
  DIVIDE,
  /**
   * Addition symbol : +.
   */
  PLUS,
  /**
   * Sumbtraction symbol : -.
   */
  MINUS,
  /**
   * Invalid symbols, none of the aforementioned symbols.
   */
  INVALID;

  private String symbol;

  private Symbol() {
    symbol = this.name();
  }

  @Override
  public String toString() {
    return (symbol);
  }

}
