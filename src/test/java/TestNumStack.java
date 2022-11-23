import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestNumStack {
  NumStack numStack;

  // Creates a new NumStack object before each test.
  @BeforeEach
  void setup() {
    numStack = new NumStack();
  }

  // Test 1, tests size of NumStack object.
  @Test
  public void testSize() {
    assertEquals(numStack.size(), 0);
  }

  // Test 2, tests push works with NumStack object.
  @Test
  public void testPush() {
    numStack.push(1);
    assertEquals(numStack.size(), 1);
  }

  // Test 3, tests pop works with NumStack object.
  @Test
  public void testPop() throws BadTypeException {
    numStack.push(1);
    numStack.pop();
    assertEquals(numStack.size(), 0);

  }

  // Test 4, tests if IsEmpty() method works with an empty NumStack.
  @Test
  public void testEmptyStack() {
    assertEquals(numStack.isEmpty(), true);

  }

  // Test 5, tests if IsEmpty() method works with an non-empty NumStack.
  @Test
  public void testNonEmptyStack() {
    numStack.push(1);
    assertEquals(numStack.isEmpty(), false);
  }

}
