class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        int product = 1;

        while (i < j){
            int smallNum = smaller(height[i], height[j]);
            product = (j-i) * smallNum;

            if(product > max){
                max = product;
            }
            
            if (isSmaller(height[i], height[j])){
                i++;
            }else {
                j--;
            }
            
        }

        return max;
    }

    public int smaller(int num1, int num2){
        return (num1 < num2) ? num1 : num2;
    }

    public boolean isSmaller(int num1, int num2) {
        return (num1 < num2) ? true : false;
    }
}