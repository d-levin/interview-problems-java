package algorithms;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FibonacciTests {

  private Fibonacci fibonacci;

  @Before
  public void setUp() {
    this.fibonacci = new Fibonacci();
  }

  @Test
  public void computeRecursive_givenNonNegativeInteger_shouldComputeCorrectly() {
    assertEquals(fibonacci.computeRecursive(0), 0);
    assertEquals(fibonacci.computeRecursive(1), 1);
    assertEquals(fibonacci.computeRecursive(2), 1);
    assertEquals(fibonacci.computeRecursive(3), 2);
    assertEquals(fibonacci.computeRecursive(4), 3);
    assertEquals(fibonacci.computeRecursive(5), 5);
    assertEquals(fibonacci.computeRecursive(6), 8);
    assertEquals(fibonacci.computeRecursive(7), 13);
    assertEquals(fibonacci.computeRecursive(8), 21);
    assertEquals(fibonacci.computeRecursive(9), 34);
    assertEquals(fibonacci.computeRecursive(10), 55);
    assertEquals(fibonacci.computeRecursive(11), 89);
    assertEquals(fibonacci.computeRecursive(12), 144);
    assertEquals(fibonacci.computeRecursive(13), 233);
    assertEquals(fibonacci.computeRecursive(14), 377);
    assertEquals(fibonacci.computeRecursive(15), 610);
    assertEquals(fibonacci.computeRecursive(16), 987);
    assertEquals(fibonacci.computeRecursive(17), 1597);
    assertEquals(fibonacci.computeRecursive(18), 2584);
    assertEquals(fibonacci.computeRecursive(19), 4181);
    assertEquals(fibonacci.computeRecursive(20), 6765);
    assertEquals(fibonacci.computeRecursive(21), 10946);
    assertEquals(fibonacci.computeRecursive(22), 17711);
    assertEquals(fibonacci.computeRecursive(23), 28657);
    assertEquals(fibonacci.computeRecursive(24), 46368);
  }

  @Test
  public void computeIterative_givenNonNegativeInteger_shouldComputeCorrectly() {
    assertEquals(fibonacci.computeIterative(0), BigInteger.valueOf(0));
    assertEquals(fibonacci.computeIterative(1), BigInteger.valueOf(1));
    assertEquals(fibonacci.computeIterative(2), BigInteger.valueOf(1));
    assertEquals(fibonacci.computeIterative(3), BigInteger.valueOf(2));
    assertEquals(fibonacci.computeIterative(4), BigInteger.valueOf(3));
    assertEquals(fibonacci.computeIterative(5), BigInteger.valueOf(5));
    assertEquals(fibonacci.computeIterative(6), BigInteger.valueOf(8));
    assertEquals(fibonacci.computeIterative(7), BigInteger.valueOf(13));
    assertEquals(fibonacci.computeIterative(8), BigInteger.valueOf(21));
    assertEquals(fibonacci.computeIterative(9), BigInteger.valueOf(34));
    assertEquals(fibonacci.computeIterative(10), BigInteger.valueOf(55));
    assertEquals(fibonacci.computeIterative(11), BigInteger.valueOf(89));
    assertEquals(fibonacci.computeIterative(12), BigInteger.valueOf(144));
    assertEquals(fibonacci.computeIterative(13), BigInteger.valueOf(233));
    assertEquals(fibonacci.computeIterative(14), BigInteger.valueOf(377));
    assertEquals(fibonacci.computeIterative(15), BigInteger.valueOf(610));
    assertEquals(fibonacci.computeIterative(16), BigInteger.valueOf(987));
    assertEquals(fibonacci.computeIterative(17), BigInteger.valueOf(1597));
    assertEquals(fibonacci.computeIterative(18), BigInteger.valueOf(2584));
    assertEquals(fibonacci.computeIterative(19), BigInteger.valueOf(4181));
    assertEquals(fibonacci.computeIterative(20), BigInteger.valueOf(6765));
    assertEquals(fibonacci.computeIterative(21), BigInteger.valueOf(10946));
    assertEquals(fibonacci.computeIterative(22), BigInteger.valueOf(17711));
    assertEquals(fibonacci.computeIterative(23), BigInteger.valueOf(28657));
    assertEquals(fibonacci.computeIterative(24), BigInteger.valueOf(46368));

    assertEquals(fibonacci.computeIterative(50), BigInteger.valueOf(12586269025L));
    assertEquals(fibonacci.computeIterative(60), BigInteger.valueOf(1548008755920L));
    assertEquals(fibonacci.computeIterative(70), BigInteger.valueOf(190392490709135L));
  }

}
