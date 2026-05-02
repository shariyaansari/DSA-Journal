package graphs;

public class HasPath {
    public static boolean hasPath(int[][] edges, int curr, int destination, boolean[] visited) {
        if (curr == destination) {
            return true;
        }
        visited[curr] = true;

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0]; //source
            int v = edges[i][1]; //destination
            if (u == curr && !visited[v]) {
                if (hasPath(edges, v, destination, visited))
                    return true;
            }
            if (v == curr && !visited[u]) {
                if (hasPath(edges, v, destination, visited))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 0 } };
        int source = 0;
        int destination = 2; 
        boolean[] visited = new boolean[n];
        System.out.println(hasPath(edges, source, destination, visited));
    }    
}
