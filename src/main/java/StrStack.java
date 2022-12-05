/**
 * This is the class for StrStack.
 *
 * @author Owen
 *
 */
public class StrStack {
  Stack strStack = new Stack();

  /**
   * Finds size of StrStack object by returning value from size() method of Stack
   * class.
   *
   * @return int value representing size of stack
   */
  public int size() {
    return strStack.size();
  }

  /**
   * Pushes an Entry with string value into the stack.
   *
   * @param i Value to be added as entry into stack.
   */
  public void push(String i) {
    Entry entry = new Entry(i);
    strStack.push(entry);

  }

  /**
   * Pops last added entry into the Stack.
   *
   * @return The last added Stack.
   * @throws BadTypeException Thrown if type returned is not a string.
   *
   */
  public String pop() throws BadTypeException {
    return strStack.pop().getString();
  }

  /**
   * Checks if the Stack has any entries or not. 
   *
   * @return boolean for whether Stack is empty, i.e. true for an empty stack.
   */
  public boolean isEmpty() {
    if (strStack.size() > 0) {
      return false;
    }
    return true;

  }

}
