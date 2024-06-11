class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1" ;
        }
        String ans = countAndSay(n-1) ;
        int count = 1 ;
        StringBuilder res = new StringBuilder() ;
        for(int i = 1 ; i<ans.length() ; i++){
            // count = 1 ;
            if(ans.charAt(i-1) == ans.charAt(i)){
                count++ ;
            }else{
                res.append(count).append(ans.charAt(i - 1));
                count = 1 ;
            }
           
        }
          res.append(count).append(ans.charAt(ans.length() - 1));
        return res.toString() ;
    }
}
