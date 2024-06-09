class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        count = 0
        prefix = 0
        prefix_map = {0: 1}

        for num in nums:
            prefix += num
            mod = prefix % k

            if mod < 0:
                mod += k

            if mod in prefix_map:
                count += prefix_map[mod]
                prefix_map[mod] += 1
            else:
                prefix_map[mod] = 1


        return count            


        