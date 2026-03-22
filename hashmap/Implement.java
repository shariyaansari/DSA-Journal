package hashmap;

import java.util.*;

public class Implement {

    static class HashMap<K, V> {

        private class Node {

            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        // make a linket list arr 
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked") //Don't check what kind of array is being formed using the linked list
        public HashMap() {
            // intitalize the size with 4
            this.N = 4;
            // initializing the array of the linked list
            this.buckets = new LinkedList[4]; //In new versions of java we have to also define what kind of linked list are being made so it gives out warnings if nit checked -> that's why we used SupressWarnings 
            for (int i = 0; i < 4; i++) {
                // initializing the linked list inside the array -> these linked list are just initialized and empty 
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();   //gives a hashcode like 12345 or -1245
            //    Step 1 to get the absolute positive value of the code 
            
            // step 2 -> the index value should be b/w 0 to size-1 
            return Math.abs(hc) % N;
        }
        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i = 0; i < ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        
        @SuppressWarnings("unchecked")
        private void rehash(){
            // make an array to store linked list 
            LinkedList<Node> oldBucket[] = buckets;
            // empty the prev bucket and make a new one with double the size 
            buckets = new LinkedList[N*2];
            N = 2*N;

            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
            // nodes -> add in the new bucket
            for(int i = 0; i < oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j < ll.size();j++){
                    // remove prev nodes and put them again
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            // I need a bucket index to put value into the function 
            int bi = hashFunction(key);  
            // Step 2 -> search in linked list 
            int di = searchInLL(key, bi);   // valid or -1 -> to know whether new pair should be created or update the data 
            if(di != -1){   //key alr exist just update the value 
                Node node = buckets[bi].get(di);
                node.value =value;
            }
            // Create a new node 
            else{
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = n/N;
            if(lambda > 2.0){
                rehash(); 
            }
        }

        public boolean containsKey(K key) {
            return false;
        }

        // public V remove() {

        // }
    }

    public static void main(String[] args) {

    }
}
