package solutions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BSTTests {

  @Test
  public void shouldCorrectlyTraverseInOrder() {
    BST bst = new BST();
    assertTrue(bst.traverseInOrder().isEmpty());

    bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(2);
    bst.insert(6);
    bst.insert(1);
    bst.insert(13);
    bst.insert(20);
    bst.insert(18);
    bst.insert(21);
    List<Integer> inOrder = bst.traverseInOrder();
    List<Integer> expectedOrder =
        new ArrayList<Integer>(Arrays.asList(1, 2, 5, 6, 10, 13, 15, 18, 20, 21));
    assertEquals(inOrder, expectedOrder);
  }

  @Test
  public void shouldCorrectlyTraversePreOrder() {
    BST bst = new BST();
    assertTrue(bst.traverseInOrder().isEmpty());

    bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(2);
    bst.insert(6);
    bst.insert(1);
    bst.insert(13);
    bst.insert(20);
    bst.insert(18);
    bst.insert(21);
    List<Integer> preOrder = bst.traversePreOrder();
    List<Integer> expectedOrder =
        new ArrayList<Integer>(Arrays.asList(10, 5, 2, 1, 6, 15, 13, 20, 18, 21));
    assertEquals(preOrder, expectedOrder);
  }

  @Test
  public void shouldCorrectlyTraversePostOrder() {
    BST bst = new BST();
    assertTrue(bst.traverseInOrder().isEmpty());

    bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(2);
    bst.insert(6);
    bst.insert(1);
    bst.insert(13);
    bst.insert(20);
    bst.insert(18);
    bst.insert(21);
    List<Integer> postOrder = bst.traversePostOrder();
    List<Integer> expectedOrder =
        new ArrayList<Integer>(Arrays.asList(1, 2, 6, 5, 13, 18, 21, 20, 15, 10));
    assertEquals(postOrder, expectedOrder);
  }

  @Test
  public void shouldHandleDuplicates() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(15);
    List<Integer> inOrder = bst.traverseInOrder();
    List<Integer> expectedOrder = new ArrayList<Integer>(Arrays.asList(5, 10, 15, 15));
    assertEquals(inOrder, expectedOrder);
  }

  @Test
  public void isEmpty() {
    BST bst = new BST();
    assertTrue(bst.isEmpty());
  }

  @Test
  public void isNotEmpty() {
    BST bst = new BST();
    bst.insert(1);
    assertFalse(bst.isEmpty());
  }

  @Test
  public void shouldContain() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    assertTrue(bst.contains(10));
    assertTrue(bst.contains(5));
    assertTrue(bst.contains(15));
  }

  @Test
  public void shouldNotContain() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    assertFalse(bst.contains(100));
    assertFalse(bst.contains(50));
    assertFalse(bst.contains(150));
  }

  @Test
  public void shouldDeleteLeftLeafNode() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(4);
    bst.insert(6);
    bst.insert(20);
    bst.insert(17);

    bst.delete(4);

    List<Integer> inOrder = bst.traverseInOrder();
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(5, 6, 10, 15, 17, 20));
    assertEquals(expected, inOrder);
  }

  @Test
  public void shouldDeleteRightLeafNode() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(4);
    bst.insert(6);
    bst.insert(20);
    bst.insert(17);

    bst.delete(6);

    List<Integer> inOrder = bst.traverseInOrder();
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(4, 5, 10, 15, 17, 20));
    assertEquals(expected, inOrder);
  }

  @Test
  public void shouldDeleteLeftNodeWithChildren() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(4);
    bst.insert(6);
    bst.insert(20);
    bst.insert(17);

    bst.delete(5);

    List<Integer> inOrder = bst.traverseInOrder();
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(4, 6, 10, 15, 17, 20));
    assertEquals(expected, inOrder);
  }

  @Test
  public void shouldDeleteRightNodeWithChildren() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(4);
    bst.insert(6);
    bst.insert(14);
    bst.insert(20);
    bst.insert(17);

    bst.delete(15);

    List<Integer> inOrder = bst.traverseInOrder();
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 10, 14, 17, 20));
    assertEquals(expected, inOrder);
  }

  @Test
  public void shouldDeleteLeftNodeWithLeftChild() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(4);
    bst.insert(2);
    bst.insert(6);
    bst.insert(14);
    bst.insert(20);
    bst.insert(17);

    bst.delete(4);

    List<Integer> inOrder = bst.traverseInOrder();
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 5, 6, 10, 14, 15, 17, 20));
    assertEquals(expected, inOrder);
  }

  @Test
  public void shouldDeleteLeftNodeWithRightChild() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(2);
    bst.insert(3);
    bst.insert(6);
    bst.insert(14);
    bst.insert(20);
    bst.insert(17);

    bst.delete(2);

    List<Integer> inOrder = bst.traverseInOrder();
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 10, 14, 15, 17, 20));
    assertEquals(expected, inOrder);
  }

  @Test
  public void shouldDeleteRightNodeWithLeftChild() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(4);
    bst.insert(2);
    bst.insert(6);
    bst.insert(14);
    bst.insert(20);
    bst.insert(17);

    bst.delete(20);

    List<Integer> inOrder = bst.traverseInOrder();
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 4, 5, 6, 10, 14, 15, 17));
    assertEquals(expected, inOrder);
  }

  @Test
  public void shouldDeleteRightNodeWithRightChild() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(4);
    bst.insert(2);
    bst.insert(6);
    bst.insert(14);
    bst.insert(20);
    bst.insert(21);

    bst.delete(20);

    List<Integer> inOrder = bst.traverseInOrder();
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 4, 5, 6, 10, 14, 15, 21));
    assertEquals(expected, inOrder);
  }

  @Test
  public void shouldDeleteRootNode() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(4);
    bst.insert(2);
    bst.insert(6);
    bst.insert(14);
    bst.insert(20);
    bst.insert(21);

    bst.delete(10);

    List<Integer> inOrder = bst.traverseInOrder();
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 4, 5, 6, 14, 15, 20, 21));
    assertEquals(expected, inOrder);

    bst = new BST();
    bst.insert(10);
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);

    bst.delete(10);

    inOrder = bst.traverseInOrder();
    expected = new ArrayList<Integer>(Arrays.asList(5, 10, 15));
    assertEquals(expected, inOrder);

    bst = new BST();
    bst.insert(10);

    bst.delete(10);

    assert (bst.traverseInOrder().isEmpty());
  }

  @Test
  public void shouldDeleteAllNodes() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);

    bst.delete(10);
    bst.delete(5);
    bst.delete(15);

    assert (bst.traverseInOrder().isEmpty());

    bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(4);
    bst.insert(2);
    bst.insert(6);
    bst.insert(14);
    bst.insert(20);
    bst.insert(21);

    bst.delete(10);
    bst.delete(21);
    bst.delete(14);
    bst.delete(6);
    bst.delete(20);
    bst.delete(4);
    bst.delete(15);
    bst.delete(2);
    bst.delete(5);

    assert (bst.traverseInOrder().isEmpty());

    bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(15);
    bst.insert(4);
    bst.insert(2);
    bst.insert(6);
    bst.insert(14);
    bst.insert(20);
    bst.insert(21);

    bst.delete(10);
    bst.delete(21);
    bst.delete(14);
    bst.delete(6);
    bst.delete(4);
    bst.delete(2);
    bst.delete(15);
    bst.delete(5);
    bst.delete(20);

    assert (bst.traverseInOrder().isEmpty());
  }

  @Test
  public void shouldCorrectlyRemoveConsecutiveRootNodes() {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(5);
    bst.insert(20);
    bst.insert(3);
    bst.insert(7);
    bst.insert(2);
    bst.insert(4);
    bst.insert(6);
    bst.insert(8);
    bst.insert(15);
    bst.insert(30);
    bst.insert(25);
    bst.insert(40);

    List<Integer> inOrder = bst.traverseInOrder();
    List<Integer> expected =
        new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 10, 15, 20, 25, 30, 40));

    assertEquals(expected, inOrder);

    bst.delete(10);

    inOrder = bst.traverseInOrder();
    expected = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 15, 20, 25, 30, 40));

    assertEquals(expected, inOrder);

    bst.delete(15);

    inOrder = bst.traverseInOrder();
    expected = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 20, 25, 30, 40));

    assertEquals(expected, inOrder);

    bst.delete(20);

    inOrder = bst.traverseInOrder();
    expected = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 25, 30, 40));

    assertEquals(expected, inOrder);

    bst.delete(5);

    inOrder = bst.traverseInOrder();
    expected = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 6, 7, 8, 25, 30, 40));

    assertEquals(expected, inOrder);

    bst.delete(2);
    bst.delete(3);
    bst.delete(4);
    bst.delete(6);
    bst.delete(7);
    bst.delete(8);
    bst.delete(25);
    bst.delete(30);
    bst.delete(40);

    assert (bst.traverseInOrder().isEmpty());
  }

}
