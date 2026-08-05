
import java.util.*;

public class DetectNegativeCycle {


    public static void BellmanFordApproach1(List<List<Integer>> edges, int src, int V) {
         int[] dist = new int[V];

        for(int i = 0; i < V; i++) dist[i] = (int) (1e8);
        dist[0] = 0; 

        // relaxation V-1 times for all the edges 
        for(int i = 0; i < V-1; i++){
            // iterate through the list of all the edges !!! 
            for(List<Integer> Edge: edges){
                int u = Edge.get(0); 
                int v = Edge.get(1); 
                int wt = Edge.get(2);

                // perform relaxation if the node has less than the current value 
                if(dist[u] != 1e8 && dist[u] + wt < dist[v]){
                    // update the distance
                    dist[v] = dist[u] + wt;
                }
            }
        }
        // to detect the cycle rujn Nth iteration and if the value changes in that iteration then cycle exists
        boolean distanceChanged = false;
        for(List<Integer> Edge: edges){
                int u = Edge.get(0); 
                int v = Edge.get(1); 
                int wt = Edge.get(2);

                // perform relaxation if the node has less than the current value 
                if(dist[u] != 1e8 && dist[u] + wt < dist[v]){
                    // update the distance
                    distanceChanged = true;
                    dist[v] = dist[u] + wt;
                }
            }

        // just to print the nodes
        for(int i = 0; i < dist.length; i++){
            System.out.println(dist[i]);
        }

        // based on the flag value return the print statement!!
        if(!distanceChanged) System.out.println("Graph doesn't have negative cycle");
        else System.out.println("Graph have negative cycle");
    }

    public static void main(String[] args) {
        List<List<Integer>> edges = new ArrayList<>(); 
        int V = 6;
        BellmanFordApproach1(edges, 0, V);
    }
}
