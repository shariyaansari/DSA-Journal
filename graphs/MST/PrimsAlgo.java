import java.util.*;
class PrimsAlgo{
    static class Pair{
        int wt; 
        int node; 
        Pair(int wt, int node){
            this.wt = wt; 
            this.node = node; 
        }
    }
    public static void prims(int V, List<List<List<Integer>>> adj){
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> a.wt - b.wt);

        int[] visited = new int[V]; 
        pq.add(new Pair(0, 0)); 
        int sum = 0; 

        // runs O(E) times 
        while(!pq.isEmpty()){
            int wt = pq.peek().wt;
            int node = pq.peek().node; 
            // O(log n)
            pq.remove(); 
            if(visited[node] == 1){
                continue;
            }
            visited[node] = 1; 
            sum += wt; 
            // Each nodes neighbors at max would be E neighbors
            // E log E 
            for(int i = 0; i < adj.get(node).size(); i++){
                int currWeight = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);
                if(visited[adjNode] == 0){
                    pq.add(new Pair(currWeight, adjNode));
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }    
}