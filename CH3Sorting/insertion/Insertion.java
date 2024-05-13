package CH3Sorting.insertion;
// import java.util.Arrays;

public class Insertion {
    private int[] arr;
    private int size;
    
    public Insertion(int capacity) {
        arr = new int[capacity];
        size = 0;
    }
    
    public void insert(int element) {
        if (size < arr.length) {
            arr[size] = element;
            size++;
        } else {
            System.out.println("Array is full. Cannot insert element.");
        }
    }
    
    public void display() {
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public void sort() {
        for (int i = 1; i < size; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    public void delete(int element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        } else {
            System.out.println("Element not found in the array. Cannot delete.");
        }
    }
}
