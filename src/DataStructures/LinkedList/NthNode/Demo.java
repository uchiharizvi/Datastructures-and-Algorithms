package DataStructures.LinkedList.NthNode;

public class Demo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(4);
        list.push(1);
        list.push(12);
        list.push(1);

        System.out.println("Element at index 3 is " + list.getNth(3));
    }
}
