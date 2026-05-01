class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        int sum = 0;
        int f1 = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            f1 += i * nums[i];
        }

        int max = f1;
        int curr = f1;
        for (int k = 1; k < n; k++) {
            curr = curr + sum - n * nums[n - k];
            max = Math.max(max, curr);
        }

        return max;
    }
}