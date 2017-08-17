package solutions;

public class Stack {

  private static final int DEFAULT_SIZE = 2;
  private int location;
  private int[] stack;

  public boolean contains(int value) {
    if (stack == null || location == 0) {
      return false;
    }

    for (int i = 0; i < location; i++) {
      if (stack[i] == value) {
        return true;
      }
    }
    return false;
  }

  public boolean isEmpty() {
    return location == 0;
  }

  public Integer peek() {
    if (stack == null || location <= 0) {
      return null;
    }

    int topOfStack = location - 1;

    return stack[topOfStack];
  }

  public Integer pop() {
    if (stack == null || location <= 0) {
      return null;
    }

    return stack[--location];
  }

  public void push(int value) {
    if (stack == null) {
      stack = new int[DEFAULT_SIZE];
    }

    if (location >= stack.length) {
      resize();
    }

    stack[location++] = value;
  }

  private void resize() {
    int[] largerStack = new int[stack.length * 2];
    for (int i = 0; i < stack.length; i++) {
      largerStack[i] = stack[i];
    }
    stack = largerStack;
  }

}
