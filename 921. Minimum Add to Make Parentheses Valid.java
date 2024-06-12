class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>() ;
        int n = s.length() ;
        if(n == 1){
            return 1 ;
        }
        for(char ch : s.toCharArray()){
            if(stack.isEmpty() || stack.peek() == ')'){
                stack.push(ch) ;
            }
            else if(!stack.isEmpty() && ch == '('){
                stack.push(ch) ;
            }
            else if(!stack.isEmpty() && ch == ')'){
                while(!stack.isEmpty() && ch == ')' && stack.peek() != '('){
                    stack.pop() ;
                }
                stack.pop() ;
            }
        }
        return stack.size() ;
    }
}
