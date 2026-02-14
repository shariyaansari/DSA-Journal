package Strings;

public class Shortest {
    public static void Spath(String path){
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'N'){
                y += 1;
            }
            else if(path.charAt(i) == 'S'){
                y -= 1;
            }
            if(path.charAt(i) == 'E'){
                x += 1;
            }
            else{
                x -= 1;
            }
        }
        float distance = (float)Math.sqrt(x*x + y*y);
        // int add = x + y;
        // int distance = (int) Math.sqrt(add);
        System.out.println(distance);

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        Spath(path);
    }
    
}
