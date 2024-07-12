class Solution {
    public static void reverse(StringBuilder sb , int start , int end){


        while(start<end){
            char ch = sb.charAt(start) ;
            sb.setCharAt(start,sb.charAt(end)) ;
            sb.setCharAt(end,ch) ;
            start++ ;
            end-- ;
        }

    }
    public String reverseParentheses(String s) {
        
        Stack<Integer> stack = new Stack<>() ;

       StringBuilder sb = new StringBuilder() ;

        for(char ch : s.toCharArray()){

            if(ch == '(') stack.push(sb.length()) ;

            else if(ch == ')'){
                int curr = stack.peek() ;
                stack.pop() ;
                reverse(sb,curr,sb.length()-1) ;
            }
            else{
                sb.append(ch) ;
            }

        }
        return sb.toString() ;
    }
}
