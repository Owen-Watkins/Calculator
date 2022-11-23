import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Class that holds every method related to the creation and modification of
 * Stacks.
 *
 * @author zkac249
 *
 */
public class Stack {
  int size = 0;
  private List<Entry> entries = new ArrayList<>();

  /**
   * Creates empty Stack object.
   */
  public Stack() {

  }

  /**
   * Called to return the size of the Stack.
   *
   * @return returns variable size
   * 
   */
  public int size() {
    return size;
  }

  /**
   * Called to add a new entry to the Stack.
   *
   * @param entry the entry that will be added to the stack
   * 
   */

  public void push(Entry entry) {
    size += 1;
    entries.add(entry);
  }

  /**
   * Called to return then remove the last added entry. It also checks and throws
   * and exception if this is called on an empty stack.
   *
   * @return returns the last entry that was added
   */
  public Entry pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    Entry entry = entries.get(size - 1);
    entries.remove(size - 1);
    size -= 1;
    return entry;

  }

  /**
   * Called to return but not remove the most recent Entry.
   *
   * @return returns last added entry
   */
  public Entry top() {
    return entries.get(size - 1);
  }

}
