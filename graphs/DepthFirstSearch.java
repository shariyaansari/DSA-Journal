package graphs;

import java.util.ArrayList;

public class DepthFirstSearch {
    static class Edge {

        int src;
        int destination;
        int weight;

        Edge(int s, int d, int w) {
            this.src = s;
            this.destination = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        // 0th vertex
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 5));
        // 1st vertex 
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3, 1));
        // 2nd vertex
        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 4, 2));
        // 3rd vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        // 4th vertex
        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 2));
        // 5th
        graph[5].add(new Edge(5, 3, 2));
        graph[5].add(new Edge(5, 4, 2));
        graph[5].add(new Edge(5, 6, 2));

        // 6th
        graph[6].add(new Edge(6, 5, 2));
    }

    // O(V+E)
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.println(curr);
        visited[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.destination]){
                dfs(graph, e.destination, visited);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[7];
        for (int i = 0; i < 7; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        boolean[] visited = new boolean[7];
        dfs(graph,0, visited);
    }
}
