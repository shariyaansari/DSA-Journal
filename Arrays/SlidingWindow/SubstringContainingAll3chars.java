package arrays.SlidingWindow;

class SubstringContainingAll3Chars{
    public static int numberOfSubstrings(String s) {
        int left = 0; 
        int right = 0;
        int count = 0;
        int[] chs = new int[s.length()];
        while(right < s.length()){
            chs[s.charAt(right)-'a']++;
            while(chs[0] >= 1 && chs[1] >=1 && chs[2] >= 1){
                count += s.length() - right; 
                chs[s.charAt(left) - 'a']--; 
                left++;
            }
            right++;   
        }
        return count;
    }    
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }
}