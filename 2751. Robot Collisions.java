class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        
        int n = positions.length ;
        Integer[] indices = new Integer[n]; ;
        for(int i = 0 ; i<n ; i++){
            indices[i] = i ;
        }
        Stack<Integer> stack = new Stack<>() ;

        Arrays.sort(indices, (i , j) -> Integer.compare(positions[i], positions[j]));

        for(int currentIndex : indices){
            
            if(directions.charAt(currentIndex) == 'R'){
                stack.push(currentIndex) ;
            }
            else{
                while(!stack.isEmpty() && healths[currentIndex] > 0){

                    int topIndex = stack.pop() ;
                    if(healths[currentIndex] > healths[ topIndex]){
                        
                        healths[currentIndex] -= 1 ;
                        healths[topIndex] = 0 ;
                        

                    }
                    else if(healths[currentIndex] < healths[ topIndex]){

                        healths[currentIndex] = 0 ;
                        healths[topIndex] -= 1 ;
                        stack.push(topIndex);
                        
                    }
                    else{
                        healths[currentIndex] = 0;
                        healths[topIndex] = 0;
                    }
                }
            }
        }
        List<Integer> ans = new ArrayList() ;
        for(int i : healths){
            if(i>0) ans.add(i) ;
        }
        return ans ;
    }
}
