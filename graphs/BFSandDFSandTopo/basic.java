// package graphs;

import java.util.*;

public class basic {
    /*
            (5)
        0--------1
                /\
            (1)/  \(1)
              /    \
             2------3
            /   (1)
        (2)/
          4
    */

    static class Edge{
        int source; 
        int destination;
        int weight;
        Edge(int source, int destination, int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight; 
        }
    }
    public static void main(String[] args) {
        int V = 5; 
        ArrayList<Edge>[] graph = new ArrayList[V];
        // ! Currently null stored in all the array list -> so make it an empty arraylist 
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }        
        // 0th vertex
        graph[0].add(new Edge(0, 1, 5));
        // 1st vertex 
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,1));
        // 2nd vertex
        graph[2].add(new Edge(2,4,2));
        // 3rd vertex
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 1));
        // 4th vertex
        graph[4].add(new Edge(4, 2, 2));
        for(int i = 0; i < V;i++){
            for(int j= 0; j < graph[i].size(); j++){
                Edge e = graph[i].get(j);
                System.out.println(e.source + ", "+ e.destination+", "+ e.weight);
            }
        }
    }
        
}
