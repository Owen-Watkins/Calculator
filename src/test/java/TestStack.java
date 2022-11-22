import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack {

  private Stack testStack;

  // created after test 1
  @BeforeEach
  public void setup() {
    testStack = new Stack(); // Creates a new stack called testStack before each test.
  }

  // Test 1, had to create a stack constructor.
  @Test
  public void testStackCreation() {
    testStack = new Stack(); // Tests stacks can be created.
  }

  // Test 2, had to create the size() method, returning 0.
  @Test
  public void testSize() {
    testStack = new Stack();
    assertEquals(testStack.size(), 0); // Tests if a newly made stack has a size of 0.
  }

  // Test 3, had to create push method, which changed size to 1.
  // This also made me create a private variable size.
  @Test
  public void testPush() {
    Entry testEntry = new Entry();
    testStack.push(testEntry);
    assertEquals(testStack.size(), 1); // Tests if the push method increments size by 1.
  }

  // Test 4 had to make method pop, which made size 0.
  @Test
  public void testPop() {
    Entry testEntry = new Entry();
    testStack.push(testEntry);
    testStack.pop();
    assertEquals(testStack.size(), 0); // Tests pop method decrements size by one,given that size>0

  }

  // Test 5 had to edit pop to recognise when trying to pop an empty stack, and
  // throws an exception.
  @Test
  public void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> testStack.pop()); // Exception w/ empty stack
  }

  // Test 6 had to make stack take objects of Entry, and pop returns these Entry
  // objects,returning and removing them.
  @Test
  public void testPushPop() {
    Entry testEntry = new Entry();
    testStack.push(testEntry);
    assertEquals(testStack.pop(), testEntry); // Tests pop returns last entry from stack
    assertEquals(testStack.size(), 0); // Tests that pop did remove the last entry.
  }

  // Test 7 had to fix size() to return size variable, and push and pop to
  // increment/decrement size.
  // Also had to create top to return last made entry without removing it.
  @Test
  void testTop() {
    Entry testEntry = new Entry("TEST");
    Entry testEntry2 = new Entry(3.00f);
    Entry testEntry3 = new Entry(Symbol.PLUS);
    testStack.push(testEntry);
    testStack.push(testEntry2);
    testStack.push(testEntry3);
    assertEquals(testStack.top(), testEntry3); // Tests top returns most recently added entry.
    assertEquals(testStack.size(), 3); // Tests that top has not removed the last entry.
  }

  // Test 8 testing to see if Entry objects can be entered into a stack with
  // values
  // and that the values can be retrieved whilst in the stack
  @Test
  void testGetValue() throws BadTypeException {
    Entry testEntry = new Entry("TEST");
    Entry testEntry2 = new Entry(3.00f);
    Entry testEntry3 = new Entry(Symbol.PLUS);
    testStack.push(testEntry);
    testStack.push(testEntry2);
    testStack.push(testEntry3);
    assertEquals(testStack.top().getSymbol(), Symbol.PLUS); // Top returns most recent entry
  }

  // Test 9
  @Test
  void testGetWrongValue() throws BadTypeException {
    Entry testEntry = new Entry("TEST");
    Entry testEntry2 = new Entry(3.00f);
    Entry testEntry3 = new Entry(Symbol.PLUS);
    testStack.push(testEntry);
    testStack.push(testEntry2);
    testStack.push(testEntry3);
    assertThrows(BadTypeException.class, () -> testStack.top().getValue());
    // Tests that exception is thrown when calling the wrong get method for the
    // entry's variable
  }

}
