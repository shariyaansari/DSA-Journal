// package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NoOfProvince {
    static class Edge{
        int src; 
        int dest; 
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] visited, int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        while (!q.isEmpty()) {
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
    
    public int findCircleNum(int[][] isConnected) {
        ArrayList<Edge>[] graph = new ArrayList[isConnected.length];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Now converting the adjacency matrix to list 
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1) {
                    // if the edge is not self edge then create an edge
                    graph[i].add(new Edge(i, j));
                }
            }
        }
        int count = 0;
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                count++;
                bfsUtil(graph, visited, i);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
