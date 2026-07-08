class CelebrityProb{
    public static void approach1(int[][] mat){
        int[] knowMe = new int[mat.length];
        int[] iKnow = new int[mat.length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    iKnow[i]++;
                    knowMe[j]++;
                }
            }
        }
        for(int i = 0; i < mat.length; i++){
            if(knowMe[i] == knowMe.length-1 && iKnow[i] == 0){
                System.out.println(i +"is a celebrity");
                return;
            }
        }
    }
    public static void approach2(int[][] mat){
        int n = mat.length;
        int top = 0; 
        int down = n-1;
        while(top < down){
            if(mat[top][down] == 1){
                top++;
            }
            else if(mat[down][top] == 1){
                down--;
            }else{
                // if neither know each other then neither top nor down is a celebrity
                top++;
                down--;
            }
        } 
        if(top > down){
            System.out.println("-1");;
        }

        for(int i = 0; i < n; i++){
            if(i == top){
                continue;
            }
            if(mat[top][i] == 0 && mat[i][top] == 1){
                System.out.print(" ");        
            }else{
                System.out.println("-1");
                return;
            }
        }
        System.out.println(top);
    }
    public static void main(String[] args) {
        int[][] mat = { {0, 1, 1, 0}, 
                        {1, 1, 1, 1}, 
                        {0, 0, 0, 0}, 
                        {0, 1, 1, 0} 
                    };
        approach2(mat);
    }
}