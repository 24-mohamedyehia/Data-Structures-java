package CH6_Binary_Tree;

public class Tree {

  // Data
  private Node root;

  // method to find value on a Tree
  public Node find(int value){
    Node current = root;

    while (current != null) {
      if (current.intData == value) {
          return current;
      } 
      else if (value < current.intData) {
          current = current.leftChild;
      } 
      else {
          current = current.rightChild;
      }
    }
    return null; // Return null if the value is not found in the tree
  }

  // ###############################################################

  // method to isert item on a Tree
  public void isert(int intData, double doubleData){
    Node newNode = new Node(intData, doubleData);

    if (root == null) {
      root = newNode;
    }
    else {
      Node current = root;
      Node parent;

      while (true) {
        parent = current;

        if (intData < current.intData) {
          current = current.leftChild;
          if (current == null) {
            parent.leftChild = newNode;
            return; // Exit the loop after insertion
          }
        }
        else {
          current = current.rightChild;
          if (current == null) {
            parent.rightChild = newNode;
            return; // Exit the loop after insertion
          }
        }
      }
    }
  }

  // ##################################################################

  // first method to sum with recursion
  public int sum(Node root){
    int sum = 0 , sumLeft = 0 , sumRight = 0;

    if (root == null) {
      return 0;
    }
    else {
      sumLeft = sum(root.leftChild);
      sumRight = sum(root.rightChild);
      sum = root.intData + sumLeft + sumRight;
    }
    return sum;
  }

    // second method to sum with iteration
    public int sum(){
      return sum(root);
  }

  // ##################################################################

  // first method to count with recursion
  public int count(Node root){
    if (root == null) {
      return 0;
    }
    else {
      return 1 + count(root.leftChild) + count(root.rightChild);
    }
  }

  // second method to count with iteration
  public int count(){
    return count(root);
  }

  // ################################################################

  // method to return min value on a Tree
  public Node min(){
    if (root == null) {
      return null;
    }
    else {
      Node current = root;
      Node last = current;
  
      while (current != null) {
        last = current;
        current = current.leftChild;
      }
      return last;
    }
  }

  // ################################################################

  // method to return max value on a Tree
  public Node max(){
    if (root == null) {
      return null;
    }
    else {
      Node current = root;
      Node last = current;

      while (current != null) {
        last = current;
        current = current.rightChild;
      }
      return last;
    }
  }







}
