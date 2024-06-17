class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] tempArray = new int[n];

        // Copy the original array to tempArray
        for (int i = 0; i < n; i++) {
            tempArray[i] = nums[i];
        }

        // Update nums with rotated values
        for (int i = 0; i < n; i++) {
            nums[(i + k) % n] = tempArray[i];
        }
    }
}
