
import java.util.*;

public class BellmanFord2 {

    static class Edge {

        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph) {
        
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));

        graph.add(new Edge(1, 2, -4));

        graph.add(new Edge(2, 3, 2));

        graph.add(new Edge(3, 4, 4));

        graph.add(new Edge(4, 1, -1));
    }

    public static void BellmanFordApproach1(ArrayList<Edge> graph, int src, int vertice) {
        int[] dist = new int[vertice];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        // O(V) -> outer loop 
        // Total tc -> O(V) * O(E) 
        for (int i = 0; i < vertice-1; i++) {
            // O(E) -> both loop getting the edge

            for (int j = 0; j < graph.size(); j++) {

                Edge e = graph.get(j);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                // relaxation step
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }

        }
        for (int i = 0; i < dist.length; i++) {
            System.out.println(dist[i]);
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);
        BellmanFordApproach1(graph, 0, 5);

    }
}
