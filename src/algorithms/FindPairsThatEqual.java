package algorithms;

import java.util.HashSet;
import java.util.Set;

public class FindPairsThatEqual {

  public static class Pair {

    private int first;
    private int second;

    public Pair(int first, int second) {
      this.first = first;
      this.second = second;
    }

    public int getFirst() {
      return first;
    }

    public int getSecond() {
      return second;
    }
  }

  public static Pair find(int[] integers, int targetSum) {
    // Array must contain at least 2 elements to form a pair
    if (integers == null || integers.length <= 1) {
      return null;
    }

    Set<Integer> numbers = new HashSet<Integer>();
    for (int i : integers) {
      numbers.add(i);
    }

    for (int i : integers) {
      int diff = targetSum - i;
      if (numbers.contains(diff)) {
        return new Pair(diff, i);
      }
    }

    return null;
  }

}

