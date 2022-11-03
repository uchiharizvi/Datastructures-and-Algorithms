package Algorithms.Sorting.InsertionSort.InsertionSortOnLinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(5);
        list.push(20);
        list.push(4);
        list.push(3);
        list.push(30);
        System.out.println("Linked List before Sorting..");
        list.print(list.head);
        list.sort(list.head);
        System.out.println("\nDataStructures.LinkedList After sorting");
        list.print(list.head);

    }
}
