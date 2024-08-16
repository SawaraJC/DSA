// import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort the greed factors and cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);
        
        int count = 0; // To count the number of content children
        int i = 0; // Pointer for greed factors (children)
        int j = 0; // Pointer for cookie sizes
        
        // Use two-pointer technique to find the maximum content children
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                i++;
            }
            j++;
        }
        
        return count;
    }
}
