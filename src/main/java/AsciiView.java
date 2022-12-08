import java.util.Scanner;

public class AsciiView implements ViewInterface {
  private String question;
  Observer calc = null;

  public void menu() {
    Scanner scanner = new Scanner(System.in);
    boolean finished = false;
    help();

    while (!finished && scanner.hasNext()) {
      String input = scanner.next();
      switch (input.toUpperCase().charAt(0)) {
        case 'C':
          if (calc != null) {
            calc.notifyObservers();
          }
          break;
        case 'X':
          question = input.substring(1);
          System.out.println("Question set to: " + question);
          break;
        case 'Q':
          finished = true;
          break;
        default:
          help();
      }
    }
    scanner.close();
  }

  private void help() {
    System.out.println("Hello and welcome to this calculator. Please do one of the following:");
    System.out.println("  X - to set the expression to 'x' ");
    System.out.println("  C - to calculate the expression");
    System.out.println("  Q - to exit");
  }

  public void addCalculateObserver(Observer c) {
    calc = c;
  }

  public String getUserInput() {
    return question;
  }

  @Override
  public void setTotal(String value) {
    
  }


}
