package solutions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTests {

  @Test
  public void iterativeShouldReverseString() {
    String str = "abcd";
    String reversed = "dcba";
    assertEquals(reversed, ReverseString.reverseIteratively(str));

    str = "ab";
    reversed = "ba";
    assertEquals(reversed, ReverseString.reverseIteratively(str));
  }

  @Test
  public void iterativeShouldReturnNull() {
    String str = "";
    assertEquals(null, ReverseString.reverseIteratively(str));
    str = null;
    assertEquals(null, ReverseString.reverseIteratively(str));
  }

  @Test
  public void iterativeShouldReturnOriginalString() {
    String str = "a";
    assertEquals(str, ReverseString.reverseIteratively(str));

    str = "bb";
    assertEquals(str, ReverseString.reverseIteratively(str));
  }

  @Test
  public void recursiveShouldReverseString() {
    String str = "abcd";
    String reversed = "dcba";
    assertEquals(reversed, ReverseString.reverseRecursively(str));

    str = "ab";
    reversed = "ba";
    assertEquals(reversed, ReverseString.reverseRecursively(str));
  }

  @Test
  public void recursiveShouldReturnNull() {
    String str = "";
    assertEquals(null, ReverseString.reverseRecursively(str));
    str = null;
    assertEquals(null, ReverseString.reverseRecursively(str));
  }

  @Test
  public void recursiveShouldReturnOriginalString() {
    String str = "a";
    assertEquals(str, ReverseString.reverseRecursively(str));

    str = "bb";
    assertEquals(str, ReverseString.reverseRecursively(str));
  }

}
