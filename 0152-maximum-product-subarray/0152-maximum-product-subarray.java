class Solution {
    public int maxProduct(int[] nums) {
        int prod = 1;
        int maxp = Integer.MIN_VALUE;

        for(int x: nums){
            prod *= x;

            if(maxp < prod){
                maxp = prod;
            }
        }

        return maxp;
    }
}