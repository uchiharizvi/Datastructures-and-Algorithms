package DataStructures.Queue.Operations.ArrayImplementation;

public class QueueImplementation {

    int front, rear, size;
    int capacity;
    int array[];

    public QueueImplementation(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity - 1;
        array = new int[this.capacity];
    }

    //Queue is full when size is equal to capacity
    public boolean isFull(QueueImplementation queue) {
        return (queue.size == queue.capacity);
    }

    //Queue is empty when size is zero
    public boolean isEmpty(QueueImplementation queue) {
        return (queue.size == 0);
    }

    public void enqueue(int item) {
        if (isFull(this)) return;
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item + " enqued to queue");
    }

    // Method to remove an item from queue.
    // It changes front and size
    public int dequeue() {
        if (isEmpty(this)) return Integer.MIN_VALUE;
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    //get front of queue
    public int front() {
        if (isEmpty(this)) return Integer.MIN_VALUE;
        return this.array[this.front];
    }

    //get rear of queue
    public int rear() {
        if (isEmpty(this)) return Integer.MIN_VALUE;
        return this.array[this.rear];
    }
}
