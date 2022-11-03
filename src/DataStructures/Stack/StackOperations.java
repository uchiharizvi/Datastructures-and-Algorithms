package DataStructures.Stack;

import java.util.Stack;

public class StackOperations {
    public static void push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) stack.push(i);
    }

    public static void pop(Stack<Integer> stack) {
        System.out.println("Pop Operation:");
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    public static void peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    public static void search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);
        if (pos == -1) System.out.println("Element not found");
        else System.out.println("Element is found at position: " + pos);
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Stack stack1 = new Stack();

        stack1.push(4);
        stack1.push("All");
        stack1.push("Geeks");

        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        System.out.println(stack1);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

    }
}
