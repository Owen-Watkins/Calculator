/**
 * Standard calculations with numStacks and opStacks.
 *
 * @author Owen
 *
 */
public class StndrdCalc {
  OpStack opStack;
  NumStack numStack;

  /**
   * Empty constructor for StndrdCalc.
   */
  public StndrdCalc() {

  }

  /**
   * Constructor that takes numStack and opStack and initialises them.
   *
   * @param opStack  stack of operators.
   *
   * @param numStack stack of numbers.
   */
  public StndrdCalc(OpStack opStack, NumStack numStack) {
    this.numStack = numStack;
    this.opStack = opStack;
  }

  /**
   * Takes the two stack types and does the operations needed.
   *
   * @return float value that is the answer to the calculation.
   * @throws BadTypeException For if the get method is called for the wrong type.
   */
  public float calculate() throws BadTypeException {
    float total = 0;
    int i = 0;
    if (hasBrackets(opStack) == false) {
      total = numStack.getFloat(i);
      while (i <= numStack.size() - 2) {
        Symbol sign = opStack.getSymbol(i);
        total = doSum(total, sign, numStack.getFloat(i + 1));
        i++;
      }
    } else {
      int leftBrack = whereSymbol(opStack, Symbol.LEFT_BRACKET);
      int rightBrack = whereSymbol(opStack, Symbol.RIGHT_BRACKET);
      if (leftBrack != 0) {
        int opTrace = 0;
        int numTrace = 0;
        total = numStack.getFloat(numTrace);
        if (opStack.getSymbol(opTrace + 1) == Symbol.LEFT_BRACKET) {
          Symbol signBeforeBracket = opStack.getSymbol(opTrace);
          opTrace += 2;
          float bracketTotal = numStack.getFloat(numTrace + 1);
          while (opStack.getSymbol(opTrace) != Symbol.RIGHT_BRACKET) {
            Symbol sign = opStack.getSymbol(opTrace);
            bracketTotal = doSum(bracketTotal, sign, numStack.getFloat(numTrace + 2));
            numTrace++;
            opTrace++;
          }
          total = doSum(total, signBeforeBracket, bracketTotal);
        }

      } else {
        total = numStack.getFloat(i);
        while (i < rightBrack) {
          i++;
          Symbol sign = opStack.getSymbol(i);
          total = doSum(total, sign, numStack.getFloat(i));

        }
        while (i < numStack.size()) {
          Symbol sign = opStack.getSymbol(i + 1);
          total = doSum(total, sign, numStack.getFloat(i));
          i++;
        }

      }
    }

    return total;
  }

  /**
   * Checks if the operation has brackets in or not.
   *
   * @param opStack Takes the stack of operators to see if a bracket is one of
   *                them.
   * @return true or false depending on if a bracket is in the stack.
   * @throws BadTypeException For if the get method is called for the wrong type.
   */
  private boolean hasBrackets(OpStack opStack) throws BadTypeException {
    for (int i = 0; i <= opStack.size() - 1; i++) {
      if (opStack.getSymbol(i) == Symbol.LEFT_BRACKET) {
        return true;
      }

    }
    return false;
  }

  /**
   * Checks where the desired symbol is in the entries list.
   *
   * @param opStack the stack of operators that will be searched.
   * @param symbol  what symbol to check its index.
   * @return index of where the bracket starts in the entries list
   * @throws BadTypeException For if the get method is called for the wrong type.
   */
  private int whereSymbol(OpStack opStack, Symbol symbol) throws BadTypeException {
    for (int i = 0; i <= opStack.size() - 1; i++) {
      if (opStack.getSymbol(i) == symbol) {
        return i;
      }
    }
    return 0;
  }

  /**
   * Handles the calculation of the operator on the floats.
   *
   * @param total  total sum of previous operations, with the new float
   *
   * @param sign   the sign that the operation is.
   *
   * @param number the number to be added to the total.
   *
   * @return the total of the previous calculations and this new one.
   */
  private float doSum(float total, Symbol sign, float number) {
    switch (sign) {
      case PLUS:
        total += number;
        break;
      case MINUS:
        total -= number;
        break;
      case DIVIDE:
        total /= number;
        break;
      case TIMES:
        total *= number;
        break;
      default:
        break;
     
  
    }

    return total;
  }

}
