package solutions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindomeTests {

  @Test
  public void isPalindrome() {
    assertTrue(Palindrome.isPalindrome("hah"));
    assertTrue(Palindrome.isPalindrome(""));
    assertTrue(Palindrome.isPalindrome("ana"));
    assertTrue(Palindrome.isPalindrome("anana"));
    assertTrue(Palindrome.isPalindrome("aibohphobia"));
    assertTrue(Palindrome.isPalindrome("amoreroma"));
  }

  @Test
  public void isNotPalindrome() {
    assertFalse(Palindrome.isPalindrome("haha"));
    assertFalse(Palindrome.isPalindrome(null));
    assertFalse(Palindrome.isPalindrome("anaa"));
    assertFalse(Palindrome.isPalindrome("ananab"));
    assertFalse(Palindrome.isPalindrome("ahibohphobia"));
    assertFalse(Palindrome.isPalindrome("amozreroma"));
  }

}
