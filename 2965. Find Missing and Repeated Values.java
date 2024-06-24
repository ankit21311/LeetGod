class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length ;
       
        HashMap<Integer,Integer> map = new HashMap<>() ;
        int[] ans = new int[2] ;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                if(!map.containsKey(grid[i][j])){
                    map.put(grid[i][j],0);
                }
                map.put(grid[i][j],map.get(grid[i][j])+1) ;
            }
        }
        
        for(int i : map.keySet()){
            if(map.get(i) > 1){
                ans[0] = i ;
            }
        }
        int k = 1;
        while(k<=n*n){
            if(!map.containsKey(k)){
                ans[1] = k ;
                return ans ;
            }
            k++ ;
        }
        return ans ;


    }
}
