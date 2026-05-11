class Solution {

    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int n : nums) {

            ArrayList<Integer> temp = new ArrayList<>();

            if (n == 0) {
                temp.add(0);
            }

            while (n > 0) {
                temp.add(0, n % 10);
                n /= 10;
            }

            for (int digit : temp) {
                ans.add(digit);
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}