class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        if (arr.length == 2){
            return true;
        }

        int diff = arr[1]-arr[0];
        int arr_diff = 0;

        for (int i=1; i<arr.length-1; i++){
            arr_diff = arr[i+1] - arr[i];
            if(arr_diff != diff){
                return false;
            }
        }   

        return true;
    }
}