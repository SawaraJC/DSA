class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        ans = set()
        
        for i in range(len(nums)):
            if (nums[i] in ans):
                return True

            else:
                ans.add(nums[i])

        return False

        