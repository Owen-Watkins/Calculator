import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOpStack {
  OpStack opStack;

  // Creates a new opStack object before each test.
  @BeforeEach
  void setup() {
    opStack = new OpStack();
  }

  // Test 1, tests size of opStack object.
  @Test
  public void testSize() {
    assertEquals(opStack.size(), 0);
  }

  // Test 2, tests push works with opStack object.
  @Test
  public void testPush() {
    opStack.push(Symbol.PLUS);
    assertEquals(opStack.size(), 1);
  }

  // Test 3, tests pop works with opStack object.
  @Test
  public void testPop() throws BadTypeException {
    opStack.push(Symbol.TIMES);
    opStack.pop();
    assertEquals(opStack.size(), 0);

  }

  // Test 4, tests if IsEmpty() method works with an empty opStack.
  @Test
  public void testEmptyStack() {
    assertEquals(opStack.isEmpty(), true);

  }

  // Test 5, tests if IsEmpty() method works with an non-empty opStack.
  @Test
  public void testNonEmptyStack() {
    opStack.push(Symbol.DIVIDE);
    assertEquals(opStack.isEmpty(), false);
  }

}
