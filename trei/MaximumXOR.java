// https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/description/
package trei;

public class MaximumXOR {
    static class Node {
        Node children[] = new Node[2];

        public Node() {

        }

        boolean ContainsKey(int ind){
            return (children[ind] != null);
        }

        Node get(int ind) {
            return children[ind];
        }

        void put(int ind, Node node) {
            children[ind] = node;
        }
    }

    class Trie {
        private static Node root;

        Trie() {
            root = new Node();
        }

        public static void insert(int num) {
            Node node = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (!node.ContainsKey(bit)) {
                    node.put(bit, new Node());
                }
                node = node.get(bit);
            }
        }

        public int getMax(int num){
            Node node = root; 
            int maxNum = 0;
            for(int i = 31; i >= 0; i--){
                int bit = (num >> i) & 1; 
                if(node.ContainsKey(1 - bit)){
                    maxNum = maxNum | (1 << i);
                    node = node.get(1-bit);
                }
                else{
                    node = node.get(bit);
                }
            }
            return maxNum;
        }
    }

    public int findMaximumXOR(int[] nums) {
        Trie trie = new Trie();

        // Step 1: insert all numbers
        for (int num : nums) {
            trie.insert(num);
        }

        // Step 2: find max XOR
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, trie.getMax(num));
        }

        return max;
    }
    public static void main(String[] args) {
        
    }
}
