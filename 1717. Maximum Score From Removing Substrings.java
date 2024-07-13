Approach 1

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

Approach 2 

class Solution {
    public static String removechar(String s , String mx){

        int i = 0 ; // write whatever j reads
        StringBuilder sb = new StringBuilder(s) ;
        for(int j = 0 ; j<s.length() ;j++){
            sb.setCharAt(i,sb.charAt(j));
            i++ ;
            if(i>=2 && sb.charAt(i-2) == mx.charAt(0) && sb.charAt(i-1) == mx.charAt(1)){
                i = i - 2 ;
            }
        }
        return sb.substring(0,i) ;
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
