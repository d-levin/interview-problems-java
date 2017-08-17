package solutions;

public class ReverseString {

  public static String reverseIteratively(String str) {
    if (str == null || str.equals("")) {
      return null;
    } else if (str.length() == 1) {
      return str;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }

    return sb.toString();
  }

  public static String reverseRecursively(String str) {
    if (str == null || str.equals("")) {
      return null;
    } else if (str.length() == 1) {
      return str;
    }

    return reverseRecursively(str.substring(1)) + str.substring(0, 1);
  }

}
