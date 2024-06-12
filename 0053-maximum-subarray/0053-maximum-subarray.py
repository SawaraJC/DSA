class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        mins = -inf
        sum = 0

        for i in range(0,n):
            sum += nums[i]

            if sum>mins:
                mins = sum 

            if sum < 0:
                sum = 0

        return mins

            
        