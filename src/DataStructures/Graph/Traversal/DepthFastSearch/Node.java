package DataStructures.Graph.Traversal.DepthFastSearch;

public class Node {
    int n;
    String name;
    boolean visited;

    Node(int n, String name) {
        this.n = n;
        this.name = name;
        visited = false;
    }

    void visit(){
        visited = true;
    }

    void unvisit(){
        visited = false;
    }
}
