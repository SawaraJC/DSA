class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        while (i < nums.length - 1) {
            int j = i + 1;
            if (nums[i] > nums[j]) {
                swap(nums, i, j);
                if (i == 0) {
                    //dont check if we reached far left
                } else {
                    int k = i - 1;
                    checkBackward(nums, k);
                }
                i++; 
            }
            else if (nums[i] == nums[j]) {
                i++;
            }
            else {
                i++;
            }
        }
    }

    private void checkBackward(int[] nums, int k) {
        if (k < 0) return;
        
        int next = k + 1;
        if (nums[k] > nums[next]) {
            swap(nums, k, next);
            checkBackward(nums, k - 1);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}