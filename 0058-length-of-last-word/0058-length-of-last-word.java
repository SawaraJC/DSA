class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIdx = s.lastIndexOf(' ');
        return s.length()-1-lastIdx;
    }
}