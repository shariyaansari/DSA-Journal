// package graphs; 

import java.util.ArrayList;

class CycleInDirected {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createDirectedGraph(ArrayList<Edge>[] graph) {
        graph[1].add(new Edge(1, 0));
        graph[0].add(new Edge(3, 0));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(2, 3));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length]; 
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (detectCycleUtil(graph, i, visited, stack)) {
                    return true;
                }
            }
        }    
        return false;
    }


    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, boolean[] stack) {
        visited[curr] = true;
        stack[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (stack[e.dest] == true) {
                return true;
            }
            if (!visited[e.dest]) {
                if (detectCycleUtil(graph, e.dest, visited, stack)) {
                    return true;
                }
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge>[] graphs = new ArrayList[4];
        for (int i = 0; i < 4; i++) {
            graphs[i] = new ArrayList<>();
        }
        createDirectedGraph(graphs);
        System.out.println(detectCycle(graphs));
        
    }
}