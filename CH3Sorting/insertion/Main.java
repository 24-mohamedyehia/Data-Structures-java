package CH3Sorting.insertion;

public class Main {
  public static void main(String[] args) {
      // Create an instance of Insertion class
      Insertion insertion = new Insertion(10);
      
      // Insert elements into the array
      insertion.insert(5);
      insertion.insert(3);
      insertion.insert(8);
      insertion.insert(1);
      
      // Display the array
      insertion.display();
      
      // Sort the array
      insertion.sort();
      
      // Display the sorted array
      System.out.println("After sorting:");
      insertion.display();
      
      // Delete an element
      insertion.delete(3);
      
      // Display the array after deletion
      System.out.println("After deletion:");
      insertion.display();
  }
}
