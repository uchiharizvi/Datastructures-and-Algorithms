package DataStructures.LinkedList.Singly;

public class Demo {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.append(6);
        llist.push(7);
        llist.push(1);
        llist.append(4);
        llist.insertAfter(llist.head.next, 8);
        llist.printList();
        System.out.println("");
        llist.deleteNodeAtPosition(2);
        llist.printList();
        if(llist.search(llist.head,4)) System.out.println("Yes");
    }
}
