public class CalcController {
  private CalcModel MyModel;
  private ViewInterface MyView;

  CalcController(CalcModel model, ViewInterface view) {
    MyModel = model;
    MyView = view;
  }
}
