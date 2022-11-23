package DataStructures.LinkedList.Problems.Sort;


public class LinkedListSorting {
    Node head;

    public Node mergeSort(Node head) {
        //Base Case : if head is null
        if (head == null || head.next == null) {
            return head;
        }
        //get the middle of the list
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        //set the next of middle node to null
        middle.next = null;
        //Apply merge sort on left of list
        Node left = mergeSort(head);
        //Apply merge sort on right list
        Node right = mergeSort(nextOfMiddle);
        //Merge left and right lists
        Node sortedList = sortedMerge(left, right);

        return sortedList;
    }

    private Node sortedMerge(Node left, Node right) {
        Node result = null;
        //Base Cases
        if (left == null) return right;
        if (right == null) return left;
        //Pick either left or right and reoccur
        if (left.data <= right.data) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }

    //Utility method to get the middle of list
    private static Node getMiddle(Node head) {
        if (head == null) return head;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /* This function is in LinkedList class. Inserts a new Node at front of the list. This method is
    defined inside LinkedList class shown above */
    public void push(int data) {
        /* 1 & 2: Allocate the Node & Put in the data*/
        Node newNode = new Node(data);
        /* 3. Make next of new Node as head */
        newNode.next = head;
        /* 4. Move the head to point to new Node */
        head = newNode;
        /*Time complexity of insertAtBeginning() is O(1) as it does constant amount of work.*/
    }

    /* This function prints contents of linked list starting from the given node */
    public void print() {
        Node node = head;
        while (node != null) {

            System.out.println(node.data + " ");
            node = node.next;
        }
    }
}
