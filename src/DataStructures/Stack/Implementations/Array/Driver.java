package DataStructures.Stack.Implementations.Array;

public class Driver {
    public static void main(String[] args) {
        MyStack stack = new MyStack();//LIFO Operation
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " Popped from Stack");
        System.out.println("Top of Stack : " +stack.peek());
        System.out.println("Is Empty : " + stack.isEmpty());
        System.out.println(stack.pop() + " Popped from Stack");
        System.out.println(stack.pop() + " Popped from Stack");
        System.out.println("Top of Stack : " +stack.peek());
        System.out.println("Is Empty : " + stack.isEmpty());
    }
}
