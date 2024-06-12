class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None
        """
        # Pointers for the current element, the boundary of 0s, and the boundary of 2s
        current = 0
        p0 = 0
        p2 = len(nums) - 1
        
        # Traverse through the list
        while current <= p2:
            if nums[current] == 0:
                nums[current], nums[p0] = nums[p0], nums[current]
                p0 += 1
                current += 1
            elif nums[current] == 2:
                nums[current], nums[p2] = nums[p2], nums[current]
                p2 -= 1
            else:
                current += 1

