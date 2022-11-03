package DataStructures.LinkedList.Problems.Length;

public class LinkedList {
    Node head;

    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
