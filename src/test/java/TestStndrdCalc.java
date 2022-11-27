import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStndrdCalc {
  StndrdCalc testCalc;
  OpStack opStack;
  NumStack numStack;

  @BeforeEach
  public void setup() {
    testCalc = new StndrdCalc();
    opStack = new OpStack();
    numStack = new NumStack();
  }

  //Test 1, sees if the object can be made;
  @Test
  public void testEmptyCreation() {
    testCalc = new StndrdCalc();

  }
  
  //Test 2, checks if a non empty object can be made.
  @Test
  public void testNonEmptyStack() {
    opStack.push(Symbol.DIVIDE);
    numStack.push(21);
    testCalc = new StndrdCalc(opStack, numStack);
  }
  
  //Test 3, tests that simple addition can be done with the object.
  @Test
  public void testCalculateAddition() throws BadTypeException {
    numStack.push(12);
    numStack.push(4);
    opStack.push(Symbol.PLUS);
    testCalc = new StndrdCalc(opStack, numStack);
    assertEquals(testCalc.calculate(), 16);
  }
  
  //Test 4, checks if addition can be done multiple times on the same object.
  @Test
  public void testCalculateAddTwice() throws BadTypeException {
    numStack.push(11);
    numStack.push(9);
    opStack.push(Symbol.PLUS);
    testCalc = new StndrdCalc(opStack, numStack);
    assertEquals(testCalc.calculate(), 20);
    numStack.push(21);
    opStack.push(Symbol.PLUS);
    assertEquals(testCalc.calculate(), 41);
    
    
  }
  
  //Test 5, checks if different operators work together.
  @Test
  public void testCalculateDiffOps() throws BadTypeException {
    numStack.push(9);
    numStack.push(11);
    opStack.push(Symbol.MINUS);
    testCalc = new StndrdCalc(opStack, numStack);
    assertEquals(testCalc.calculate(), -2);
    numStack.push(20);
    opStack.push(Symbol.TIMES);
    assertEquals(testCalc.calculate(), -40);
  }
  
  //Test 6, checks if brackets at the front of a calculation work
  @Test
  public void testBracketsFirst() throws BadTypeException {
    numStack.push(5);
    numStack.push(7);
    numStack.push(2);
    numStack.push(2);
    opStack.push(Symbol.LEFT_BRACKET);
    opStack.push(Symbol.PLUS);
    opStack.push(Symbol.RIGHT_BRACKET);
    opStack.push(Symbol.TIMES);
    opStack.push(Symbol.TIMES);
    testCalc = new StndrdCalc(opStack, numStack);
    assertEquals(testCalc.calculate(), 48);
    
  }
  
  //Test 7, checks if brackets at the end of a calculation work.
  @Test
  public void testBracketsSecond() throws BadTypeException {
    numStack.push(2);
    numStack.push(5);
    numStack.push(7);
    numStack.push(3);
    opStack.push(Symbol.TIMES);
    opStack.push(Symbol.LEFT_BRACKET);
    opStack.push(Symbol.PLUS);
    opStack.push(Symbol.TIMES);
    opStack.push(Symbol.RIGHT_BRACKET);
    testCalc = new StndrdCalc(opStack, numStack);
    assertEquals(testCalc.calculate(), 72);
    
  }

}
