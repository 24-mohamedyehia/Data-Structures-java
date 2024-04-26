package CH4_Stack_and_Queue.Queue;

public class Main {
  public static void main(String[] args) {
    
    Queue queue = new Queue(5);
    queue.enqueue(20);
    queue.enqueue(40);
    queue.enqueue(60);
    queue.enqueue(80);

    queue.display();


    System.out.println("is empty: " + queue.isEmpty());
    System.out.println("is full: " + queue.isFull());

    queue.enqueue(75);

    System.out.println("is full: " + queue.isFull());

    queue.display();

    System.out.println(queue.dequeue());

    System.out.println(queue.size());

    queue.display();


    System.out.println( "Peek Front: " + queue.peekFront());
    System.out.println( "Peek Rear: " + queue.peekRear());

    System.out.println(queue.size());

    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();

    queue.dequeue();  // Queue is empty


    queue.enqueue(60);
    queue.enqueue(80);
    queue.enqueue(100);
    queue.enqueue(43);
    queue.enqueue(84);

    queue.enqueue(88);   // Queue is full

  }

  
}
