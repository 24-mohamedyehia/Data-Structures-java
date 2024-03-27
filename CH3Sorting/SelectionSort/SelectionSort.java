package CH3Sorting.SelectionSort;

public class SelectionSort {

  // declare the array and the number of elements
  private int[] arr;
  private int nElems;

  // constructor
  public SelectionSort(int max) {
    arr = new int[max];
    nElems = 0;
  }

  // put an element into the array
  public void insert(int value) {
    arr[nElems] = value;
    nElems++;
  }

  // display array contents
  public void display() {
    for (int i = 0; i < nElems; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // swap method
  public void swap(int one, int two) {
    int temp = arr[one];
    arr[one] = arr[two];
    arr[two] = temp;
  }

  // selection sort ascending method
  public void SelectionSortAscending() {
    int min, out, in;
    
    for(out = 0; out < nElems -1; out++){
      min = out;
      for(in = out+1; in < nElems; in++){
        if (arr[in] < arr[min]) {
          min = in;
        }
      }
      swap(out, min);
    }

  }

}
