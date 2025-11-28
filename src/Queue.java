public class Queue {
    Node front, rear;
    int size;


    public Queue() {
        front = rear = null;
        size = 0;
    }



    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }



    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;

        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;

        }
        size--;
        return value;
    }



    public static boolean areEqual(Queue q1, Queue q2) {
            if (q1.size != q2.size)
                return false;

            Node n1 = q1.front;
            Node n2 = q2.front;

            while (n1 != null && n2 != null) {
                if (n1.data != n2.data)
                    return false;
                n1 = n1.next;
                n2 = n2.next;
            }
            return true;
        }


    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

