package DataStructures.Graph.BreadthFastSearch;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
    private HashMap<Node, LinkedList<Node>> adjancyMap;
    private boolean directed;

    public Graph(boolean directed) {
        this.directed = directed;
        adjancyMap = new HashMap<>();
    }

    public void addEdge(Node source, Node destination) {
        if (!adjancyMap.keySet().contains(source)) adjancyMap.put(source, null);
        if (!adjancyMap.keySet().contains(destination)) adjancyMap.put(destination, null);
        addEdgeHelper(source, destination);
        if (!directed) {
            addEdgeHelper(destination, source);
        }
    }

    private void addEdgeHelper(Node a, Node b) {
        LinkedList<Node> tmp = adjancyMap.get(a);
        if (tmp != null) tmp.remove(b);
        else tmp = new LinkedList<>();
        tmp.add(b);
        adjancyMap.put(a, tmp);
    }

    public void printEdges() {
        for (Node node : adjancyMap.keySet()) {
            System.out.println("The " + node.name + "has edge towards: ");
            for (Node neighbour : adjancyMap.get(node)) {
                System.out.println(neighbour.name + " ");
            }
            System.out.println();
        }
    }

    public boolean hasEdge(Node source, Node destination) {
        return adjancyMap.containsKey(source) && adjancyMap.get(source).contains(destination);
    }

    public void resetNodesVisited() {
        for (Node node : adjancyMap.keySet()) {
            node.unvisit();
        }
    }

    public void breadthFirstSearch(Node node) {
        if (node == null) return;
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node currentFirst = queue.removeFirst();
            if (currentFirst.visited) continue;

            currentFirst.visit();
            System.out.println(currentFirst.name + " ");
            LinkedList<Node> allNeighbours = adjancyMap.get(currentFirst);
            if (allNeighbours == null) continue;
            for (Node neighbour : allNeighbours) {
                if (!neighbour.visited) queue.add(neighbour);
            }
        }
        System.out.println();
    }
}
