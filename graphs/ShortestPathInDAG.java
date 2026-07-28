
import java.util.*;

class ShortestPathInDAG {

    static class Pair {

        int dest;
        int weight;

        Pair(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    // 1. perform topological sort - TC => O(V+E)
    public static void topoSort(boolean[] visited, List<Pair>[] adjacencyList, Stack<Integer> st, int curr) {
        visited[curr] = true;
        for (int i = 0; i < adjacencyList[curr].size(); i++) {
            Pair p = adjacencyList[curr].get(i);
            if (!visited[p.dest]) {
                topoSort(visited, adjacencyList, st, p.dest);
            }
        }
        st.add(curr);
    }

    // every edge is relaxed once so O(V+E) -> each vertice is popped once and inside I visit all neighbors of the popped edges 
    public static void getDistanceArr(List<Pair>[] adjacencyList, Stack<Integer> st, int[] dist) {
        while (!st.isEmpty()) {
            int curr = st.pop();
            // relaxation step
            if (dist[curr] == Integer.MAX_VALUE) {
                continue;
            }
            for (int i = 0; i < adjacencyList[curr].size(); i++) {
                Pair p = adjacencyList[curr].get(i);
                int currDist = dist[curr] + p.weight;
                if (currDist < dist[p.dest]) {
                    dist[p.dest] = currDist;
                }
            }
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        List<Pair>[] graph = new ArrayList[7];
        for (int i = 0; i < 7; i++) {
            graph[i] = new ArrayList<>();
        }

        boolean[] visited = new boolean[7];
        for (int i = 0; i < 7; i++) {
            if (!visited[i]) {
                topoSort(visited, graph, st, i);
            }
        }
        // 2. make a distance array
        int[] distance = new int[7];
        for (int i = 0; i < 7; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        int src = 6;
        distance[6] = 0;

        // 3. pop each element and visit it's concurrent and update the minimum distance 
        getDistanceArr(graph, st, distance);
    }
}
