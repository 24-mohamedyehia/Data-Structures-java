package CH3Sorting.bubbleSort;
/**
 * Bubble sort implementation.
 * Contains methods to insert values into an array, display the array, 
 * swap two values in the array, and perform a bubble sort on the array.
*/


public class ArrayBub {

  private int[] arr;
  private int nElems;

  // constructor
  public ArrayBub(int max) {
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

  // bubble sort descinding method
  public void bubbleSortDescinding() {

    int out, in, count_compare=0, count_swap=0;

    for(out = nElems -1; out > 0; out--){
      for(in = 0; in < out; in++){
        count_compare++;
        if (arr[in] < arr[in + 1]) {
          swap(in, in + 1);
          count_swap++;
        }
      }
    }
    // System.out.println("Number of comparisons: " + count_compare);
    // System.out.println("Number of swaps: " + count_swap);
  }

  // bubble sort method
  public void bubbleSortascending() {

    int out, in, count_compare=0, count_swap=0;

    for (out = nElems - 1; out > 0; out--) {
      for (in = 0; in < out; in++) {
        count_compare++;
        if (arr[in] > arr[in + 1]) {
          swap(in, in + 1);
          count_swap++;
        }
      }
    }

    // System.out.println("Number of comparisons: " + count_compare);
    // System.out.println("Number of swaps: " + count_swap);
  }
}
