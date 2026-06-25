import java.util.*;


public class WordLadder2 {
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
    
    public static void main(String[] args) {
        
    }

}
