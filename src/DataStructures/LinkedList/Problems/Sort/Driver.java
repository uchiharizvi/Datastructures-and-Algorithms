package DataStructures.LinkedList.Problems.Sort;

public class Driver {

    public static void main(String[] args) {
        LinkedListSorting linkedList = new LinkedListSorting();

        linkedList.push(4);
        linkedList.push(5);
        linkedList.push(9);
        linkedList.push(65);
        System.out.println("Linked List : ");
        linkedList.print();
        linkedList.head = linkedList.mergeSort(linkedList.head);
        System.out.println("Sorted List : ");
        linkedList.print();
    }
}
