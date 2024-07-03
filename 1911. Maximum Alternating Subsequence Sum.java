class Solution {
    public static long Dp(int[] nums, long[][] dp, int start, int end, boolean flag) {
        if (start >= end) {
            return 0;
        }
        if (dp[start][flag ? 1 : 0] != -1) {
            return dp[start][flag ? 1 : 0];
        } else {
            int val = nums[start];
            long skip = Dp(nums, dp, start + 1, end, flag);
            if (!flag) {
                val = -val;
            }
            long take = Dp(nums, dp, start + 1, end, !flag) + val;
            
            dp[start][flag ? 1 : 0] = Math.max(take, skip);
            return dp[start][flag ? 1 : 0];
        }
    }

    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[][] dp = new long[n][2];
        for (int i = 0; i < n; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        return Dp(nums, dp, 0, n, true);
    }
}
