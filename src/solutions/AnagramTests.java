package solutions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramTests {

  @Test
  public void isNotAnagram() {
    assertFalse(Anagram.isAsciiAnagram(null, null));
    assertFalse(Anagram.isAsciiAnagram(null, ""));
    assertFalse(Anagram.isAsciiAnagram("", null));
    assertFalse(Anagram.isAsciiAnagram("a", "b"));
    assertFalse(Anagram.isAsciiAnagram("aa", "b"));
    assertFalse(Anagram.isAsciiAnagram("a", "bb"));
    assertFalse(Anagram.isAsciiAnagram("aa", "bb"));
    assertFalse(Anagram.isAsciiAnagram("abc", "abq"));
  }

  @Test
  public void isAnagram() {
    assertTrue(Anagram.isAsciiAnagram("", ""));
    assertTrue(Anagram.isAsciiAnagram("a", "a"));
    assertTrue(Anagram.isAsciiAnagram("ab", "ba"));
    assertTrue(Anagram.isAsciiAnagram("beat", "beta"));
    assertTrue(Anagram.isAsciiAnagram("sale", "seal"));
    assertTrue(Anagram.isAsciiAnagram("airmen", "marine"));
  }

}
