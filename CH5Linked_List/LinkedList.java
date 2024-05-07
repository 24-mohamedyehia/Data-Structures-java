

public class LinkedList {
  
  // this is the first node of the Linked List with type Node
  private Node first;

  // constructor to initialize the first node of the Linked List with null
  public LinkedList(){
    this.first = null;
  }

  // check if the Linked list is Empty or not 
  public boolean isEmpty(){
    return (first == null);
  }

  // method to isert Node from first list
  public void isertFrist(int id, double dd){

    Node newNode = new Node(id, dd);
    newNode.next = first;
    first = newNode;

  }

  // method to delete Node from first list
  public Node deleteFirst(){
    Node temp = first;
    first = first.next;
    // temp.displayNode();
    return temp;
  }

  // method to find the data
  public Node find(int value){
    Node current = first;

    while (current.iData != value) {
      if (current.next == null) {
        return null;
      }
      else {
        current = current.next;
      }
    }

    return current;
  }

  // method to display the Linked List
  public void display(){

    System.out.println("List (first --> last):");
    
    Node current = first;

    while (current != null) {
      current.displayNode();
      current = current.next;
    }
    System.out.println("end ");
  }


  // method to sum of all integers in the Linked List
  public void sumList(){
    Node current = first;
    int sum = 0;

    while (current != null) {
      sum += current.iData;
      current = current.next;
    }

    System.out.println("Sum of all intgers: " + sum);
  }


  // method to count the number of Nodes in the Linked List
  public void CountZeroList(){
    Node current = first;
    int count = 0;

    while (current != null){
      if (current.iData == 0 ) {
        count++;
      }
      current = current.next;
    }
    System.out.println("Number of zeros: " + count);
  }
}
