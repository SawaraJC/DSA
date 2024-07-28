class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        pos = []
        neg = []

        for num in nums:
            if num>0:
                pos.append(num)
            elif num <= 0:
                neg.append(num)
        n = len(pos)
        res = []

        for i in range(0,n):
            res.append(pos[i])
            res.append(neg[i])

        return res



        