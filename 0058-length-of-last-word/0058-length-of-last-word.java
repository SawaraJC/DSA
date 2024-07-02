class Solution {
    public int lengthOfLastWord(String s) {
        String[] helper = s.split("\\s+");
        int ans = (helper[helper.length-1]).length();
        return ans;
    }
}