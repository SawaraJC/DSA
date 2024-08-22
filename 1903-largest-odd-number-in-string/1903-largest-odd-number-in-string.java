class Solution {
    public String largestOddNumber(String num) {
        int left = 0;
        int right = num.length() - 1;
        
        // Find the rightmost odd digit
        while (right >= 0 && (num.charAt(right) - '0') % 2 == 0) {
            right--;
        }
        
        // If there are no odd digits
        if (right < 0) {
            return "";
        }
        
        // Return the substring from the leftmost digit to the rightmost odd digit
        return num.substring(left, right + 1);
    }
}
