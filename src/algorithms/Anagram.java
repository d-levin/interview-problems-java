package algorithms;

public class Anagram {

  public static boolean isAsciiAnagram(String a, String b) {
    if (a == null || b == null) {
      return false;
    } else if (a != null && b != null && (a.length() != b.length())) {
      return false;
    }

    final int ASCII = 127;
    int[] characters = new int[ASCII + 1];
    for (int i = 0; i < a.length(); i++) {
      characters[a.charAt(i)]++;
    }

    for (int i = 0; i < b.length(); i++) {
      characters[b.charAt(i)]--;
    }

    for (int i = 0; i < characters.length; i++) {
      if (characters[i] != 0) {
        return false;
      }
    }

    return true;
  }

}
