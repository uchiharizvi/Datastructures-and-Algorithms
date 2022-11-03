package DataStructures.LinkedList.Problems.NthNode;

public class LinkedList {
    Node head;

    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public int getNth(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) return current.data;
            count++;
            current = current.next;
        }
        assert (false);
        return 0;
    }

}
