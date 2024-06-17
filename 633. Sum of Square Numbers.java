class Solution {
    public boolean judgeSquareSum(int c) {

        int i = 0;
        while (i * i <= c && i<=Math.sqrt(c)) {
            int remainder = c - i * i;
            double sqrt = Math.sqrt(remainder);
            if (sqrt == (int) sqrt) { // Check if the square root of the remainder is an integer
                return true;
            }
            i++;
        }
        return false;
    }
}
