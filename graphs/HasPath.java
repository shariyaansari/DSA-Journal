package graphs;

import java.util.*;

public class HasPath {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static boolean hasPathdfs(int[][] edges, int curr, int destination, boolean[] visited) {
        if (curr == destination) {
            return true;
        }
        visited[curr] = true;

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0]; //source
            int v = edges[i][1]; //destination
            if (u == curr && !visited[v]) {
                if (hasPathdfs(edges, v, destination, visited))
                    return true;
            }
            if (v == curr && !visited[u]) {
                if (hasPathdfs(edges, v, destination, visited))
                    return true;
            }
        }
        return false;
    }

    public static boolean hasPathbfs(ArrayList<Edge>[] graph, boolean[] visited, int src, int d) {
        Queue<Integer> q = new LinkedList<>();

        q.add(src);
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.println(curr);
            if (!visited[curr]) {
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    if (e.dest == d) {
                        return true;
                    } else {
                        q.add(e.dest);
                    }
                }
            }
        }
        return false;
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
        graph[3].add(new Edge(3, 5));
        // 4th vertex
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        // 5th
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        // 6th
        graph[6].add(new Edge(6, 5));
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[7];
        for (int i = 0; i < 7; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        boolean[] visited = new boolean[7];
        System.out.println(hasPathbfs(graph, visited, 0, 4));
    }
}
