package DataStructures.LinkedList.Operations.Singly;

public class LinkedList {
    Node head;

    /**
     * Push in front of list
     */
    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    /**
     * Add after a node
     **/
    public void insertAfter(Node previousNode, int data) {
        if (previousNode == null) return;
        Node node = new Node(data);
        node.next = previousNode.next;
        previousNode.next = node;
    }

    /**
     * Add Node at the end
     **/
    public void append(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        node.next = null;
        Node last = head;
        while (last.next != null) last = last.next;
        last.next = node;
        return;
    }

    public void deleteNodeAtPosition(int position) {
        //if list is empty
        if (head == null) return;
        Node temp = head;
        //if head is to be removed
        if (position == 0) {
            head = temp.next;
            return;
        }
        //Find prev node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++) temp = temp.next;
        if (temp == null || temp.next == null) return;
        Node next = temp.next.next;
        temp.next = next;
    }

    public void deleteList() {
        head = null;
    }

    public void deleteNode(int data) {
        Node temp = head, previous = null;
        //IF head is to be deleted
        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }
        //Traverse through the linked list
        while (temp != null && temp.data != data) {
            previous = temp;
            temp = temp.next;
        }
        if (temp == null) return;//if data not part of list
        previous.next = temp.next;//delete/unlink node
    }

    public boolean search(Node head, int data) {

        Node current = head;
        while (current != null) {
            if (current.data == data) return true;
            current = current.next;
        }
        return false;
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
