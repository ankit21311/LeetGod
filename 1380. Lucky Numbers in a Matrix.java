class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length ;
        int m = matrix[0].length ;

        // int[] rowMin = new int[n] ;
        // int[] colMax = new int[m] ;

        ArrayList<Integer> arr = new ArrayList<>() ;

        int rowMinMax = Integer.MIN_VALUE ;
        int colMaxMin = Integer.MAX_VALUE ;

        for(int row = 0 ; row < n ; row++){
            int mn = Integer.MAX_VALUE ;
            for(int col = 0 ; col < m ; col++){
                mn = Math.min(mn,matrix[row][col]) ;
            }
            rowMinMax = Math.max(rowMinMax,mn) ;
        }

        for(int col = 0 ; col < m ; col++){
            int mx = Integer.MIN_VALUE ;
            for(int row = 0 ; row < n ; row++){
                mx = Math.max(mx,matrix[row][col]) ;
            }
            colMaxMin = Math.min(colMaxMin,mx) ;
        }

        if(rowMinMax == colMaxMin)arr.add(colMaxMin) ;
        return arr ;
    }
}
