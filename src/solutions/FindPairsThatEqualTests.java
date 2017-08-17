package solutions;

import org.junit.Test;

import solutions.FindPairsThatEqual.Pair;

public class FindPairsThatEqualTests {

  @Test
  public void shouldReturnNull() {
    assert (null == FindPairsThatEqual.find(null, 1));
    assert (null == FindPairsThatEqual.find(new int[] {}, 1));
    assert (null == FindPairsThatEqual.find(new int[] {1}, 1));
  }

  @Test
  public void shouldFindPairThatEquals() {
    int[] integers = new int[] {1, 1};
    int targetSum = 2;
    Pair p = FindPairsThatEqual.find(integers, targetSum);
    assert (p.getFirst() + p.getSecond() == targetSum);

    integers = new int[] {1, 1, 2};
    targetSum = 3;
    p = FindPairsThatEqual.find(integers, targetSum);
    assert (p.getFirst() + p.getSecond() == targetSum);

    integers = new int[] {5, 10, 8, 7, 5, 5, 7, 7};
    targetSum = 15;
    p = FindPairsThatEqual.find(integers, targetSum);
    assert (p.getFirst() + p.getSecond() == targetSum);
  }

  @Test
  public void shouldNotFindPairThatEquals() {
    int[] integers = new int[] {1, 1};
    int targetSum = 3;
    Pair p = FindPairsThatEqual.find(integers, targetSum);
    assert (null == p);

    integers = new int[] {5, 10, 1, 3};
    targetSum = 1;
    p = FindPairsThatEqual.find(integers, targetSum);
    assert (p == null);
  }

}
