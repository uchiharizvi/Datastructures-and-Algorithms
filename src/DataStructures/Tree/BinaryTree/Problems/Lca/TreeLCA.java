package DataStructures.Tree.BinaryTree.Problems.Lca;

import java.util.ArrayList;
import java.util.List;

public class TreeLCA {
    Node root;
    private List<Integer> path1 = new ArrayList<>();
    private List<Integer> path2 = new ArrayList<>();//calculate path



    public int lca(Node root, int v1, int v2) {
        if (!findPath(root, v1, path1) || !findPath(root, v2, path2)) {
            System.out.println((path1.size() > 0) ? "v1 is present" : " v1 is missing");
            System.out.println((path2.size() > 0) ? "v2 is present" : " v2 is missing");
            return -1;
        }
        int i;
        for(i=0;i<path1.size() && i<path2.size(); i++){
            System.out.println(path1.get(i) + " " + path2.get(i));
            if(!path1.get(i).equals(path2.get(i))) break;
        }
        return path1.get(i-1);
    }

    public boolean findPath(Node root, int v, List<Integer> path) {
        if (root == null) return false;
        path.add(root.data);
        if (root.data == v) return true;
        if (root.left != null && findPath(root.left, v, path)) return true;
        if (root.right != null && findPath(root.right, v, path)) return true;
        path.remove(path.size() - 1);
        return false;
    }

}
