import java.util.*;
class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
               // Create a list to store original numbers paired with their transformed values
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>();

        for (int num : nums) {
            int transformedNum = 0;
            int x = num;
            if (x == 0) {
                // Handle the special case for zero
                transformedNum = mapping[0];
            } else {
                List<Integer> digits = new ArrayList<>();

                // Extract digits and map them
                while (x > 0) {
                    int digit = x % 10;
                    x /= 10;

                    int mappedDigit = mapping[digit];
                    digits.add(mappedDigit);
                }

                // Reconstruct the transformed number in correct order
                for (int j = digits.size() - 1; j >= 0; j--) {
                    transformedNum = transformedNum * 10 + digits.get(j);
                }
            }

            // Store the original number and its transformed value
            entryList.add(new AbstractMap.SimpleEntry<>(num, transformedNum));
        }

        // Sort the list based on transformed values
        entryList.sort(Map.Entry.comparingByValue());

        // Extract the sorted original numbers into the result array
        int[] res = new int[nums.length];
        for (int i = 0; i < entryList.size(); i++) {
            res[i] = entryList.get(i).getKey();
        }

        return res;
    }
}