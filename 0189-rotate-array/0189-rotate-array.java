class Solution {
    public void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            temp[i] = nums[i];
        }

        for(int j=0; j<nums.length; j++){
            nums[(j+k)%nums.length] = temp[j];
        }
    }
}