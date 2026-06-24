
import java.util.*;

public class DijkstaraAlgo {
    
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Distance implements Comparable<Distance>{
        int Node;
        int dist = Integer.MAX_VALUE;

        Distance(int Node, int dist) {
            this.Node = Node;
            this.dist = dist;
        }

        @Override
        public int compareTo(Distance d2){
            return this.dist - d2.dist;   //path based sorting fot the pairs
        }
    }
    
    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }
    
    public static void getShortestPath(ArrayList<Edge>[] graph, int src) {

        int[] dist = new int[graph.length];
        
        for(int i = 0; i < graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;   // +infinity
            }
        }

        PriorityQueue<Distance> pq = new PriorityQueue<>();

        pq.add(new Distance(src, 0));

        boolean[] visited = new boolean[graph.length];

        while (!pq.isEmpty()) {
        
            Distance curr = pq.remove();
        
            if (!visited[curr.Node]) {
                visited[curr.Node] = true;
        
                for (int i = 0; i < graph[curr.Node].size(); i++) {
        
                    Edge e = graph[curr.Node].get(i);

                    int u = e.src;
                    int v = e.dest;

                    if (dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Distance(v, dist[v]));
                        
                    }   
                }
            }
        }
        // print all distances 
        for (int i = 0; i < dist.length; i++) {
            System.out.println(dist[i]);
        }

    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[6];
        createGraph(graph);
        getShortestPath(graph, 0);        
    }

}
