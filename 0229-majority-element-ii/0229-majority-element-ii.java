class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> hmap = new HashMap<>();
        int n = nums.length;

        for(int num: nums){
            hmap.put(num, hmap.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
            if(entry.getValue() > n/3){
                ans.add(entry.getKey());
            }
        }

        return ans;
    }
}