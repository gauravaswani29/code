public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int me =0;
        int ms = Integer.MIN_VALUE ;
        for(int i =0;i<A.size();i++){
            me=me+A.get(i);
            if(me<A.get(i))
            me = A.get(i);
        
        if(ms<me){
            ms = me;
        }
        }
        return ms;
    
}
}
