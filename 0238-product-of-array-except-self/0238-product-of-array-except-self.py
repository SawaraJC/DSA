class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        #calculate product of array elements before a particular index and after the index
        #then multiply both of themto get answer

        #here, we will use two-pass method
        res = [1]*len(nums)

        #first pass: scan through array and store prefixes
        prefix = 1
        for i in range(len(nums)):
            res[i] *= prefix
            prefix *= nums[i]

        #second pass: scan from back of the array and update res values
        postfix = 1
        for i in range(len(nums)-1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]

        return res







        