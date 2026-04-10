package trei;

public class WordBreakProb {

    static class Node {

        Node children[] = new Node[26];
        boolean endOfWord = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
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
        curr.endOfWord = true;
    }

    // O(L)
    public static boolean Search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.endOfWord;
    }

    public static boolean isPresent(String s) {

        if (s.length() == 0) {
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (Search(s.substring(0, i)) && isPresent(s.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }
        // Call the recursive function
        System.out.println(isPresent("thether"));
    }
}
