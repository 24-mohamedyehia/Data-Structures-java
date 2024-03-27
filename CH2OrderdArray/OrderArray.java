package CH2OrderdArray;

public class OrderArray {
  // private data
  private double arr[];
  private int nElems;

  // constructor
  public OrderArray(int max  ) {
    arr = new double[max];
    nElems = 0;
  }
  
  // get size of array
  public int size(){
    return nElems;
  }

  // method to find item in array using binary search
  public int find(double searchKey){
    int lowerBound = 0;
    int upperBound = nElems - 1;
    int curIn;

    while (true) {
      curIn = (lowerBound + upperBound) / 2;

      if (arr[curIn] == searchKey)
        return curIn;   // found it
      
      else if (lowerBound > upperBound)
        return nElems;  // can't find
      
      else {    // divide range 
        if (arr[curIn] < searchKey) {
          lowerBound = curIn + 1;   // it's in upper half
        }
        else {
          upperBound = curIn - 1;   // it's in lower half
        }
      }
    }
  }

  // method to insert item into an array
  public void insert(double value) {
    int j;
    for (j = 0; j < nElems; j++) {
        if (arr[j] > value) {
            break;
        }
    }

    for (int k = nElems; k > j; k--) {
        arr[k] = arr[k - 1];
    }
    arr[j] = value; // insert it
    nElems++; // increment size of array
  }

  // method to delete item from array
  public void delete(double value){
    int j = find(value);
    
    if (j == nElems) {    // can't find
      System.out.println("Can't find " + value);
    }
    else {
      for(int k = j; k < nElems; k++){
        arr[k] = arr[k+1];
      }
      nElems--;
      System.out.println("Found " + value);
    }
  }

  // method to display array content
  public void display(){ 
    for(int i = 0; i < nElems; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

}
