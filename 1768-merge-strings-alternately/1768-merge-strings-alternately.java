class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int l1 = word1.length();
        int l2 = word2.length();
        int bigger = Math.max(l1, l2);

        int i = 0;

        while (i<=bigger){

            if (i>l1){
                res += word2.substring(i-1);
                // System.out.println(res);
                return res;
            }

            if (i>l2){
                res += word1.substring(i-1);
                // System.out.println(res);
                return res;
            }

            if (i<l1 && i<l2){
                // System.out.println(res);
                res += word1.charAt(i);
                // System.out.println(res);
                res += word2.charAt(i);
                // System.out.println(res);
            }
            // System.out.print("i before execution: ", i);
            i++;
            // System.out.print("i after execution: ", i);
        }

        return res;
    }
}