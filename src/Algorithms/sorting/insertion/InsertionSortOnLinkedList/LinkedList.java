package Algorithms.sorting.insertion.InsertionSortOnLinkedList;

public class LinkedList {
    Node head;
    Node sorted;

    void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    void print(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    void sort(Node head) {
        sorted = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            sortedInsert(curr);
            curr = next;
        }
        head = sorted;
    }

    void sortedInsert(Node node) {
        if (sorted == null || sorted.data >= node.data) {
            node.next = sorted;
            sorted = node;
        } else {
            Node current = sorted;
            /* Locate the node before the point of insertion */
            while (current.next != null && current.next.data < node.data) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
    }
}
