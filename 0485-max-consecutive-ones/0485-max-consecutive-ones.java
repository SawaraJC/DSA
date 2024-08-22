class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int num: nums){
            if(num == 1){
                count ++;
                max = Math.max(max, count);
            }else {
                count = 0;
            }
        }

        if(max == Integer.MIN_VALUE){
            return 0;
        }

        return max;
    }
}