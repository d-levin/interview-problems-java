package solutions;

import org.junit.Test;

public class MostFrequentIntegerTests {

  @Test
  public void shouldGetMostFrequentIntegerUsingMap() {
    int[] integers = new int[] {5, 10, 1, 1, 2, 5, 5};
    assert (5 == MostFrequentInteger.getUsingMap(integers));

    integers = new int[] {1, 2, 2};
    assert (2 == MostFrequentInteger.getUsingMap(integers));

    integers = new int[] {1};
    assert (1 == MostFrequentInteger.getUsingMap(integers));

    integers = new int[] {1, 1, 1};
    assert (1 == MostFrequentInteger.getUsingMap(integers));
  }

  @Test
  public void shouldReturnNullUsingMap() {
    assert (null == MostFrequentInteger.getUsingMap(new int[] {}));
    assert (null == MostFrequentInteger.getUsingMap(null));
  }

  @Test
  public void shouldGetMostFrequentIntegerUsingArray() {
    int[] integers = new int[] {5, 10, 1, 1, 2, 5, 5};
    assert (5 == MostFrequentInteger.getUsingArray(integers));

    integers = new int[] {1, 2, 2};
    assert (2 == MostFrequentInteger.getUsingArray(integers));

    integers = new int[] {1};
    assert (1 == MostFrequentInteger.getUsingArray(integers));

    integers = new int[] {1, 1, 1};
    assert (1 == MostFrequentInteger.getUsingArray(integers));
  }

  @Test
  public void shouldReturnNullUsingArray() {
    assert (null == MostFrequentInteger.getUsingArray(new int[] {}));
    assert (null == MostFrequentInteger.getUsingArray(null));
  }

}
