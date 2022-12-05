import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEntry {
  private Entry entryTest;

  @BeforeEach
  public void setup() {
    entryTest = new Entry();
  }

  // Test 1, had to create a constructor for entry.
  @Test
  void testEntryCreation() {
    entryTest = new Entry(); // Tests entries can be made
  }

  // Test 2 had to create new constructor for entry to take Type variable
  // had to create getType method to return Type variable
  // later refactored to have a try block for badtype exceptions.
  @Test
  void testGetType() {
    entryTest = new Entry(Type.NUMBER);
    try {
      assertEquals(entryTest.getType(), Type.NUMBER);
    } catch (BadTypeException e) {
      // do nothing
    }
    // Tests getType method will get the value of Type, given one is assigned
    // through constructor
    // if not assigned through constructor, throws exception
  }

  // Test 3 had to create new constructor for entry to take String variable
  // had to create getString method to return Type variable
  // later refactored to have a try block for badtype exceptions.
  @Test
  void testGetString() {
    entryTest = new Entry("TEST");
    try {
      assertEquals(entryTest.getString(), "TEST");
    } catch (BadTypeException e) {
      // do nothing
    }
    // Tests that the getString method will get the value of String, given one is
    // assigned through
    // constructor
    // if not assigned through constructor, throws exception
  }

  // Test 4 had to create new constructor for entry to take float variable
  // had to create getValue method to return Type variable
  // later refactored to have a try block for badtype exceptions.
  @Test
  void testGetValue() {
    entryTest = new Entry(5.00f);
    try {
      assertEquals(entryTest.getValue(), 5.00f, 0.00f);
    } catch (BadTypeException e) {
      // do nothing
    }
    // Tests getValue method will get the value of Value, given one is assigned
    // through constructor
    // if not assigned through constructor, throws exception
  }

  // Test 5 had to create new constructor for entry to take Symbol variable
  // had to create getSymbol method to return Type variable
  // later refactored to have a try block for badtype exceptions.
  @Test
  void testGetSymbol() {
    entryTest = new Entry(Symbol.PLUS);
    try {
      assertEquals(entryTest.getSymbol(), Symbol.PLUS);
    } catch (BadTypeException e) {
      // do nothing
    }
    // Tests getSymbol method will get the Symbol's value,given one is assigned
    // through constructor
    // if not assigned through constructor, throws exception
  }

  // Test 6 had to create new class for badtype exceptions, extending Exceptions.
  // refactored previous tests and getx methods to throw if this exception occurs
  @Test
  void testGetWrong() {
    entryTest = new Entry("STRING");
    assertThrows(BadTypeException.class, () -> entryTest.getValue());
  }

  // Test 7
  @Test
  void testEquals() throws BadTypeException {
    Entry testEntry = new Entry(5.00f);
    Entry testEntry2 = new Entry(5.00f);
    assertEquals(testEntry.getValue().equals(testEntry2.getValue()), true);
  }

}
