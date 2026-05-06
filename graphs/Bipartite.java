package graphs;

import java.util.*;

public class Bipartite {

    static class Edge {

        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int[] color = {-1, -1, -1, -1, -1};
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0; // yellow
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (color[e.dest] == -1) {
                            int nextColor = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = nextColor;
                            q.add(e.dest);
                        } else if (color[e.dest] == color[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        // 0th vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        // 1st vertex 
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        // 2nd vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        // 3rd vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        // 4th vertex
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[5];
        for (int i = 0; i < 5; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
