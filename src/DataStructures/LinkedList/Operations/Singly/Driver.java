package DataStructures.LinkedList.Operations.Singly;

public class Driver {

    public static void main(String[] args) {

        LinkedListOperations ll = new LinkedListOperations();
        //Insertion Operations (append,prepend,insertAfter)
        ll.append(13);
        ll.prePend(7);
        ll.insertAfter(ll.head,8);
        ll.append(9);
        ll.prePend(1);
        ll.insertAfter(ll.head.next.next,9);
        System.out.println("Linked list :" );
        ll.print();
        //Deletion Operation
        //Deleting a Node
        ll.deleteNode(1);
        System.out.println("Deleting 1");
        System.out.println("After deletion : ");
        ll.print();

        //..Advance Operations
        //..1) Reverse Operation
        //new Linked List
        LinkedListOperations ll2 = new LinkedListOperations();
        ll2.append(4);
        ll2.append(3);
        ll2.append(5);
        ll2.prePend(1);
        System.out.println("New Linked List");
        ll2.print();
        //Reversal Operation
        ll2.reverseList(ll2);
        ll.reverseListRecursively(ll);
    }
}
