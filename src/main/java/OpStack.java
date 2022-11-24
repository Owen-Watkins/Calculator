/**
 * This is the class for OpStack.
 *
 * @author Owen
 *
 */
public class OpStack {
  Stack opStack = new Stack();
  Symbol size;

  /**
   * Finds size of OpStack object by returning value from size() method of Stack
   * class.
   *
   * @return Symbol value representing size of stack
   */
  public int size() {
    return opStack.size();
  }

  /**
   * Pushes an Entry with Symbol value into the stack.
   *
   * @param i Value to be added as entry into stack.
   */
  public void push(Symbol i) {
    Entry entry = new Entry(i);
    opStack.push(entry);

  }

  /**
   * Pops last added entry into the Stack.
   *
   * @return The last added Stack.
   * @throws BadTypeException Thrown if type returned is not Symbol.
   *
   */
  public Symbol pop() throws BadTypeException {
    return opStack.pop().getSymbol();
  }

  /**
   * Checks if the Stack has any entries or not. 
   *
   * @return boolean for whether Stack is empty, i.e. true for an empty stack.
   */
  public boolean isEmpty() {
    if (opStack.size() > 0) {
      return false;
    }
    return true;

  }

}
