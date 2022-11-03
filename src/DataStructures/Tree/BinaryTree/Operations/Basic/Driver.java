package DataStructures.Tree.BinaryTree.Operations.Basic;

public class Driver {

    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        //create node
        bTree.root = new Node(1);
         /* following is the tree after above statement

              1
            /   \
          null  null     */
         bTree.root.left = new Node(2);
        bTree.root.right = new Node(3);
        /* 2 and 3 become left and right children of 1
               1
             /   \
            2      3
          /    \    /  \
        null null null null  */
        bTree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */

    }
}
