package Strings;

public class ConvertUppercase {
    // public static void Uppercase(String str) {
    //     StringBuilder modified = new StringBuilder();
    //     for(int i = 0; i < str.length(); i++){
    //         if(i == 0 || str.charAt(i - 1) == ' '){
    //             modified.append(Character.toUpperCase(str.charAt(i)));
    //         } else {
    //             modified.append(str.charAt(i));
    //         }
    //     }
    //     System.out.println(modified.toString());
    // }
    public static String Uppercase(String str) {
        StringBuilder res = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        res.append(ch);
        for(int i = 1; i < str.length();i++){
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                res.append(str.charAt(i));
                i++;
                res.append(Character.toUpperCase(str.charAt(i)));
            }
            else{                
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am shariya";
        System.out.println(Uppercase(str));
    }    
}
