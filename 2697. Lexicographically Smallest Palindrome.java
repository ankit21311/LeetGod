class Solution {
    public String makeSmallestPalindrome(String s) {
        int n = s.length() ;
        int  i = 0 , j = n-1 ;
        
        char[] ch = s.toCharArray() ;
        while(i<j){
            if(ch[i] != ch[j]){
                if(ch[i] - 'a' < ch[j]-'a'){
                    ch[j] = ch[i] ;
                }else{
                    ch[i] = ch[j] ;
                }
            }
            i++ ;
            j-- ;
        }
        String ans = "" ;
        for(char c : ch){
            ans += c ;
        }
        return ans ;
    }
}
