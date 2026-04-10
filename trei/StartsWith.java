package trei;

public class StartsWith {

    static class Node {

        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }

        // root will always be empty
        public static Node root = new Node();

        // O(L)
        public static void insert(String word) {
            Node curr = root;
            for (int level = 0; level < word.length(); level++) {
                int idx = word.charAt(level) - 'a';
                if (curr.children[idx] == null) {
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];
            }
            curr.eow = true;
        }

        // O(L)
        public static boolean start(String prefix) {
            Node curr = root;
            for (int i = 0; i < prefix.length(); i++) {
                int idx = prefix.charAt(i) - 'a';
                if(curr.children[idx] == null) {
                    return false;
                }
                curr = curr.children[idx];
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String words[] = {"Code", "codeWith"};
        for(int i = 0; i < words.length; i++) {
            Node.insert(words[i]);
        }
        System.out.println(Node.start("the"));
    }

}
