class Solution {
    public int maximumGap(int[] nums) {

        // int max = Integer.MAX_VALUE;
        int diff = Integer.MIN_VALUE;
        int ans = 0;

        if(nums.length<2){
            return 0;
        }

        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
            diff = nums[i+1] - nums[i];
            ans = Math.max(diff, ans);
        }

        return ans;

    }
}