class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        QuickSort(nums, low, high);
    }

    public void QuickSort(int arr[], int low, int high){
        if(low<high){
            int pm = partition(arr,low, high);

            QuickSort(arr, low, pm-1);
            QuickSort(arr, pm, high);
        }
    }

    public int partition(int arr[], int low, int high){
        int i = low;
        int j = high;

        int pivot = arr[low+(high-low)/2];

        while(i<=j){
            while(arr[i]<pivot){
                i++;
            }

            while (arr[j]>pivot){
                j--;
            }

            if(i<=j){
                swap(arr, i , j);
                i++;
                j--;
            }
        }

        return i;
    }

    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}