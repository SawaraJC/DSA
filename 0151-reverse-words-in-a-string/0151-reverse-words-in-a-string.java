class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        reverse(words);

        String result = String.join(" ", words);
        return result;
    }

    public void reverse(String[] ans){
        int i=0;
        int j=ans.length-1;

        while(i<j){
            String temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
    }
}