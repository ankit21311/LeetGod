class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        
        int maxD = Integer.MIN_VALUE ;
        int mn = arrays.get(0).get(0) ;
        int mx = arrays.get(0).get(arrays.get(0).size()-1) ;

        for(int i = 1 ; i < arrays.size() ; i++){

                maxD = Math.max(maxD ,Math.abs(mx-arrays.get(i).get(0))) ;
                maxD = Math.max(maxD ,Math.abs(mn-arrays.get(i).get(arrays.get(i).size()-1))) ;

                mx = Math.max(mx,arrays.get(i).get(arrays.get(i).size()-1)) ;
                mn = Math.min(mn,arrays.get(i).get(0)) ;
        }
        return maxD ;
    }
}
