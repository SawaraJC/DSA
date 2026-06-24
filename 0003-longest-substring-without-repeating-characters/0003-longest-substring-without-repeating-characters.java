// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if (s.length() == 0) {
//             return 0;
//         }

//         int max = 0; 
//         int longest = 0;

//         HashSet<Character> set = new HashSet<>();

//         for (int i = 0; i < s.length(); i++) {
//             if (set.add(s.charAt(i))) {
//                 max++;
//                 if (max > longest) {
//                     longest = max;
//                 }
//             } else {
//                 set.clear();
//                 i = i - max; 
//                 max = 0; 
//             }
//         }

//         return longest;
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        int longest = 0;
        int left = 0; 

        for (int right = 0; right < s.length(); right++) {

            while (!set.add(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}