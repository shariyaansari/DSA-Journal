package trei;

public class Prefix {

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

    public static String search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx].freq == 1) {
                return word.substring(0, i + 1);
            }
            curr = curr.children[idx];
        }
        return null;
    }

    public static void searchPrefix2(Node root, String ans) {
        // recursive method 
        if (root == null) {
            return;
        }
        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }

        // Here we will check children on each level 
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                searchPrefix2(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"zebra", "dog", "dove", "duck"};
        for (String word : words) {
            insert(word);
        }
        root.freq = -1;

        searchPrefix2(root, "");

    }
}
