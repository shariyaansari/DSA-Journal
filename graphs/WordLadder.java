
import java.util.*;

class WordLadder {
    public static List<String> helper(HashSet<String> hs, String original) {
        List<String> list = new ArrayList<>();
        // Convert the string original to char array 
        char[] arr = original.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char currCh = arr[i];
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (currCh == ch) {
                    continue;
                }
                arr[i] = ch;
                String newWord = new String(arr);
                if (hs.contains(newWord)) {
                    list.add(newWord);
                }
            }
            arr[i] = currCh;
        }
        return list;
    }

    public static int ladderLength(List<String> wordList, String beginWord, String endWord) {
        int level = 1;
        HashSet<String> hs = new HashSet<>(wordList);

        if (!hs.contains(endWord))
            return 0;

        Queue<String> q = new LinkedList<>();
        q.add(beginWord); 
        hs.remove(beginWord);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                // get the neighbors 
                List<String> neighbor = helper(hs, q.remove());
                for (String next : neighbor) {
                    if (next.equals(endWord)) {
                        return level+1;
                    }
                    hs.remove(next);
                    q.add(next);
                }
            }
            level++;
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        String beginWord = "hit";
        String endWord = "cog";
        System.out.println(ladderLength(wordList, beginWord, endWord));
    }
        
}