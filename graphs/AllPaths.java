
import java.util.*;

public class AllPaths {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.dest = dest;
            this.src = src;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));

        graph[0].add(new Edge(0, 3));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void path(ArrayList<Edge>[] graph, int src, int dest, String path) {
        if (src == dest) {
            System.out.println(path+dest);
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge curr = graph[src].get(i);
            path(graph, curr.dest, dest, path + src);
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 5;
        int dest = 1;
        
        path(graph, src, dest, "");
    }
}
