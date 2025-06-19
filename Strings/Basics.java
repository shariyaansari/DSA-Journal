package Strings;
// Print substring
// Count lowercase Vowels
public class Basics {
    public static void basic(String str, int si, int ei){
        for(int i = si;i < ei;i++){
            System.out.print(str.charAt(i));
        }
    }
    public static int lowercase(String str){
        int count = 0;
        int n = str.length();
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        int si = 2;
        int ei = 6;
        // Inbuilt function 
        // System.out.println(str.substring(si, ei));
        // basic(str, si, ei);
        System.out.println(lowercase(str));

    }
}
