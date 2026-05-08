package graphs;

import java.util.*;

public class ConnectedComponents {
    class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    // main func - mainly to track all the edges
    public static void bfs(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                bfsUtil(graph, visited, i);
                    
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] visited, int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        while (!q.isEmpty()) {
            // int size = q.size();
            int curr = q.remove();
            if (!visited[curr]) {
                visited[curr] = true;
                System.out.println(curr);
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    // DFS code 
    public static void dfs(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfsUtil(graph, i, visited);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.println(curr);
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[curr]) {
                dfsUtil(graph, e.dest, visited);
            }
        }
    }
    public static void main(String[] args) {
        
    }    
}
