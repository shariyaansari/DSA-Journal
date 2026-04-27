package graphs;

import java.util.*;

public class basic {
    /*
            (5)
        0--------1
                /\
            (1)/  \(1)
              /    \
             2------3
            /
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
        

    }
}
