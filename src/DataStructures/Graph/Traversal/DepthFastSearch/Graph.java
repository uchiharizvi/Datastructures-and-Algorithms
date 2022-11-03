package DataStructures.Graph.Traversal.DepthFastSearch;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
    private HashMap<Node, LinkedList<Node>> adjacencyMap;
    private boolean directed;

    public Graph(boolean directed) {
        this.directed = directed;
        adjacencyMap = new HashMap<>();
    }

    public void addEdge(Node source, Node destination) {

        // We make sure that every used node shows up in our .keySet()
        if (!adjacencyMap.keySet().contains(source))
            adjacencyMap.put(source, null);
        if (!adjacencyMap.keySet().contains(destination))
            adjacencyMap.put(destination, null);
        addEdgeHelper(source, destination);
        // If a graph is undirected, we want to add an edge from destination to source as well
        if (!directed) {
            addEdgeHelper(destination, source);
        }
    }

    public void addEdgeHelper(Node a, Node b) {
        LinkedList<Node> tmp = adjacencyMap.get(a);

        if (tmp != null) {
            tmp.remove(b);
        } else tmp = new LinkedList<>();
        tmp.add(b);
        adjacencyMap.put(a, tmp);
    }

    public void printEdges() {
        for (Node node : adjacencyMap.keySet()) {
            System.out.print("The " + node.name + " has an edge towards: ");
            for (Node neighbor : adjacencyMap.get(node)) {
                System.out.print(neighbor.name + " ");
            }
            System.out.println();
        }
    }

    public boolean hasEdge(Node source, Node destination) {
        return adjacencyMap.containsKey(source) && adjacencyMap.get(source).contains(destination);
    }

    public void resetNodesVisited() {
        for (Node node : adjacencyMap.keySet()) {
            node.unvisit();
        }
    }

    public void depthFirstSearch(Node node) {
        node.visit();
        System.out.print(node.name + " ");
        LinkedList<Node> allNeighbors = adjacencyMap.get(node);
        if (allNeighbors == null) return;
        for (Node neighbor : allNeighbors) {
            if (!neighbor.visited) depthFirstSearch(neighbor);
        }
    }
}
