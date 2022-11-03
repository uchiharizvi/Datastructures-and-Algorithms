package DataStructures.LinkedList.Reverse;

public class Demo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        System.out.println("Linked List : ");
        list.print(list.head);
        System.out.println("Reverse List : ");
        list.reversePrint(list.head);
        list.head = list.reverse(list.head);
        list.print(list.head);

    }
}
