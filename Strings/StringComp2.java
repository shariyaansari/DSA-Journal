// https://leetcode.com/problems/string-compression/
package Strings;

public class StringComp2 {
    public static int compress(char[] Chars) {
        char[] newChars = new char[Chars.length];
        int writeIndex = 0;
        for(int i = 0; i < Chars.length; i++){
            Integer count = 1; 
            while(i < Chars.length-1 && Chars[i] == Chars[i+1]){
                count++;
                i++;
            }
            newChars[writeIndex++] = Chars[i];
            if(count > 1){
                String str = count.toString();
                for(char c: str.toCharArray()){
                    newChars[writeIndex++] = c;
                }
            }
        }
        for (int i = 0; i < writeIndex; i++) {
            Chars[i] = newChars[i];
        }

        return writeIndex;
    }
    public static void main(String[] args) {
        char[] ch = {'a','a','b','b'};
        System.out.println(compress(ch));
    }
}
