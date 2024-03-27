package CH4_Stack_and_Queue.Stack;

public class Stack {

  // declare the array and the number of elements
  private int stackArray[];
  private int top;

  // constructor
  Stack(int size){
    stackArray = new int[size];
    top = -1;
  }

  // method to check if the stack is empty
  public boolean isEmpty(){
    return (top == -1);
  }

  // method to check if the stack is full
  public boolean isFull(){
    return (top == stackArray.length-1);
  }

  public void push(int value){
    if(isFull()){
      System.out.println("Stack is over flow");
    }
    else{
      stackArray[++top] = value;  // increment top and add value to the stack
    }
  }

  // method to display the stack
  public void diplay(){
    for(int i = 0 ; i <= top; i++){
      System.out.print(stackArray[i] + " ");
    }
    System.out.println();
  }

  // method to pop an element from the stack
  public int pop(){
    if (isEmpty()) {
      System.out.println("Stack is empty");
    }
    return stackArray[top--];
  }

  // method to peek at the top element of the stack
  public int peek(){
    if (isEmpty()) {
      return -1;
    }
    return stackArray[top];
  }
}
