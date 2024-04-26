package CH4_Stack_and_Queue.Priority_queue;

public class Main {
    public static void main(String[] args) {

        PriorityQueueCustom prio_queue = new PriorityQueueCustom(5);
        prio_queue.enqueue(20);
        prio_queue.enqueue(40);
        prio_queue.enqueue(60);
        prio_queue.enqueue(80);

        prio_queue.display();

        System.out.println(prio_queue.dequeue());

        prio_queue.display();
    }
}
