package CH3Sorting.SelectionSort;

public class App {
  public static void main(String[] args) {

    SelectionSort arr = new SelectionSort(10);

    arr.insert(77);
    arr.insert(99);
    arr.insert(44);
    arr.insert(55);
    arr.insert(22);
    arr.insert(88);

    System.out.println("Original array:");;
    arr.display();

    arr.SelectionSortAscending();

    System.out.println("Sorted array ascending:");
    arr.display();

    arr.SelectionSortDescending();

    System.out.println("Sorted array descending:");
    arr.display();

  }
}
