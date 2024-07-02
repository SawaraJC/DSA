class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = inf
        sell = 0

        for i in prices:
            buy = min(buy, i)
            sell = max(sell, i-buy)


        return sell
        