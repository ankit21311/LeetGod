class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];

        // First pass to mark the rows and columns that need to be zeroed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Second pass to set the marked rows and columns to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
