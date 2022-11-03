package DataStructures.Stack.Implementations.LinkedList;

public class Driver {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop() + " popped from stack");
        System.out.println(stack.peek() + " is at Top");
        checkEmpty(stack);
        System.out.println(stack.pop() + " popped from stack");
        checkEmpty(stack);
        System.out.println(stack.pop() + " popped from stack");
        checkEmpty(stack);
    }

    public static void checkEmpty(MyStack stack){
        if(stack.isEmpty()) System.out.println("Stack is empty");
        else System.out.println("Stack is not empty");
    }

}
