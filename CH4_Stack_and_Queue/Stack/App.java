package CH4_Stack_and_Queue.Stack;

public class App {
  public static void main(String[] args) {

    // create a stack of 5 integers
    Stack grades = new Stack(5);

    System.out.println("The stack is empty: " + grades.isEmpty());
    
    // add 5 elements to the stack
    grades.push(44);
    grades.push(55);
    grades.push(22);
    grades.push(88);
    grades.push(99);

    System.out.println("The stack is empty: " + grades.isEmpty());

    // display the stack
    grades.diplay();

    // pop an element from the stack and add it to the variable
    int value = grades.pop();

    grades.diplay();

    System.out.println("The value popped from the stack is: " + value);

    System.out.println("The peek value is: " + grades.peek());

    grades.push(8);
    grades.push(10);  // stack is full


  }
}
