package algorithms;

import java.math.BigInteger;

public class Fibonacci {
  int computeRecursive(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    return computeRecursive(n - 1) + computeRecursive(n - 2);
  }

  BigInteger computeIterative(int n) {
    if (n == 0) {
      return BigInteger.ZERO;
    }
    if (n == 1) {
      return BigInteger.ONE;
    }

    BigInteger current = BigInteger.ZERO;
    BigInteger prev = BigInteger.ONE;
    BigInteger prevprev = BigInteger.ZERO;
    while (n > 1) {
      current = prev.add(prevprev);
      prevprev = prev;
      prev = current;
      n--;
    }
    return current;
  }
}
