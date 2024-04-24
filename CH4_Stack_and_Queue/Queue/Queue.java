package CH4_Stack_and_Queue.Queue;

public class Queue {
  private int queArr[];
  private int maxSize;
  private int front;
  private int rear;
  private int nItems;

  public Queue(int size) {
    maxSize = size;
    queArr = new int[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }

  public int size() {
    return maxSize;
  }

  public void enqueue(int value) {
    if (isFull()) {
      System.out.println("Queue is full");
      return;
    }
    
    rear = (rear + 1) % maxSize; // Move rear pointer circularly
    queArr[rear] = value;
    nItems++;
  }

  public boolean isEmpty() {
    return (nItems == 0);
  }

  public boolean isFull() {
    return (nItems == maxSize);
  }

  public int dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }

    int temp = queArr[front];
    front = (front + 1) % maxSize; // Move front pointer circularly
    nItems--;
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
}
