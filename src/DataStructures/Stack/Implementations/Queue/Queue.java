package DataStructures.Stack.Implementations.Queue;

import java.util.Stack;

public class Queue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enQueue(int element) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) s2.push(s1.pop());
        s1.push(element);
        while (!s2.isEmpty()) s1.push(s2.pop());
    }

    public int dequeue() {
        if(s1.isEmpty()){
            System.out.println("Q is empty");
            System.exit(0);
        }
        int x = s1.peek();
        s1.pop();
        return x;
    }

}
