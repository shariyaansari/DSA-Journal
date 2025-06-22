// It's a question from The book called "cracking the coding interview "
// Q. IS Unique:Implement algorithm to determine if a string has all unique characters.What if you cannot use additional dataStructures 

package Strings;

public class AllUniqueCharacter{
    // brute
    public static boolean isUnique(String s){

        // Looping through each character and comparing it to the next 
        for(int i = 0; i < s.length();i++){
            for(int j = i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isUnique2(String s){
        // Making a frequency array to store frequency of each element 
        int[] storeCount = new int[128];
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            int index = ch - 'a';
            storeCount[index]++;
            if(storeCount[index] > 1){
                return false;
            }
        }
        return true;
    } 

    public static boolean idealSoln(String s){
        boolean[] seen = new boolean[128];
        for(int i = 0; i < s.length();i++){
            int ch = s.charAt(i);
            if(seen[ch]){
                return false;
            } 
            seen[ch] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(idealSoln("fefdg"));

    }
}