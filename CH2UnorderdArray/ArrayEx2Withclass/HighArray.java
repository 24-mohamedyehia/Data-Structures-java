package CH2UnorderdArray.ArrayEx2Withclass;

public class HighArray {

    private int arr[];
    private int nElems;
    

    // Counstructor
    public HighArray(int max){
        arr = new int[max];
        nElems = 0;
    }

    // Linear search
    public boolean find(int searchKey){
        int i;
        for(i = 0; i < nElems ; i++){
            if(arr[i] == searchKey){
                break;
            }
        }

        if(i == nElems){
            return false;
        }
        else {
            return true;
        }
    }

    // put element into array
    public void insert(int value){
        arr[nElems] = value;    // insert it 
        nElems++;               // increment size 
    }

    // Delete items 
    public void delete(int value){

        int i;

        for(i = 0; i < nElems; i++){
            if(arr[i] == value){
                break;
            }
        }

        if(i == nElems){
            System.out.println("Can't find it !!");
        }
        else {
            for(int k = i; k < nElems ; k++){
                arr[k] = arr[k+1];
            }
            nElems--;

            System.out.println("Yes, Deleted :) ");
        }
    }

    public void display(){
        
        for(int i = 0; i < nElems; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
