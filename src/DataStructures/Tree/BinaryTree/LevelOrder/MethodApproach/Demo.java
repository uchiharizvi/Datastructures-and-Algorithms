package DataStructures.Tree.BinaryTree.LevelOrder.MethodApproach;

public class Demo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();//root is null
        /* Let us create following BST
              3
           /     \
          2      5
         /     /  \
       1      4   6
                  \
                  7
         */
        tree.root = new Node(3);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(6);
        tree.root.right.right.right = new Node(7);
        System.out.println("Level order traversal of binary tree is : ");
        tree.printLevelOrder();
        System.out.println("TC = O(n^2)");

    }


}
