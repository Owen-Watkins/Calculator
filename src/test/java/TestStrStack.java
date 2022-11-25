import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStrStack {
  StrStack strStack;

  // Creates a new strStack object before each test.
  @BeforeEach
  void setup() {
    strStack = new StrStack();
  }

  // Test 1, tests size of strStack object.
  @Test
  public void testSize() {
    assertEquals(strStack.size(), 0);
  }

  // Test 2, tests push works with strStack object.
  @Test
  public void testPush() {
    strStack.push("TEST");
    assertEquals(strStack.size(), 1);
  }

  // Test 3, tests pop works with strStack object.
  @Test
  public void testPop() throws BadTypeException {
    strStack.push("TEST");
    strStack.pop();
    assertEquals(strStack.size(), 0);

  }

  // Test 4, tests if IsEmpty() method works with an empty strStack.
  @Test
  public void testEmptyStack() {
    assertEquals(strStack.isEmpty(), true);

  }

  // Test 5, tests if IsEmpty() method works with an non-empty strStack.
  @Test
  public void testNonEmptyStack() {
    strStack.push("123 TEST");
    assertEquals(strStack.isEmpty(), false);
  }

}
