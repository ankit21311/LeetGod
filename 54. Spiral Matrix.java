class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>() ;
        int row = matrix.length , column = matrix[0].length ;
        int top = 0 , down = row-1 , left = 0 , right = column-1 ;
        int dir = 0 ;
        while(top <= down && left <= right){
            //left to right
            if(dir == 0){
                for(int i = left ; i<=right ; i++){
                    arr.add(matrix[top][i]) ;
                }
                top++ ;
            }
            // top to down
            else if(dir == 1){
                for(int i = top ; i<=down ; i++){
                    arr.add(matrix[i][right]) ;
                }
                right-- ;
            }
            //right to left
            else if(dir == 2){
                for(int i = right ; i>=left ; i--){
                    arr.add(matrix[down][i]) ;
                }
                down-- ;
            }
            else if(dir == 3){
                for(int i = down ; i>=top ; i--){
                    arr.add(matrix[i][left]) ;
                }
                left++ ;
            }
            dir++ ;
            if(dir == 4){
                dir = 0 ;
            }

        }
        return arr ;
    }
}
