package DataStructures.LinkedList.Problems.Reverse;

public class LinkedList {
    Node head;

    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public Node reverse(Node head) {
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }
    public void reversePrint(Node head) {
        Node current = head;
        Node previous = null;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        while(head!=null){
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    public void print(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

}
