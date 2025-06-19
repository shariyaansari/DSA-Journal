// https://www.geeksforgeeks.org/problems/valid-compressed-string--170647/1
package Strings;

public class StringCompression {
    public static String CompressedString(String Str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Str.length(); i++){
            Integer count = 1;
            while(i < Str.length()-1  && Str.charAt(i) == Str.charAt(i+1) ){
                count++;
                i++;
            }
            sb.append(Str.charAt(i));
            if(count > 1){
                count.toString();
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(CompressedString(str));
    }
}
