class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m+n;
        int i=0, key=0;

        while(m<size && i<n){
            nums1[m] = nums2[i];
            m++;
            i++;
        }

        for (int a=1;a<size; a++){
            key = nums1[a];
            int j= a-1;

            while (j>=0 && nums1[j]>key){
                nums1[j+1] = nums1[j];
                j= j-1;
            }
            nums1[j+1] = key;
        }

        // for (int j=0; j<size; j++)
        //     System.out.print(nums1[j]);
    }
}