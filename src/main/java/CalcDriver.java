
/**
 * D.
 *
 * @author Owen.
 *
 */
public class CalcDriver {

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
