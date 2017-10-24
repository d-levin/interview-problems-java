package algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackTests {

  @Test
  public void shouldBeEmpty() {
    Stack s = new Stack();
    assertTrue(s.isEmpty());
  }

  @Test
  public void shouldNotBeEmpty() {
    Stack s = new Stack();
    s.push(1);
    assertFalse(s.isEmpty());
  }

  @Test
  public void shouldContain() {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(5);
    s.push(10);
    assertTrue(s.contains(1));
    assertTrue(s.contains(2));
    assertTrue(s.contains(5));
    assertTrue(s.contains(10));
  }

  @Test
  public void shouldNotContain() {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(5);
    s.push(10);
    assertFalse(s.contains(100));
    assertFalse(s.contains(20));
    assertFalse(s.contains(50));
    assertFalse(s.contains(101));

    s = new Stack();
    assertFalse(s.contains(1));
  }

  @Test
  public void shouldPeek() {
    Stack s = new Stack();
    s.push(1);
    s.push(5);
    s.push(10);
    assertEquals(10, (int) s.peek());
    assertFalse(s.isEmpty());

    s = new Stack();
    s.push(5);
    assertEquals(5, (int) s.peek());
    assertFalse(s.isEmpty());

    s = new Stack();
    assertEquals(null, (Integer) s.peek());
  }

  @Test
  public void shouldPop() {
    Stack s = new Stack();
    s.push(1);
    s.push(5);
    s.push(10);
    assertEquals(10, (int) s.pop());
    assertFalse(s.isEmpty());

    assertEquals(5, (int) s.pop());
    assertFalse(s.isEmpty());

    assertEquals(1, (int) s.pop());
    assertTrue(s.isEmpty());

    assertEquals(null, (Integer) s.pop());
  }

  @Test
  public void shouldResizeCorrectly() {
    Stack s = new Stack();
    s.push(2);
    s.push(3);
    s.push(5);
    s.push(8);

    assertFalse(s.isEmpty());
    assertEquals(8, (int) s.peek());
    assertTrue(s.contains(2));
    assertTrue(s.contains(3));
    assertTrue(s.contains(5));
    assertTrue(s.contains(8));
    assertEquals(8, (int) s.pop());
    assertEquals(5, (int) s.pop());

    s.push(15);
    s.push(20);

    assertEquals(20, (int) s.pop());
    assertEquals(15, (int) s.peek());
    assertEquals(15, (int) s.pop());
    assertEquals(3, (int) s.pop());
    assertEquals(2, (int) s.pop());
    assertTrue(s.isEmpty());
  }

}
