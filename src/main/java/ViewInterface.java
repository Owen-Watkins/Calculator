/**
 * This interface allows for actions to be taken on the observers.
 *
 * @author Owen
 *
 */
public interface ViewInterface {

  void addCalculateObserver(Observer c);

  String getUserInput();

  public void menu();

  void setTotal(String value);
}
