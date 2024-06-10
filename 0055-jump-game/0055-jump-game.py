class Solution:
    def canJump(self, nums: List[int]) -> bool:
        max_idx = 0  # The farthest index we can reach

        for i in range(len(nums)):
            if i > max_idx:
                # If the current index is beyond the farthest reachable index, return False
                return False
            # Update the farthest reachable index
            max_idx = max(max_idx, i + nums[i])
            if max_idx >= len(nums) - 1:
                # If we can reach or go beyond the last index, return True
                return True

        # If we exit the loop, it means we checked all indices and can reach the last one
        return True




            
            