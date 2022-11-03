package DataStructures.Queue.Operations.ArrayImplementation;

public class Driver {
    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation(1000);

        //Enque in FIFO
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + "dequeued from queue\n");
        System.out.println("Front Item is " + queue.front());
        System.out.println("Rear Item is " + queue.rear());

    }
}
