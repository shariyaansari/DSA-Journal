package Strings;

public class MyStringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }//abcdefghijklmnopqrstuvwxyz
        // Time Complexity O(26)
        System.out.println(sb);
    }
    
}
