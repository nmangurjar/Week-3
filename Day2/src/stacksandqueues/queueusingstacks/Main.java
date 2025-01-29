package stacksandqueues.queueusingstacks;

public class Main {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);

        System.out.println("Number removed :"+queue.dequeue());
        System.out.println("Number peeked :"+queue.peek());
        System.out.println("Number removed :"+queue.dequeue());
        System.out.println("Is queue empty  :"+queue.isEmpty());
        System.out.println("Size of queue  :"+queue.size());




    }
}
