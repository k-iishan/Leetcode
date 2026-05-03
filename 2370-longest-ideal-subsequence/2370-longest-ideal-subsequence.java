class Solution {
    public int longestIdealString(String s, int k) {
        int[] dp = new int[26];
        int max = 0;

        for (char ch : s.toCharArray()) {
            int curr = ch - 'a';

            int best = 0;
            for (int i = Math.max(0, curr - k); i <= Math.min(25, curr + k); i++) {
                best = Math.max(best, dp[i]);
            }

            dp[curr] = best + 1;
            max = Math.max(max, dp[curr]);
        }

        return max;
    }
}