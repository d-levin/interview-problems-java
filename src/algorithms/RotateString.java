package algorithms;

public class RotateString {

  public static String rotate(String str, int rotation) {
    if (str == null) {
      return null;
    } else if (str.isEmpty()) {
      return str;
    } else if (rotation == 0) {
      return str;
    }

    char[] chars = str.toCharArray();

    boolean negative = rotation < 0;
    rotation = Math.abs(rotation);
    while (rotation > 0) {
      if (!negative) {
        for (int i = chars.length - 1; i > 0; i--) {
          char temp = chars[i - 1];
          chars[i - 1] = chars[i];
          chars[i] = temp;

        }
      } else {
        for (int i = 0; i < chars.length - 1; i++) {
          char temp = chars[i + 1];
          chars[i + 1] = chars[i];
          chars[i] = temp;
        }
      }
      rotation--;
    }

    return String.valueOf(chars);
  }

}
