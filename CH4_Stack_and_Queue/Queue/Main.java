package CH4_Stack_and_Queue.Queue;

public class Main {
  public static void main(String[] args) {
    
    Queue queue = new Queue(5);
    queue.enqueue(20);
    queue.enqueue(40);
    queue.enqueue(60);
    queue.enqueue(80);

    queue.dequeue();
    queue.dequeue();
    queue.dequeue();

    queue.enqueue(100);
    queue.enqueue(120);
    queue.enqueue(140);
    queue.enqueue(160);

    while (!queue.isEmpty()) {
      int n = queue.dequeue();
      System.out.print(n + " ");
    }
    System.out.println();

    System.out.println("is empty: " + queue.isEmpty());
    System.out.println("is full: " + queue.isFull());

    queue.dequeue();

    queue.enqueue(20);
    queue.enqueue(40);
    queue.enqueue(60);
    queue.enqueue(80);
    queue.enqueue(100);

    queue.enqueue(43);
    queue.enqueue(84);

    while (!queue.isEmpty()) {
      int n = queue.dequeue();
      System.out.print(n + " ");
    }
    System.out.println();

  }

  
}
