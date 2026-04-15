// https://leetcode.com/problems/longest-word-in-dictionary/
package trei;

public class LongestWordWithAllProfix {
    static class Node {

        Node[] children = new Node[26];
        boolean eow = false;
        int freq;
        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }
    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    
    static String ans = "";
    public static void getLongestPrefix(Node root, StringBuilder temp){ 
        if(root == null){
            return;
        }

        // For getting lexicographically smaller answer - eg return apple first
        // if you want a lexicographically greater answer then reverse the loop from i = 25 to i >= 0 i--
        for(int i = 0; i < root.children.length; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                getLongestPrefix(root.children[i], temp);
                // 
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "apple", "apply","ap", "appl"};
        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }
        getLongestPrefix(root, new StringBuilder());
        System.out.println(ans);
    }
}
