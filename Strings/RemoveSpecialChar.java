// So now your string S contains lower case alphabets and special case characters #,*,$ ......now my task is to is to make the string look good in such a way that I choose a special symbol in the given sentence and remove the special symbols and the closest alphabet present to the right of the Character for the special system
package Strings;

public class RemoveSpecialChar {
    public static void string(String s){
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < s.length();i++){
            if(!Character.isLetter(s.charAt(i))){
                continue;
            }
            if(Character.isLetter(s.charAt(i)) && (s.charAt(i-1) == '$' || s.charAt(i-1) == '#' || s.charAt(i-1) == '*')){
                continue;
            }
            res.append(s.charAt(i));
        }
        System.out.println(res.toString());
    }
    
    public static void main(String[] args) {
        String s = "$sgsbd**hg";
        string(s);
    }
}
