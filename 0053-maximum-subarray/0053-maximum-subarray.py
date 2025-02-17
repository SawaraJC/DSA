class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # n = len(nums)
        # maxi = -inf
        # sums = 0

        # for i in range(n):
        #     sums += nums[i]

        #     if sums > maxi:
        #         maxi = sums

        #     if sums < 0:
        #         sums = 0

        # return maxi
        n = len(nums)
        maxi = -inf
        sums = 0
        for i in range(n):
            sums += nums[i]

            if sums > maxi:
                maxi = sums

            if sums < 0:
                sums = 0

        return maxi
        