
import java.util.*;

class DisjointSetUnionByRank {

    static class Disjoint {

        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();

        // initializ the constructor 
        public Disjoint(int n) {
            for(int i = 0; i <= n; i++){
                rank.add(0);
                parent.add(i);
            }
        }

        // to find the ultimate parent -> use recursion -> for path Compression
        public int findUparent(int node){
            if(node == parent.get(node)){
                return node;
            }
            int ulp = findUparent(parent.get(node));
            parent.set(node, ulp);
            return parent.get(node);
        }

        public void unionByRank(int u, int v){
            // step 1 -> find ultimate parent of both u and v
            int pu = findUparent(u);
            int pv = findUparent(v);

            // if both parent's are same maybe it's like (1, 1) -> so no point going ahead. 
            if(pu == pv) return;

            // then compare rank -> if pu < pv then reset the pu's parent as pv 
            else if(rank.get(pu) < rank.get(pv)){
                // reset the parent
                parent.set(pu, pv);
            }
            // if pv < pu then reset the pv's parent as pu
            else if(rank.get(pu) > rank.get(pv)){
                parent.set(pv, pu);
            }
            // if both the ranks are same then use anyone parent
            else{
                parent.set(pv, pu);
                int rankU = rank.get(pu);
                rank.set(pu, rankU + 1);
            }
        }
    }

    public static void main(String[] args) {
        Disjoint ds = new Disjoint(7); 
        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);


        System.out.println(ds.findUparent(3));
        System.out.println(ds.findUparent(7));
        ds.unionByRank(3, 7);

        System.out.println(ds.findUparent(3));
        System.out.println(ds.findUparent(7));
    }   

}
