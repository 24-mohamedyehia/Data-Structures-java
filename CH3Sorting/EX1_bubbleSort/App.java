
/**
 * Creates an ArrayBub object with the given initial capacity, inserts elements, 
 * displays the initial contents, bubble sorts the array, and displays the sorted contents.
 */

public class App {
  public static void main(String[] args) {

    // create an array of 10 elements
    ArrayBub arr = new ArrayBub(5);

    // insert elements into the array
    arr.insert(20);
    arr.insert(99);
    arr.insert(45);
    arr.insert(38);
    arr.insert(41);

    // display array contents
    System.out.println("Befor Sorting ");
    arr.display();

    // bubble sort the array
    arr.bubbleSortascending();

    System.out.println("After ascinding Sort");
    arr.display();

    arr.bubbleSortDescinding();

    System.out.println("After Descinding Sort");
    arr.display();

  }
}
