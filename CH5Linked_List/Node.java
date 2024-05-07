

public class Node {

  // data
  public int iData;
  public double dData;

  // Link 
  public Node next;

  public Node(int id, double dd){
    this.iData = id;
    this.dData = dd;
  }

  public void displayNode(){
    System.out.println(iData + " " + dData);
  }

  
}