public class CalcModel {
  private int answer;

  public void reset() {
    answer = 1;
  }

  public String getValue() {
    return String.valueOf(answer);
  }
}
