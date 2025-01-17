class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for(int num: nums){
            hset.add(num);
        }

        int longest = 0;

        for(int num: nums){
            if(!hset.contains(num-1)){
                int length = 1;

                while(hset.contains(num+length)){
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}