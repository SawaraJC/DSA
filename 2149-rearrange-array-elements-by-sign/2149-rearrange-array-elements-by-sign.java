class Solution {
    public int[] rearrangeArray(int[] nums) {
      int arr[]=new int[nums.length];//to store result array
        int j=0;//to point even position 
        int k=1;//to point odd position
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]>0)//this if statement add positive number at even position
           {
               arr[j]=nums[i];
               j+=2; //j=0,2,4,6,8
           }
           else{
               arr[k]=nums[i];//add negetive number at odd position
               k+=2;//k=1,3,5,7,9
           }
       }
       return arr; //return array 
        
    }
}