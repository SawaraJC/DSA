class Solution {
    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        List<String> ans = new ArrayList<>();
        ans.add(""); 

        for (int i = 0; i < digits.length(); i++) {
            char digit = digits.charAt(i);
            String letters = mapping[digit - '0'];
            
            List<String> tempNextCombinations = new ArrayList<>();

            for (String combination : ans) {

                for (int j = 0; j < letters.length(); j++) {
                    tempNextCombinations.add(combination + letters.charAt(j));
                }
            }

            ans = tempNextCombinations;
        }

        return ans;
    }
}