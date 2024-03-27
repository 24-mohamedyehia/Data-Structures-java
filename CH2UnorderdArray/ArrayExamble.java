package CH2UnorderdArray;

import java.io.IOException;

// Declaring a class named ArrayExample in the Chapter2Array package
public class ArrayExamble {
    
    // Main method declaration, serves as the entry point of the program
    public static void main(String[] args) throws IOException {
        
        int arr [] = new int[100];      // make array
        int nElems = 0;                 // number of items
        int j;                          // loop counter
        int searchKey;                  // key of item to search for

        // ==================================================
        //#######################
        // insert 10 items
        //########################
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 45;
        arr[3] = 24;
        arr[4] = 44;
        arr[5] = 64;
        arr[6] = 66;
        arr[7] = 55;
        arr[8] = 71;
        arr[9] = 79;

        nElems = 10;
        // =======================================================
        //#######################
        // display items
        //########################
        for(j = 0; j < nElems; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        // =======================================================
        //#######################
        // search for items
        //########################
        // find item with key 66
        // searchKey = 66;
        
        // for(j = 0 ; j < nElems; j++){
        //     if (arr[j] == searchKey) {
        //         break;
        //     }
        // }

        // if (j == nElems) {
        //     System.out.println("Can't find " + searchKey);
        // }
        // else {
        //     System.out.println("Found " + searchKey);
        // }
        // =======================================================
        //#######################
        // Delete item
        //#######################
        searchKey = 55;
        for(j = 0; j < nElems; j++){
            if(arr[j] == searchKey){
                break;
            }
        }

        if(j != nElems){
            for(int k = j ; k < nElems; k++){       // move higher items to down
                arr[k] = arr[k+1];
            }
            nElems--;   // decrement size
        }

        for(j = 0; j < nElems; j++){
            System.out.print(arr[j] + " ");
        }

        System.out.println("\nCount nElems => " + nElems );
        System.out.println("Size of array => " + arr.length);


        
    }
}
