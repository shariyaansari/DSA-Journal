
import java.util.*;

class ShortestPathInUndirectedGraph {

    static class Pair {

        int dest;
        int wt;

        Pair(int dest, int wt) {
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {
        int src = 0;
        List<Integer>[] graph = new ArrayList[9];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // initialze the dist array
        int[] dist = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        graph[0].add(1);
        graph[1].add(0);

        graph[0].add(2);
        graph[2].add(0);

        graph[1].add(3);
        graph[3].add(1);

        // make the src to src = 0
        dist[src] = 0;

        Queue<Pair> q = new LinkedList<>();

        // add the source to source with a dist 0
        q.add(new Pair(0, 0));

        // run normal bfs
        while (!q.isEmpty()) {
            // get the pair out to get the dist and the curr node
            Pair curr = q.poll();

            int c = curr.dest; //c = curr
            int d = curr.wt;  // d = distance

            // go to all the neighbors of the the curr node 
            for (int i = 0; i < graph[c].size(); i++) {
                int neigh = graph[c].get(i);
                int currdist = d + 1;

                if (currdist < dist[neigh]) {
                    dist[neigh] = currdist;
                    q.add(new Pair(neigh, currdist));
                }

            }
        }

    }
}
