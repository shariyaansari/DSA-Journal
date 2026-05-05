package graphs;

import java.util.*;

public class CycleDetection {

    static class Edge {

        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static boolean dfs(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (dfsUtil(graph, i, -1, visited)) {
                    return true;
                    // cycle exists in one of the parts
                }
            }
        }
        return false;
    }

    public static boolean dfsUtil(ArrayList<Edge>[] graph, int curr, int parent, boolean[] visited) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            // 3 cases for the cycle 
            Edge e = graph[curr].get(i);
            // case 3. neighbour not visited
            if (!visited[e.dest]) {
                if (dfsUtil(graph, e.dest, curr, visited)) {
                    // System.out.println("true");
                    return true;
                }
            }
            // case 2 
            if (visited[e.dest] && e.dest != parent) {
                return true;
            }
            // Case 1 -> do nothing if visited is a parent 
        }
        // System.out.println("false");
        return false;
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        // 0th vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));

        // 1st vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // 2nd vertex
        graph[2].add(new Edge(2, 1));

        // 3rd vertex
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        // 4th vertex
        graph[4].add(new Edge(4, 3));
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[7];
        for (int i = 0; i < 7; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        boolean[] visited = new boolean[graph.length];
        // System.out.println(dfs(graph));
        dfs(graph);
    }
}
