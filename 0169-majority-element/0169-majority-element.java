class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count = 0;

        for(int num: nums){
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: hmap.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }

        return -1;
    }
}