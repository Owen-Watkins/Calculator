/**
 * Handles the main creation of the calculator and the appropriate view.
 *
 * @author Owen
 *
 */
public class CalcDriver {

  /**
   * Creates the view for the calculator.
   *
   * @param args takes the argument from the console, to see if it needs to be
   *             run in Gui format or not.
   */
  public static void main(String[] args) {
    ViewInterface view = new AsciiView();
    CalcModel model = new CalcModel();
    if (System.console() == null) {
      view = CalcGuiView.getInstance();
    }
    new CalcController(model, view);
    view.menu();
  }
}
