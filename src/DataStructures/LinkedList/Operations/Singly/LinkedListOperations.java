package DataStructures.LinkedList.Operations.Singly;

public class LinkedListOperations {
    public Node head; //head of list
    /*A node can be added in three ways
        1) At the front of the linked list
        2) After a given node.
        3) At the end of the linked list.*/

    /* This function is in LinkedList class. Inserts a
       new Node at front of the list. This method is
       defined inside LinkedList class shown above */
    public void prePend(int data) {
        /* 1 & 2: Allocate the Node & Put in the data*/
        Node newNode = new Node(data);
        /* 3. Make next of new Node as head */
        newNode.next = head;
        /* 4. Move the head to point to new Node */
        head = newNode;
        /*Time complexity of insertAtBeginning() is O(1) as it does constant amount of work.*/
    }

    /* This function is in LinkedList class. Inserts a new node after the given prev_node. This method is defined inside LinkedList class shown above */
    public void insertAfter(Node prevNode, int data) {
        /* 1. Check if the given Node is null */
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        /*  2. Allocate the Node &
            3. Put in the data*/
        Node newNode = new Node(data);
        /* 4. Make next of new Node as next of prev_node */
        newNode.next = prevNode.next;
        /* 5. make next of prev_node as new_node */
        prevNode.next = newNode;
    }

    /* Appends a new node at the end.  This method is defined inside LinkedList class shown above */
    public void append(int data) {
        /*  1. Allocate the Node &
            2. Put in the data
            3. Set next as null */
        Node newNode = new Node(data);
        /* 4. If the Linked List is empty, then make the new node as head */
        if (head == null) {
            head = new Node(data);
            return;
        }
        /* 5. This new node is going to be the last node, so make next of it as null */
        newNode.next = null;
        /* 6. Else traverse till the last node */
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        /* 6. Change the next of last node */
        last.next = newNode;
        return;
    }

    /* This function prints contents of linked list starting from the given node */
    public void print() {
        Node node = head;
        while (node != null) {

            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public void reverseList(LinkedListOperations ll) {
        LinkedListOperations ll2 = new LinkedListOperations();
        Node temp;


        while (ll.head.next != null) {
            temp=ll.head;
            ll.head = temp.next;
            ll2.prePend(temp.data);
        }
        System.out.println("New Linked List");
        ll2.print();
        System.out.println("original Linked List");
        ll.print();
    }

    public void reverseListRecursively(LinkedListOperations linkedListOperations){
        Node temp;
        temp = recursiveReverse(head);
        System.out.println(temp);
    }

    private Node recursiveReverse(Node head) {
        Node first;
        if(head==null || head.next==null) return head;
        first=recursiveReverse(head.next);
        head.next.next = head;
        head.next=null;

        return first;
    }

    void deleteNode(int key) {
        //Store head node
        Node temp = head, prev = null;
        //If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        // Search for the key to be deleted, keep track of the previous node as we need to change temp.next
        while (temp.next != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        //If key was not present in linked list
        if (temp == null) return;
        //unlink the node from Linked List
        prev.next = temp.next;
    }

}
