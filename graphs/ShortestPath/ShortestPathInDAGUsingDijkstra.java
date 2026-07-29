
import java.util.*;

class ShortestPathInDAGUsingDijkstra {

    static class Pair {

        int node;
        int wt;

        Pair(int node, int wt) {
            this.node = node;
            this.wt = wt;
        }
    }

    public static void getShortestPath(List<Pair>[] graph, int src, int dest) {
        // * since java's natural ordering is min heap so no need for custom priorities
        // * since we have pair and we need to sort them as per the distance 
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);

        int[] distance = new int[graph.length];
        
        // memoization technique
        int[] parent = new int[graph.length];

        //Initialize distance array  
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        // initialize the src node
        distance[src] = 0;

        // insert in priority queue
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            int dist = pq.peek().wt;
            int currNode = pq.peek().node;
            pq.remove();
            // now traverse all neighbors of the currNode 
            for (int i = 0; i < graph[currNode].size(); i++) {
                Pair neigh = graph[currNode].get(i);
                int currDistance = dist + neigh.wt;

                if (currDistance < distance[neigh.node]) {
                    distance[neigh.node] = currDistance;
                    parent[neigh.node] = currNode;
                    pq.add(new Pair(neigh.node, currDistance));
                }
            }
        }
        for (int i = 0; i < distance.length; i++) {
            // System.out.println(distance[i] + " ");
            System.out.println(parent[i] + " ");
            
        }

        // get the list 
        ArrayList<Integer> ans = new ArrayList<>();
        int node = dest; 
        while(parent[node] != node){
            ans.add(node); 
            node = parent[node];
        }
        ans.add(src);
        Collections.reverse(ans);

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Pair>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected Weighted Graph
        graph[0].add(new Pair(1, 4));
        graph[1].add(new Pair(0, 4));

        graph[0].add(new Pair(2, 1));
        graph[2].add(new Pair(0, 1));

        graph[2].add(new Pair(1, 2));
        graph[1].add(new Pair(2, 2));

        graph[1].add(new Pair(3, 1));
        graph[3].add(new Pair(1, 1));

        graph[2].add(new Pair(3, 5));
        graph[3].add(new Pair(2, 5));

        graph[3].add(new Pair(4, 3));
        graph[4].add(new Pair(3, 3));

        graph[4].add(new Pair(5, 1));
        graph[5].add(new Pair(4, 1));

        graph[2].add(new Pair(5, 8));
        graph[5].add(new Pair(2, 8));

        getShortestPath(graph, 0, 5);
    }
}
