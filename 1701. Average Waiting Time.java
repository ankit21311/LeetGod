class Solution {
    public double averageWaitingTime(int[][] customers) {
        int row =  customers.length ;
        int max = 0 ;
        double ans = 0.0 ;
        for(int i = 0 ; i<row ; i++){
            if(max == 0 || max < customers[i][0]){
                max = customers[i][0] + customers[i][1] ;
            }
            else{
                max += customers[i][1] ;
            }
            ans += max - customers[i][0] ;
            // max =  max - customers[i][0] ;
        }
        return ans/row ;
        
    }
}
