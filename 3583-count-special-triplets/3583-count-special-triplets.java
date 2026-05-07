class Solution {

    public int specialTriplets(int[] nums) {

        long ans = 0;
        int MOD = 1_000_000_007;

        Map<Long, Integer> left = new HashMap<>();
        Map<Long, Integer> right = new HashMap<>();
        for (int num : nums) {
            right.put((long) num, right.getOrDefault((long) num, 0) + 1);
        }
        left.put((long) nums[0], 1);

        right.put((long) nums[0], right.get((long) nums[0]) - 1);

        if (right.get((long) nums[0]) == 0) {
            right.remove((long) nums[0]);
        }

        for (int i = 1; i < nums.length - 1; i++) {

            long target = 2L * nums[i];
            right.put((long) nums[i], right.get((long) nums[i]) - 1);

            if (right.get((long) nums[i]) == 0) {
                right.remove((long) nums[i]);
            }
            if (left.containsKey(target) && right.containsKey(target)) {

                ans = (ans +
                        (long) left.get(target) * right.get(target)) % MOD;
            }
            left.put((long) nums[i],
                    left.getOrDefault((long) nums[i], 0) + 1);
        }

        return (int) ans;
    }
}