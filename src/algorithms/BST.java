package algorithms;

import java.util.ArrayList;
import java.util.List;

public class BST {

  private Node root;

  static class Node {
    Node left;
    Node right;
    int value;

    Node() {}

    Node(int value) {
      this.value = value;
    }
  }

  public void insert(int value) {
    Node node = new Node(value);
    if (root == null) {
      root = node;
      return;
    }

    Node currentNode = root;

    while (currentNode != null) {
      if (node.value > currentNode.value) {
        if (currentNode.right == null) {
          currentNode.right = node;
        } else {
          currentNode = currentNode.right;
        }
      } else {
        if (currentNode.left == null) {
          currentNode.left = node;
        } else {
          currentNode = currentNode.left;
        }
      }

      if (currentNode.left == node || currentNode.right == node) {
        currentNode = null;
      }
    }
  }

  public boolean contains(int value) {
    if (root == null) {
      return false;
    }

    Node current = root;
    while (current != null && current.value != value) {
      if (value > current.value) {
        current = current.right;
      } else {
        current = current.left;
      }
    }

    return current != null && current.value == value;
  }

  // Terrible solution. Refactor.
  public void delete(int value) {
    if (root == null) {
      return;
    }

    Node prev = null;
    Node current = root;

    while (current != null && current.value != value) {
      prev = current;
      if (value > current.value) {
        current = current.right;
      } else {
        current = current.left;
      }
    }

    if (current == null) {
      // Value not found
      return;
    }

    Node dummyRoot = null;
    if (current == root) {
      dummyRoot = new Node();
      prev = dummyRoot;
      prev.left = current;
    }

    if (current.left == null && current.right == null) {
      if (dummyRoot != null) {
        root = null;
        dummyRoot = null;
        prev = null;
      } else if (value > prev.value) {
        prev.right = null;
      } else {
        prev.left = null;
      }
    } else if (current.left != null && current.right == null) {
      if (dummyRoot != null) {
        root = null;
        dummyRoot = null;
        prev = null;
      } else if (value > prev.value) {
        prev.right = current.left;
      } else {
        prev.left = current.left;
      }
    } else if (current.left == null && current.right != null) {
      if (dummyRoot != null) {
        root = null;
        dummyRoot = null;
        prev = null;
      } else if (value > prev.value) {
        prev.right = current.right;
      } else {
        prev.left = current.right;
      }
    } else if (current.left != null && current.right != null) {
      prev = current;
      Node runner = current.right;
      while (runner.left != null) {
        prev = runner;
        runner = runner.left;
      }
      current.value = runner.value;
      if (runner.value < prev.value) {
        prev.left = runner.right;
      } else {
        prev.right = runner.right;
      }
    }
  }

  public boolean isEmpty() {
    return root == null;
  }

  public List<Integer> traversePreOrder() {
    if (root == null) {
      return new ArrayList<Integer>();
    }
    Node node = root;
    return traversePreOrderHelper(node, new ArrayList<Integer>());
  }

  private List<Integer> traversePreOrderHelper(Node node, ArrayList<Integer> numbers) {
    if (node == null) {
      return null;
    }

    numbers.add(node.value);
    traversePreOrderHelper(node.left, numbers);
    traversePreOrderHelper(node.right, numbers);
    return numbers;
  }

  public List<Integer> traverseInOrder() {
    if (root == null) {
      return new ArrayList<Integer>();
    }
    Node node = root;
    return traverseInOrderHelper(node, new ArrayList<Integer>());
  }

  private List<Integer> traverseInOrderHelper(Node node, ArrayList<Integer> numbers) {
    if (node == null) {
      return null;
    }

    traverseInOrderHelper(node.left, numbers);
    numbers.add(node.value);
    traverseInOrderHelper(node.right, numbers);
    return numbers;
  }

  public List<Integer> traversePostOrder() {
    if (root == null) {
      return new ArrayList<Integer>();
    }
    Node node = root;
    return traversePostOrderHelper(node, new ArrayList<Integer>());
  }

  private List<Integer> traversePostOrderHelper(Node node, ArrayList<Integer> numbers) {
    if (node == null) {
      return null;
    }

    traversePostOrderHelper(node.left, numbers);
    traversePostOrderHelper(node.right, numbers);
    numbers.add(node.value);
    return numbers;
  }

}
