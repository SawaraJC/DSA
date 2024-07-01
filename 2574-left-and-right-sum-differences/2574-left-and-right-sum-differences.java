class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // Calculate left sum for nums[i]
            for (int left = 0; left < i; left++) {
                leftSum += nums[left];
            }

            // Calculate right sum for nums[i]
            for (int right = i + 1; right < n; right++) {
                rightSum += nums[right];
            }

            ans[i] = Math.abs(leftSum - rightSum);
        }

        return ans;
    }
}
