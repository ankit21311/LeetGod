class Solution {
    public static int Dp(int[] nums, int[] dp, int start, int end) {
        if (start > end) {
            return 0;
        }
        if (dp[end] != -1) {
            return dp[end];
        }
        dp[end] = Math.max(Dp(nums, dp, start, end - 2) + nums[end], Dp(nums, dp, start, end - 1));
        return dp[end];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        // Case 1: Exclude the last house
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int ans1 = Dp(nums, dp1, 0, n - 2);

        // Case 2: Exclude the first house
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int ans2 = Dp(nums, dp2, 1, n - 1);

        // Return the maximum of the two cases
        return Math.max(ans1, ans2);
    }
}
