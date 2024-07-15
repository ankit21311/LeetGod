class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>() ;

        for(int num : asteroids){

            if(num > 0) stack.push(num) ;
            
            else{
                while(!stack.isEmpty() && stack.peek() > 0 && Math.abs(num) > Math.abs(stack.peek())){
                            stack.pop() ;
                }
                if(stack.isEmpty() || stack.peek() < 0 ){

                        stack.push(num);
                    }
                    
                    else if(Math.abs(num) == Math.abs(stack.peek())) stack.pop() ;

                    
                }
            }
            
        
        int[] ans = new int[stack.size()] ;
        int k = 0 ;
        for(int num : stack){

            ans[k] = num ;
            k++ ; 
        }
        return ans ;
    }
}
