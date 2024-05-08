package CH6_Binary_Tree;

public class Main {
  public static void main(String[] args){

    Tree theTree = new Tree();

    theTree.isert(10, 1.0);
    theTree.isert(25, 2.5);
    theTree.isert(5, 3.3);
    theTree.isert(15, 3.3);

    Node found = theTree.find(25);

    if (found != null) {
      System.out.println("Found The Node with value: " + found.intData);
    }
    else {
      System.out.println("Not Find The Node");
    }

    System.out.println("Sum of all nodes integer: " + theTree.sum());

    System.out.println("Cont of all Nodes:" + theTree.count());

    System.out.println("Min value: " + theTree.min().intData);

    System.out.println("Max value: " + theTree.max().intData);

  }
}
