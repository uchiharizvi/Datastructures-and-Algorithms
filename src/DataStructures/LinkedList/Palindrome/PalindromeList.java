package DataStructures.LinkedList.Palindrome;

import sun.reflect.generics.tree.Tree;

/*Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.
* List 1-->2-->1 is a palindrome.
List 1-->2-->3 is not a palindrome.*/
public class PalindromeList {

    public static void main(String[] args) {
        PalindromeList palindrome = new PalindromeList();
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        System.out.println(palindrome.isPalindrome(head));

    }
    private boolean isPalindrome(Node node){
        //reverse the list
        Node orig = node;
        Node reverse = reverse(node);
        if(node.equals(reverse)) return true;
        else return false;
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
        Tree tree
    }
}
