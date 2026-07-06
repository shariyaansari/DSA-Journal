import java.util.*;

class AsteroidCollision{
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>(); 
        for(int i = 0; i < asteroids.length; i++){
            if(asteroids[i] > 0){
                st.push(asteroids[i]);
                continue;
            }
            while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])){
                st.pop();
            } 
            if(!st.isEmpty() && st.peek() == Math.abs(asteroids[i])){    
                st.pop();
            }
            else if(st.isEmpty() || st.peek() < 0){
                st.push(asteroids[i]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        Collections.reverse(list); 
        asteroids = list.stream()
                              .mapToInt(Integer::intValue)
                              .toArray();
        return asteroids;
    }
    public static void main(String[] args) {
        
    }
}