package DataStructures.LinkedList.Problems.IntersectionPoint;

public class LinkedListDemo {
    Node head;

    public static void main(String[] args) {
        LinkedListDemo lld = new LinkedListDemo();
        Node head1 = new Node(1);
        lld.append(head1, 2);
        lld.append(head1, 3);
        lld.append(head1, 4);
        lld.append(head1, 5);
        lld.append(head1, 6);
        lld.append(head1, 7);

        Node head2 = new Node(8);
        lld.append(head2, 9);
        lld.append(head2, 5);
        lld.append(head2, 6);
        lld.append(head2, 7);
        lld.print(head1);
        lld.print(head2);
        lld.print(lld.intersection(head1, head2));
    }

    public void append(Node head, int data) {
        Node node = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        node.next = null;
        Node last = head;
        while (last.next != null) last = last.next;
        last.next = node;
    }

    /**
     * Time Complexity: O(m*n), where m and n are number of nodes in two linked list.
     * Space Complexity: O(1), Constant Space is used.
     **/
    public Node intersection(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                // if both Nodes are same
                if (temp == head2) return head2;
                temp = temp.next;
            }
            head2 = head2.next;
        }

        //If intersection is not present between the lists,return NULL.
        return null;
    }

    public void print(Node n) {
        //n = head;
        while (n != null) {
            System.out.print(n.data);
            n = n.next;
            if (n != null) System.out.print("->");
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class LinkedList {
    Node head;

    /**
     * Add in front of list
     */
    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    /**
     * Add at end of list
     */
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
    }

    public void remove() {
    }

    public void peek() {
    }


}
