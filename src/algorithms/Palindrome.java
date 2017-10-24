package algorithms;

public class Palindrome {

  // Case sensitive
  // Alphabetical characters only
  public static boolean isPalindrome(String str) {
    if (str == null) {
      return false;
    }

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(str.length() - i - 1) != str.charAt(i)) {
        return false;
      }
    }

    return true;
  }

}
