package DataStructures.Tree.BinaryTree.LevelOrder.MethodApproach;

public class BinaryTree {
    Node root;


    public BinaryTree() {root = null;}

    public void printLevelOrder(){
        int h = height(root);
        for(int i=1;i<=h;i++){
            printCurrentLevel(root,i);
        }
    }

    private void printCurrentLevel(Node root, int level) {
        if (root == null) return;
        if(level == 1) System.out.println(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }
    private int height(Node root){
        if(root == null) return 0;
        else{
            int lHeight = height(root.left);
            int rHeight = height(root.right);

            if(lHeight>rHeight) return (lHeight + 1);
            else return (rHeight + 1);
        }
    }
}
