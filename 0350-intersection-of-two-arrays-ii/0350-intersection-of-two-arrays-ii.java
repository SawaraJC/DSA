class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Count the frequency of each element in nums1
        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Check the intersection while considering frequency
        for (int num : nums2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                result.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        // Convert ArrayList to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}