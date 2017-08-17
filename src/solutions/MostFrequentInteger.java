package solutions;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentInteger {

  public static Integer getUsingMap(int[] integers) {
    if (integers == null || integers.length == 0) {
      return null;
    }

    // <number, count> mapping
    Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
    for (int key : integers) {
      if (counter.containsKey(key)) {
        int count = counter.get(key);
        counter.put(key, ++count);
      } else {
        counter.put(key, 1);
      }
    }

    int mostFrequent = integers[0];
    int highestCount = Integer.MIN_VALUE;
    for (int key : integers) {
      int value = counter.get(key);
      if (value > highestCount) {
        highestCount = value;
        mostFrequent = key;
      }
    }

    return mostFrequent;
  }

  public static Integer getUsingArray(int[] integers) {
    if (integers == null || integers.length == 0) {
      return null;
    }

    int maxValue = Integer.MIN_VALUE;
    for (int i : integers) {
      if (i > maxValue) {
        maxValue = i;
      }
    }

    int[] counter = new int[maxValue + 1];
    for (int i : integers) {
      counter[i]++;
    }

    int mostFrequent = 0;
    int highestCount = Integer.MIN_VALUE;
    for (int i = 0; i < integers.length; i++) {
      int count = counter[integers[i]];
      if (count > highestCount) {
        highestCount = count;
        mostFrequent = integers[i];
      }
    }

    return mostFrequent;
  }

}
