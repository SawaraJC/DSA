class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder res = new StringBuilder("");

        for(int i=0; i<s.length(); i++){
            char c = sb.charAt(i);
            if (c>=65 && c<=90){
                res.append((char) (c + 32));
                // System.out.println(res);
            }else{
                res.append(c);
                // System.out.println(res);
            }
        }

        // System.out.println(res);
        return res.toString();
    }
}