// So now your string S contains lower case alphabets and special case characters #,*,$ ......now my task is to is to make the string look good in such a way that I choose a special symbol in the given sentence and remove the special symbols and the closest alphabet present to the right of the Character for the special system
package Strings;

public class RemoveSpecialChar {
    public static void string(String s){
        // This might fail for some text cases 
        // StringBuilder res = new StringBuilder();
        // for(int i = 0 ; i < s.length();i++){
        //     if(!Character.isLetter(s.charAt(i))){
        //         continue;
        //     }
        //     if(Character.isLetter(s.charAt(i)) && (s.charAt(i-1) == '$' || s.charAt(i-1) == '#' || s.charAt(i-1) == '*')){
        //         continue;
        //     }
        //     res.append(s.charAt(i));
        // }
        // System.out.println(res.toString());

        StringBuilder res = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '$' || s.charAt(i) == '#' || s.charAt(i) == '*' ){
                // skip the character
                i++;
                if(i < s.length() && Character.isLetter(s.charAt(i))){
                    i++;
                }
                continue;
            }
            else{
                res.append(s.charAt(i));
                i++;
            }
        }
        System.out.println(res.toString());
    }
    
    public static void main(String[] args) {
        String s = "$sgsbd**hg";
        string(s);
    }
}
