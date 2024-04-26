package CH4_Stack_and_Queue.Queue;

public class Queue {
  private int queArr[];
  private int front;
  private int rear;
  private int nElemnt = 0;

  public Queue(int size) {
    queArr = new int[size];
    front = -1;
    rear = -1;
  }

  public int size() {
    return nElemnt;
  }

  public boolean isFull() {
    return (front == 0 && rear == queArr.length -1);
  }

  public boolean isEmpty() {
    return (front == -1);
  }


  public void enqueue(int value) {
    if (isFull()) System.out.println("Queue is full");
    
    else {
      if (front == -1) {
        front = 0;
      }
      ++nElemnt;
      ++rear;
      queArr[rear] = value;
  }
  }


  public int dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    } 
    int temp = queArr[front];
    if (front == rear) {
      front = -1;
      rear = -1;
      nElemnt = 0;
    }
    else {
      ++front;
      --nElemnt;
    }
    return temp;
  }

  public int peekFront() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }
    return queArr[front];
  }


  public int peekRear() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }
    return queArr[rear];
  }

  public void display(){
    if (isEmpty()) {
      System.out.println("Queue is Empty");
    }
    else {
      for(int i = front; i <= rear; i++){
        System.out.print(queArr[i] + " ");
      }
      System.out.println();
    }
  }

}
