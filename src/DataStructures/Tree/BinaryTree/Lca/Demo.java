package DataStructures.Tree.BinaryTree.Lca;

public class Demo {
    public static void main(String[] args) {
        TreeLCA treeLCA = new TreeLCA();
        treeLCA.root = new Node(1);
        treeLCA.root.left = new Node(2);
        treeLCA.root.right = new Node(3);
        treeLCA.root.left.left = new Node(4);
        treeLCA.root.left.right = new Node(5);
        treeLCA.root.right.left = new Node(6);
        treeLCA.root.right.right = new Node(7);

        treeLCA.lca(treeLCA.root, 4,5);
    }
}
