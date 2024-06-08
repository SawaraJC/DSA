class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        ans = []
        count = defaultdict(int)

        for number in nums:
            count[number] += 1

        # print(count)
        sorts = sorted(count.items(), key=lambda item:item[1], reverse = True)

        # print(sorts)
        top = [key for key, value in sorts[:k]]

        return top



        