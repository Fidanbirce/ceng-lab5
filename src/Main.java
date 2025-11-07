public class Main {
    public static void main (String[] args) {
        Queue q1 = new Queue();
        Queue q2 = new Queue();

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);

        q2.enqueue(10);
        q2.enqueue(20);
        q2.enqueue(30);

        System.out.print("Queue 1: ");
        q1.display();

        System.out.print("Queue 2: ");
        q2.display();

        System.out.println("Are queues equal? " + Queue.areEqual(q1, q2));


        System.out.println("\nAfter removing one element from Queue 2:");
        System.out.println("Are queues equal? " + Queue.areEqual(q1, q2));
        q1.dequeue();
        System.out.print("Queue 1: ");
        q1.display();
        System.out.print("Queue 2: ");
        q2.display();
    }
}
