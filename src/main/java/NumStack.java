/**
 * This is the class for NumStack.
 *
 * @author Owen
 *
 */
public class NumStack {
  Stack numStack = new Stack();
  float size;

  /**
   * Finds size of NumStack object by returning value from size() method of Stack
   * class.
   *
   * @return float value representing size of stack
   */
  public float size() {
    return numStack.size();
  }

  /**
   * Pushes an Entry with float value into the stack.
   *
   * @param i Value to be added as entry into stack.
   */
  public void push(float i) {
    Entry entry = new Entry(i);
    numStack.push(entry);

  }

  /**
   * Pops last added entry into the Stack.
   *
   * @return The last added Stack.
   * @throws BadTypeException Thrown if type returned is not float.
   *
   */
  public float pop() throws BadTypeException {
    return numStack.pop().getValue();
  }

  /**
   * Checks if the Stack has any entries or not. 
   *
   * @return boolean for whether Stack is empty, i.e. true for an empty stack.
   */
  public boolean isEmpty() {
    if (numStack.size() > 0) {
      return false;
    }
    return true;

  }

}
