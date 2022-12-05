/**
 * Exception class thrown when trying to use a get method for a variable that is unassigned.
 *
 * @author zkac249
 *
 */
public class BadTypeException extends Exception {
  private static final long serialVersionUID = 1L;

  /**
   * takes the super class from Exception.
   */
  public BadTypeException() {
    super();
  }
}
