class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> fmap = new HashMap<>();

        for(int num: nums){
            fmap.put(num, fmap.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: fmap.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }

        return -1;
    }
}