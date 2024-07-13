class Solution {
    public static String removechar(String s , String mx){

        Stack<Character> stack = new Stack<>() ;
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && ch == mx.charAt(1) && stack.peek() == mx.charAt(0)){
                stack.pop() ;
            }
            else{
                stack.push(ch) ;
            }
        }
        StringBuilder res = new StringBuilder() ;
        while(!stack.isEmpty()){
            res.append(stack.pop()) ;
        }
        return res.reverse().toString() ;
    }
    public int maximumGain(String s, int x, int y) {
        
        int n = s.length() ;
        int ans = 0 ;
        String mx = x > y ?"ab" : "ba" ;
        String mn = x > y ?"ba" : "ab" ;

        String temp1 = removechar(s,mx) ;

        int charRemoved1 = temp1.length() ;
        ans += ((n-charRemoved1)/2)*Math.max(x,y) ;

        String temp2 = removechar(temp1,mn) ;

        int  charRemoved2 = temp2.length() ;
        ans += ((charRemoved1-charRemoved2)/2)*Math.min(x,y) ;

        return ans ;

    }
}
