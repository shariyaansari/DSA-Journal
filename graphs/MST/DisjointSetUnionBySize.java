
import java.util.*;

class DisjointSetUnionBySize{
    static class Disjoint{
        List<Integer> size = new ArrayList<>(); 
        List<Integer> parent = new ArrayList<>();

        public Disjoint(int n) {
            for(int i = 0; i < n; i++){
                size.add(1);
                parent.add(i);
            }
        }

        // get the ultimate parent 
        public int getUltimateParent(int node){
            if(node == parent.get(node)){
                return node;
            }
            int ulp = getUltimateParent(parent.get(node));
            parent.set(node, ulp);
            return parent.get(node);
        }

        public void UnionBySize(int u, int v){
            // get ultimate parent for both u and v 
            int pu = getUltimateParent(u);
            int pv = getUltimateParent(v);

            if(pu == pv) return; 

            // 2 cases
            // size less and size equal
            if(size.get(pu) < size.get(pv)){
                parent.set(pu, pv);
                size.set(pv, size.get(pu) + size.get(pv));
            }else{
                parent.set(pv, pu);
                size.set(pu, size.get(pu) + size.get(pv));
            }
        }

    }
    public static void main(String[] args) {
        Disjoint ds = new Disjoint(8); 
        ds.UnionBySize(1, 2);
        ds.UnionBySize(2, 3);
        ds.UnionBySize(4, 5);
        ds.UnionBySize(6, 7);
        ds.UnionBySize(5, 6);


        System.out.println(ds.getUltimateParent(3));
        System.out.println(ds.getUltimateParent(7));
        ds.UnionBySize(3, 7);

        System.out.println(ds.getUltimateParent(3));
        System.out.println(ds.getUltimateParent(7));
    }   
}