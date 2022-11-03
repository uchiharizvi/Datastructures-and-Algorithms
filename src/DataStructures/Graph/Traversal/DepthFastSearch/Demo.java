package DataStructures.Graph.Traversal.DepthFastSearch;

public class Demo {
    public static void main(String[] args) {
        Graph graph = new Graph(false);
        Node a = new Node(0, "0");
        Node b = new Node(1, "1");
        Node c = new Node(2, "2");
        Node d = new Node(3, "3");
        Node e = new Node(4, "4");


        graph.addEdge(a, b);
        graph.addEdge(a, c);
        graph.addEdge(c, b);
        graph.addEdge(e, d);

        System.out.println("If we were to use our previous DFS method, we would get an incomplete traversal");
        graph.depthFirstSearch(b);
        graph.resetNodesVisited(); // All nodes are marked as visited because of
        // the previous DFS algorithm so we need to
        // mark them all as not visited

        System.out.println();
        System.out.println("Using the modified method visits all nodes of the graph, even if it's unconnected");
        graph.depthFirstSearch(b);
    }
}
