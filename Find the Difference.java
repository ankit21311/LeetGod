class Solution {
    public char findTheDifference(String s, String t) {
        int sum1 = 0 ;
        for(int i : s.toCharArray()){
            sum1 += i ;
        }
        int sum2 = 0 ;
        for(int i : t.toCharArray()){
            sum2 += i ;
        }
        int ans = (sum2 - sum1) ;
        return (char)ans ;
    }
}
