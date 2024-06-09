import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        // Create a HashMap to store the count of each element in the array.
        Map<Integer, Integer> countMap = new HashMap<>();

        // Populate the countMap with counts of each element.
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the element with count greater than n/2.
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }

        // Return -1 if no majority element found.
        return -1;
    }
}
