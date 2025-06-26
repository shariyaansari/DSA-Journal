package Strings;

public class RemoveDuplicates {
    public static String removeDuplicates(String Str) {
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < Str.length();i++){
            char ch = Str.charAt(i);
            if(!seen[ch]){
                sb.append(ch);
                seen[ch] = true;
            }
        }
        return sb.toString();
    }
    public static void usingRecursion(String s, int index, StringBuilder sb, boolean[] map){
        // base case
        if(index == s.length()){
            System.out.println(sb.toString());
            return;
        }
        // Kaam 
        char curr = s.charAt(index);
        if(map[curr-'a'] == true){
            // Then it's a duplicate
            usingRecursion(s, index+1, sb, map);
        }else{
            map[curr-'a'] = true;
            usingRecursion(s, index+1, sb.append(curr), map);
        }
    }
    public static void main(String[] args) {
        String Str = "babad"; 
        System.out.println(removeDuplicates("babad"));
        usingRecursion(Str, 0, new StringBuilder(), new boolean[26]);
    }
}
