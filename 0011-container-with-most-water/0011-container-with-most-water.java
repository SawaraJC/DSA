class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int maxArea = 0;

        while (i < j) {
            int minHeight = Math.min(height[i], height[j]);
            int currentArea = minHeight * (j - i);
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the smaller line
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }
}
