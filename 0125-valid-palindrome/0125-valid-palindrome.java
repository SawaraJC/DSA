class Solution {
    public boolean isPalindrome(String s) {
        String fin = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0;
        int j = fin.length()-1;

        while(i<j){
            if(fin.charAt(i)!=(fin.charAt(j))){
                return false;
            }else{
                i++;
                j--;
            }

        }

        return true;
    }
}