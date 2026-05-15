
import java.util.*;


public class TopologicalSort {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void dfs(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfsUtil(graph, i, visited, s);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (!s.isEmpty()) {
            ans.add(s.pop());
        }
        System.out.println(ans);
        
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> s) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfsUtil(graph, e.dest, visited, s);
            }
        }
        s.add(curr);
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        dfs(graph);

    }
}
