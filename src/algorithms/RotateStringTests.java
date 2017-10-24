package algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RotateStringTests {

  @Test
  public void shouldRotatePositive() {
    assertEquals("ohell", RotateString.rotate("hello", 1));
    assertEquals("lohel", RotateString.rotate("hello", 2));
    assertEquals("llohe", RotateString.rotate("hello", 3));
    assertEquals("elloh", RotateString.rotate("hello", 4));
    assertEquals("hello", RotateString.rotate("hello", 5));
    assertEquals("hello", RotateString.rotate("hello", 10));
    assertEquals("hello", RotateString.rotate("hello", 15));
  }

  @Test
  public void shouldRotateNegative() {
    assertEquals("elloh", RotateString.rotate("hello", -1));
    assertEquals("llohe", RotateString.rotate("hello", -2));
    assertEquals("lohel", RotateString.rotate("hello", -3));
    assertEquals("ohell", RotateString.rotate("hello", -4));
    assertEquals("hello", RotateString.rotate("hello", -5));
    assertEquals("hello", RotateString.rotate("hello", -10));
    assertEquals("hello", RotateString.rotate("hello", -15));
  }

  @Test
  public void shouldNotRotate() {
    assertEquals(null, RotateString.rotate(null, 1));
    assertEquals("", RotateString.rotate("", 1));
    assertEquals("abc", RotateString.rotate("abc", 0));
  }

}
